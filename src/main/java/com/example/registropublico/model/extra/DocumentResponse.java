package com.example.registropublico.model.extra;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DocumentResponse {
    private Integer id;
    private String nombre;
    private String apellido;
    private String nro_identificacion;

    private String nombreReferencia;
}
