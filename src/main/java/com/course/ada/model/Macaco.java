package com.course.ada.model;

import com.course.ada.enums.Alimentacao;
import com.course.ada.enums.Classificacao;
import com.course.ada.model.commons.Animal;
import lombok.Builder;
import lombok.Getter;

@Getter
public class Macaco extends Animal {

    public Macaco(String tamanho, Classificacao classificacao, Integer peso, Alimentacao tipoAlimento) {
        super(tamanho, classificacao, peso, tipoAlimento);
    }

}
