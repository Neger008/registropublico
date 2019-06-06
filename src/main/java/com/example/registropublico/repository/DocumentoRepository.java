package com.example.registropublico.repository;

import com.example.registropublico.model.Documento;
import com.example.registropublico.model.extra.DocumentResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface DocumentoRepository extends JpaRepository<Documento, Integer> {

}
