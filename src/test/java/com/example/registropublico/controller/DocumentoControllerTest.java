package com.example.registropublico.controller;

import com.example.registropublico.model.Documento;
import org.junit.Test;

import javax.swing.text.Document;

import static org.junit.Assert.*;

public class DocumentoControllerTest {

    @Test
    public void postSaveDocument() {
    }
    @Test
    public void dniDigitLimit(){
        Documento d = new Documento();
        d.setNro_identificacion("12345678");
        assertTrue(d.dniDigitLimit()==true);
    }
    @Test
    public void pasaporteDigitLimit(){
        Documento d = new Documento();
        d.setNro_identificacion("1234567");
        assertTrue(d.pasaporteDigitLimit()==true);
    }
}