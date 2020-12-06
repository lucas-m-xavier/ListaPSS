/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufes.q_01.business.rn1;

import java.util.ArrayList;
import ufes.q_01.business.rn1.Censura;
import ufes.q_01.business.rn1.CensuraApple;
import ufes.q_01.business.rn1.CensuraIBM;
import ufes.q_01.business.rn1.CensuraMicrosoft;

/**
 *
 * @author Lucas
 */
public class CensurasCollection {
    private ArrayList<Censura> censuras = new ArrayList<>();

    public CensurasCollection() {
        censuras.add(new CensuraIBM());
        censuras.add(new CensuraApple());
        censuras.add(new CensuraMicrosoft());
    }
    
    public String aplicarCensura(String mensagem) {
        String mensagemFinal = mensagem;
        
        for(Censura censura : censuras) 
            mensagemFinal = censura.censurar(mensagemFinal);
        
        return mensagemFinal;
    }
        
}
