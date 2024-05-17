package com.demo.marcas.Controller;

import com.demo.marcas.dtos.request.CrearMarcaRequestDto;
import com.demo.marcas.dtos.response.GetMarcasResponseDTO;
import com.demo.marcas.dtos.response.MarcaDTO;
import com.demo.marcas.service.MarcaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@Validated
public class MarcaController {

    @Autowired
    private MarcaService marcaService;
    @GetMapping("/marcas")
    public GetMarcasResponseDTO getMarcas(){
        return marcaService.getMarcas();
    }

    @PostMapping("/marcas")
    //definimos el metodo que va a crear la marca del tipo MarcaDto y se debe pasar un @Request Body para enviar los datos para crear la marca
    public MarcaDTO crearMarca(@Valid @RequestBody CrearMarcaRequestDto request){
        return marcaService.crearMarca(request);
    }
}
