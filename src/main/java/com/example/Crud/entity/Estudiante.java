package com.example.Crud.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table (name = "table_stdnt")

public class Estudiante {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    private long Id_estudiante;
    private String Nombre;
    private String Apellido;

    @Column (name = "Email", unique = true)
    private String email;






}
