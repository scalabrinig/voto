/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mackenzie.voto;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Gustavo
 */
public class classificadorEleitorTest {
    
    classificadorEleitor classificador;
    
    public classificadorEleitorTest() {
        classificador = new classificadorEleitor();
    }

    @Test
    public void testIdadeInvalida() {
        System.out.println("TestIdadeInvalida");
        assertEquals("Idade Invalida", classificador.classificarEleitor(-5));
        assertEquals("Idade Invalida", classificador.classificarEleitor(150));
        assertEquals("Idade Invalida", classificador.classificarEleitor(-1));
        assertEquals("Idade Invalida", classificador.classificarEleitor(-131));
    }
    
    @Test
    public void testNaoPermitido() {
        System.out.println("TestNaoPermitido");
        assertEquals("Nao Permitido", classificador.classificarEleitor(4));
        assertEquals("Nao Permitido", classificador.classificarEleitor(0));
        assertEquals("Nao Permitido", classificador.classificarEleitor(1));
        assertEquals("Nao Permitido", classificador.classificarEleitor(14));
        assertEquals("Nao Permitido", classificador.classificarEleitor(15));
    }
    
    @Test
    public void testFacultativo() {
        System.out.println("TestFacultativo");
        assertEquals("Facultativo", classificador.classificarEleitor(16));
        assertEquals("Facultativo", classificador.classificarEleitor(17));
        assertEquals("Facultativo", classificador.classificarEleitor(80));
        assertEquals("Facultativo", classificador.classificarEleitor(70));
        assertEquals("Facultativo", classificador.classificarEleitor(71));
        assertEquals("Facultativo", classificador.classificarEleitor(129));
        assertEquals("Facultativo", classificador.classificarEleitor(130));
    }
    
    @Test
    public void testObrigatorio() {
        System.out.println("TestObrigatorio");
        assertEquals("Obrigatorio", classificador.classificarEleitor(20));
        assertEquals("Obrigatorio", classificador.classificarEleitor(18));
        assertEquals("Obrigatorio", classificador.classificarEleitor(19));
        assertEquals("Obrigatorio", classificador.classificarEleitor(68));
        assertEquals("Obrigatorio", classificador.classificarEleitor(69));
    }
        
}
