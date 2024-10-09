package com.example.Api_Mascota.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;

@Data // Anotación para utilizar Lombook para setters y getters
@Entity
@Table // Anotación para crear tabla a partir de la entidad

public class Mascota {

    @Id //Anotación que indica que la entidad debe tener una Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // La Id será de generación automática
    private int num;

    private String nombre;
    private String sexo;
    private String color;
    private int tamaño;
    private boolean castracion;
    private int edad;

}
