package com.course.ada;

import com.course.ada.enums.Alimentacao;
import com.course.ada.enums.Classificacao;
import com.course.ada.model.Elefante;
import com.course.ada.model.Gaviao;
import com.course.ada.model.Leao;
import com.course.ada.model.Macaco;
import com.course.ada.model.commons.Animal;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Animal> animais = createAnimais();

        List<Animal> carnivoros = animais
                .stream()
                .filter(animal -> Alimentacao.CARNIVORO.equals(animal.getTipoAlimento()))
                .collect(Collectors.toList());

        List<Animal> onivoros = animais
                .stream()
                .filter(animal -> Alimentacao.ONIVORO.equals(animal.getTipoAlimento()))
                .collect(Collectors.toList());

        List<Animal> herbivoros = animais
                .stream()
                .filter(animal -> Alimentacao.HERBIVORO.equals(animal.getTipoAlimento()))
                .collect(Collectors.toList());

        List<Animal> aves = animais
                .stream()
                .filter(animal -> Classificacao.AVE.equals(animal.getClassificacao()))
                .collect(Collectors.toList());

        Optional<Animal> compareTo = animais
                        .stream()
                        .max(Comparator.comparingInt(Animal::getPeso));

        System.out.println("Animais carnívoros: " + carnivoros);
        System.out.println("Animais onívoros: " + onivoros);
        System.out.println("Animais herbívoros: " + herbivoros);
        System.out.println("Aves: " + aves);
        System.out.println("Maior peso: " + compareTo);

    }

    private static List<Animal> createAnimais() {

        Macaco macaco = new Macaco("62cm", Classificacao.MAMIFERO, 11, Alimentacao.ONIVORO);
        Gaviao gaviao = new Gaviao("67cm", Classificacao.AVE, 290, Alimentacao.HERBIVORO);
        Leao leao = new Leao("180cm", Classificacao.MAMIFERO, 190, Alimentacao.CARNIVORO);
        Elefante elefante = new Elefante("280cm", Classificacao.MAMIFERO, 4000, Alimentacao.HERBIVORO);

        return List.of(macaco, gaviao, leao, elefante);

    }
}