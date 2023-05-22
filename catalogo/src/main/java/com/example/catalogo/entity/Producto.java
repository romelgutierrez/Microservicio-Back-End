package com.example.catalogo.entity;


import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String descripcion;
    private String precio;
    private String marca;
    private String modelo;
}