package org.los_buenos.registro_cliente.repository;

import org.los_buenos.registro_cliente.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
    //puede sustituir al dao
    //una interfaz que tiene los métodos genericos del CRUD o mantenimiento

}
