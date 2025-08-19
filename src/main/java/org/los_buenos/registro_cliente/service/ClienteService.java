package org.los_buenos.registro_cliente.service;
import org.los_buenos.registro_cliente.entity.Cliente;
import org.los_buenos.registro_cliente.repository.ClienteRepository;

//inyectar dependencia
import org.springframework.beans.factory.annotation.Autowire;

import org.springframework.stereotype.Service;

import java.util.List;

public class ClienteService implements IClienteService{
    public List<Cliente> listarClientes() {
        return List.of();
    }

    public Cliente buscarClienteporId(Integer codigo) {
        return null;
    }

    public void guardarCliente(Cliente cliente) {

    }

    public void eliminarCliente(Cliente cliente) {

    }
}
