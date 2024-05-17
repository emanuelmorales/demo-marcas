package com.demo.marcas.dtos.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CrearMarcaRequestDto {
    @NotBlank
    private String descripcion;

}
