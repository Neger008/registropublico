package com.example.registropublico.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "document")
public class Documento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nro_identificacion;
    private String sex;
    private String age;
    private String type;
    @JoinColumn(name = "applicant_person", referencedColumnName = "id")
    @ManyToOne
    private Person applicant_person;
    @JoinColumn(name = "reference_person", referencedColumnName = "id")
    @ManyToOne
    private Person reference_person;

    public Documento(Integer id) {
        this.id = id;
    }
    public Documento(){}

    public boolean dniDigitLimit(){
        System.out.println(nro_identificacion.length());
        return (nro_identificacion.length()>8)? false:true;
    }
    public boolean pasaporteDigitLimit(){
        System.out.println(nro_identificacion.length());
        return (nro_identificacion.length()>10)? false:true;
    }

}
