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
public abstract class Censura {
    protected String palavra;

    public String censurar(String mensagem) {
        if(!mensagem.contains(this.palavra)) return mensagem;
        return UtilitarioString.getInstance().substitui(mensagem, this.palavra, "*");
    }
}
