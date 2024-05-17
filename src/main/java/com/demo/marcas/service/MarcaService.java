package com.demo.marcas.service;

import com.demo.marcas.dtos.request.CrearMarcaRequestDto;
import com.demo.marcas.dtos.response.GetMarcasResponseDTO;
import com.demo.marcas.dtos.response.MarcaDTO;
import com.demo.marcas.mapper.MarcaMapper;
import com.demo.marcas.model.Marca;
import com.demo.marcas.repository.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarcaService {
    @Autowired
    private MarcaRepository marcaRepository;
    @Autowired
    private MarcaMapper marcaMapper;

    public GetMarcasResponseDTO getMarcas(){
        List<Marca> marcas = marcaRepository.findByFechaBajaIsNull();

        //mapeamos la salida. pasando el mapper y llamano al método
        List<MarcaDTO> marcaDTO = marcas.stream().map(marcaMapper::toDTO).toList();

        GetMarcasResponseDTO response = new GetMarcasResponseDTO();
        response.setMarcas(marcaDTO);
        return response;
    }

    //CrearMarcaRequestDto controla que se esté pasando una descripción valida, no permite vacio
    public MarcaDTO crearMarca(CrearMarcaRequestDto request){
        //convierte el request al modelo Marca
        Marca nuevaMarca = marcaMapper.toModel(request);
        //guarda el request formateado a Marca
        nuevaMarca = marcaRepository.save(nuevaMarca);
        //devuelve la nueva marca guardad con el formato a mostrar
        return marcaMapper.toDTO(nuevaMarca);
    }

}
