package com.demo.marcas.Controller;

import com.demo.marcas.dtos.response.GetMarcasResponseDTO;
import com.demo.marcas.service.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class MarcaController {

    @Autowired
    private MarcaService marcaService;
    @GetMapping("/marcas")
    public GetMarcasResponseDTO getMarcas(){
        return marcaService.getMarcas();
    }
}
