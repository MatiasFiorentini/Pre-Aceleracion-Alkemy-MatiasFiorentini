package com.alkemy.disney.disney.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class PeliculaBasicDTO {

    private Long id;
    private String imagen;
    private String titulo;
    private LocalDate fechaCreacion;
}
