/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mackenzie.voto;

/**
 *
 * @author Gustavo
 */
public class classificadorEleitor {
    
    public String classificarEleitor(int fnInIdade)
    {
        String fnOutclassificacao = "";
        
        if ((fnInIdade < 0) || (fnInIdade > 130)) {
            fnOutclassificacao = "Idade Invalida";
        }
        else if ((fnInIdade >= 0) && (fnInIdade <= 15)) {
            fnOutclassificacao = "Nao Permitido";
        }
        else if (((fnInIdade >= 16) && (fnInIdade <= 17)) || 
                ((fnInIdade >= 70) && (fnInIdade <= 130))) {
            fnOutclassificacao = "Facultativo";
        }
        else if ((fnInIdade >= 18) && (fnInIdade <= 69)) {
            fnOutclassificacao = "Obrigatorio";
        }
        
        return fnOutclassificacao;
    }
    
    
}
