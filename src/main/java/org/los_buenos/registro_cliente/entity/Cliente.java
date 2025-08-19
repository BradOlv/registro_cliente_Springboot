
package org.los_buenos.registro_cliente.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.toString;
import lombok.EqualsAndHashCode;


@Entity(name = "Clientes")
//Lombok
@Data//generar los seters y geters
@NoArgsConstructor//el constructor vacio
@AllArgsContructor //el constructorr lleno
@ToString//el metodo sobrecargado toString
@EqualsAndHashCode//el metodo para trabajar con HashCode// id interno para la clase

public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer codigoCliente;
private String nombre;
private String apellido;
private String telefono;
private String correo;
private String genero;
private Integer edad;
}
