package com.example.registropublico.controller;


import com.example.registropublico.model.Documento;
import com.example.registropublico.model.Person;
import com.example.registropublico.model.extra.DocumentoRequest;
import com.example.registropublico.repository.DocumentoRepository;
import com.example.registropublico.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
@Controller
@RequestMapping("/document")
@RequiredArgsConstructor

public class DocumentoController {
    private final DocumentoRepository documentRepository;
    private final PersonRepository personRepository;

    @PostMapping("/save")
    public String postSaveDocument(@RequestBody DocumentoRequest staff) {
        Person person = new Person();
        person.setNombre(staff.getNombre());
        person.setApellido(staff.getApellido());
        person.setFecha_nacimiento(staff.getFecha_nacimiento());

        personRepository.save(person);
        Documento documento = new Documento();
        documento.setAge(staff.getEdad());
        documento.setSex(staff.getSexo());
        documento.setNro_identificacion(staff.getNro_identificacion());
        documento.setApplicant_person(person);
        documento.setReference_person(new Person(staff.getReference_person()));
        documento.setType(staff.getType());

        documentRepository.save(documento);
        return "greeting";
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", documentRepository.findAll());

        return "greeting";
    }

}
