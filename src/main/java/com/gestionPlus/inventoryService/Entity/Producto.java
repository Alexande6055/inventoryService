package com.gestionPlus.inventoryService.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Productos")
@Data
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProducto;
    @Column
    private String nombre;
    @Column
    private String descripcion;
    @Column
    private Long stock;

}
