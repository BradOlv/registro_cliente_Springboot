package org.los_buenos.registro_cliente.controller;

import jakarta.annotation.PostConstruct;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import lombok.Data;
import org.los_buenos.registro_cliente.entity.Cliente;
import org.los_buenos.registro_cliente.service.IClienteService;
import org.primefaces.PrimeFaces;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

//Componente generico
@Component
// alcance de tipo VIEW
@ViewScoped
//getter y setter de lombok
@Data
public class IndexController {

@Autowired
    IClienteService clienteService;
private List<Cliente> clientes;
private Cliente clienteSeleccionado;
private static Logger logger = LoggerFactory.getLogger(IndexController.class);

@PostConstruct
    public void init(){
    cargarDatos();
}
public void cargarDatos(){
    this.clientes = this.clienteService.listarClientes();
    this.clientes.forEach(cliente -> logger.info(cliente.toString()));
}

public void agregarCliente(){
    this.clienteSeleccionado = new Cliente();
}
public void guardarCliente(){
    //agregar
    logger.info("Cliente a guardar: "+ this.clienteSeleccionado);
    if (this.clienteSeleccionado.getCodigoCliente() ==null){
        this.clienteService.guardarCliente(this.clienteSeleccionado);
        this.clientes.add(this.clienteSeleccionado);
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage("Cliente agregado"));
    }
    //modificar
    else{
        this.clienteService.guardarCliente(this.clienteSeleccionado);
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage("Cliente actualizado"));
    }
    PrimeFaces.current().executeScript("PF('ventanaModalCliente').hide");
    PrimeFaces.current().ajax().update("formulario-clientes:mensaje-emergente",
            "formulario-clientes:tabla-clientes");
        this.clienteSeleccionado = null;
    }
    public void eliminarCliente(){
    logger.info("Cliente a eliminar: " + this.clienteSeleccionado);
    this.clienteService.eliminarCliente(this.clienteSeleccionado);
    //eliminar el registro de la lista de clientes
        this.clientes.remove(this.clienteSeleccionado);
        //reiniciar el objeto
        this.clienteSeleccionado = null;
        //confirmar acción
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage("Cliente eliminado"));
        PrimeFaces.current().ajax().update("formulario-clientes:mensaje-emergente",
                "formulario-clientes:tabla-clientes");
    }


}
