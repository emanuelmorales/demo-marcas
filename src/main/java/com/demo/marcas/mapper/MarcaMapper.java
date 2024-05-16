package com.demo.marcas.mapper;

import com.demo.marcas.dtos.response.MarcaDTO;
import com.demo.marcas.model.Marca;
import org.springframework.stereotype.Component;

//hscemos que se aun component para poder inyectarlo con spring
@Component
public class MarcaMapper {

    public MarcaDTO toDTO(Marca model){
        //Aqui copiamos y pegamosla parte del mapper con MarcaService
        MarcaDTO dto = new MarcaDTO();
        dto.setDescripcion(model.getDescripcion());
        dto.setIdMarca(model.getIdMarca());

        return dto;
    }
}
