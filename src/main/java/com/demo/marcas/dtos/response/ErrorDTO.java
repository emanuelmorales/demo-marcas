package com.demo.marcas.dtos.response;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ErrorDTO {
    private String mensajeError;
    private List<String> mensajes;
    private Integer status;
}
