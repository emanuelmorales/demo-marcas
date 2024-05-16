package com.demo.marcas.dtos.response;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class GetMarcasResponseDTO {
    private List<MarcaDTO> marcas;
}
