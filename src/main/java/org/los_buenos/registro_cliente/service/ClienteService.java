package org.los_buenos.registro_cliente.service;
import org.los_buenos.registro_cliente.entity.Cliente;
import org.los_buenos.registro_cliente.repository.ClienteRepository;

//inyectar dependencia
import org.springframework.beans.factory.annotation.Autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService implements IClienteService{

    @Autowired
private ClienteRepository clienteRepository;

    public List<Cliente> listarClientes() {
        List<Cliente> clientes = clienteRepository.findAll();
        return clientes;
    }

@Override
    public Cliente buscarClienteporId(Integer codigo) {
        Cliente cliente = clienteRepository.findById(codigo).orElse( null);
        return cliente;
    }
@Override
    public void guardarCliente(Cliente cliente) {
     clienteRepository.save(cliente);
    }

    public void eliminarCliente(Cliente cliente) {
clienteRepository.delete(cliente);
    }
}
