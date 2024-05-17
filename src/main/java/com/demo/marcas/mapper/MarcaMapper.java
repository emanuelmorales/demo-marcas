package com.demo.marcas.mapper;

import com.demo.marcas.dtos.request.CrearMarcaRequestDto;
import com.demo.marcas.dtos.response.MarcaDTO;
import com.demo.marcas.model.Marca;
import org.springframework.stereotype.Component;

//hscemos que se aun component para poder inyectarlo con spring
@Component
public class MarcaMapper {

    //convierte el modelo recibido al MarcaDTO definido
    public MarcaDTO toDTO(Marca model){
        //configura el modelo recibido al DTO
        MarcaDTO dto = new MarcaDTO();
        dto.setDescripcion(model.getDescripcion());
        dto.setIdMarca(model.getIdMarca());

        return dto;
    }

    //convierte  el request al modelo Marca y devuelve el modelo
    public Marca toModel (CrearMarcaRequestDto request){
        Marca model = new Marca();
        model.setDescripcion(request.getDescripcion());

        return model;
    }
}
