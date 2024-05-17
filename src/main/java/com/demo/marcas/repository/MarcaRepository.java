package com.demo.marcas.repository;

import com.demo.marcas.model.Marca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MarcaRepository extends JpaRepository <Marca, Integer> {
    @Query("select m from Marca m where fechaBaja is null")
    List<Marca> findByFechaBajaIsNull();
}
