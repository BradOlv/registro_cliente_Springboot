package org.los_buenos.registro_cliente.service;

import org.los_buenos.registro_cliente.entity.Cliente;
import java.util.List;

public interface IClienteService {
    public List <Cliente> listarClientes();
    public Cliente buscarClienteporId(Integer codigo);
    public void guardarCliente(Cliente cliente);
    public void eliminarCliente (Cliente cliente);
}
