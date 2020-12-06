/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufes.q_01.business.rn1;

/**
 *
 * @author Lucas
 */
public class UtilitarioString {
    private static UtilitarioString instance = null;

    private UtilitarioString() {
    }
    
    public String substitui(String texto, String palavra, CharSequence simbolo) {
        if (texto.isEmpty()) throw  new RuntimeException("Texto não pode ser vazio!");
        
        if(!texto.contains(palavra)) throw new RuntimeException("O texto inserido não possui a palavra " + palavra + "!");
        
        String replace = simbolo.toString().repeat(palavra.length());
        
        texto = texto.replace(palavra, replace);
        
        return texto;
    }
    
    public static UtilitarioString getInstance() {
        if(instance == null) {
            instance = new UtilitarioString();
        }
        return instance;
    }
}
