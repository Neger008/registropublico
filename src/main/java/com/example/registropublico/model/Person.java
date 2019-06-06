package com.example.registropublico.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "persona")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String apellido;
    private String fecha_nacimiento;
    public Person(Integer id) {
        this.id = id;
    }
    public Person(){}
}
