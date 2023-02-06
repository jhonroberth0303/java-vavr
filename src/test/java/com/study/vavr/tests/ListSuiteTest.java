package com.study.vavr.tests;

import io.vavr.collection.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ListSuiteTest {

    // Probar mutabilidad
    @Test
    public void list(){
        java.util.List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);

        // Filtramos la lista
        java.util.List<Integer> filtro = new ArrayList<>();
        for (Integer i :lista){
            if(i < 3){
                filtro.add(i);
            }
        }

        // Mutamos la lista
        java.util.List<Integer> transformar = new ArrayList<>();
        for(Integer i : filtro){
            transformar.add(i + i);
        }

        Integer total = 0;
        for(Integer i : transformar){
            total += i;
        }

        Integer resultado = 6;

        Assertions.assertEquals(resultado, total);

    }

    @Test
    public void testListOf(){
        List<Integer> lista = List.of(1, 2, 3, 4, 5);
        Assertions.assertEquals(5, lista.size());
    }

    @Test void testListRange(){
        List<Integer> lista = List.range(0,10);
        Assertions.assertEquals(10, lista.size());

        List<Integer> rangoCerrado = List.range(0,9);
        Assertions.assertEquals(10, rangoCerrado.size());
    }

    

}
