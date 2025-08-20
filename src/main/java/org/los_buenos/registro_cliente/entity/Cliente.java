package org.los_buenos.registro_cliente.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor; // Se corrigió el error tipográfico aquí
import lombok.ToString;
import lombok.EqualsAndHashCode;


@Entity(name = "Clientes")
//Lombok
@Data // Generar los setters y getters
@NoArgsConstructor // El constructor vacío
@AllArgsConstructor // El constructor completo
@ToString // El método sobrecargado toString
@EqualsAndHashCode // El método para trabajar con HashCode

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