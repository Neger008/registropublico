package com.example.registropublico.model.extra;

import lombok.Data;

@Data
public class DocumentoRequest {
    private Integer id;
    private String nombre;
    private String apellido;
    private String nro_identificacion;
    private String fecha_nacimiento;
    private String sexo;
    private String edad;
    private String type;
    private Integer applicant_person;
    private Integer reference_person;
}
