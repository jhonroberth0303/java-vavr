package com.study.vavr.tests;

import com.study.vavr.interfaces.InterfaceGenerica;
import com.study.vavr.interfaces.MyInterface;
import com.study.vavr.model.dtos.PersonDTO;
import com.study.vavr.services.ProcessData;
import com.study.vavr.utils.Utilities;
import io.vavr.Function3;
import io.vavr.collection.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.function.Function;


public class LambdaTest {

    @Test
    public void testGenericosClaseAnonimaTradicional() {
        MyInterface claseAnonima = new MyInterface() {
            @Override
            public String apply(String arg) {
                return arg + " " + arg;
            }
        };

        Assertions.assertEquals("again again", claseAnonima.apply("again"));

    }

    @Test
    public void claseAnonimaActualGenerica(){
        InterfaceGenerica<String, String> claseAnonimaGenerica = texto -> texto + " " + texto;

        Assertions.assertEquals("strong strong", claseAnonimaGenerica.apply("strong"));
    }

    @Test
    public void testReferenciMetodo(){
        Function<String, String> metodo = this::metodo;
        Assertions.assertEquals("yes yes", metodo.apply("yes"));

    }

    private String metodo(String texto) {return texto + " " + texto;}

    @Test
    public void testReferenciaMetodoEstatico(){
        Function<String, String> metodo = Utilities::addSame;
        Assertions.assertEquals("rise rise", metodo.apply("rise"));
    }

    @Test
    public void testReferenciaMetodo(){
        Function<String, String> metodo = (new ProcessData())::addSame;
        Assertions.assertEquals("rise rise", metodo.apply("rise"));
    }

    @Test
    public void testMap(){
        List<String> listGreats = List.of("Hello", "Welcome", "Thanks").map(this::metodo);
        Assertions.assertEquals("Hello Hello", listGreats.head());
    }

    @Test
    public void testFunction3(){
        Function3<Integer, String , Integer, PersonDTO> constructor = PersonDTO::new;

        PersonDTO personDTO = constructor.apply(1083812237, "Jhon Roberth Fernandez", 35);
        Assertions.assertEquals(1083812237,personDTO.getDni());

    }
}
