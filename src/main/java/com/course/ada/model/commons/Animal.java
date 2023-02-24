package com.course.ada.model.commons;

import com.course.ada.enums.Alimentacao;
import com.course.ada.enums.Classificacao;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Animal {

    private String tamanho;
    private Classificacao classificacao;
    private Integer peso;
    private Alimentacao tipoAlimento;

}
