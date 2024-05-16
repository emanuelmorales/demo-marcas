package com.demo.marcas.repository;

import com.demo.marcas.model.Marca;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MarcaRepository extends JpaRepository <Marca, Integer> {
    List<Marca> findByFechaBajaIsNull();
}
