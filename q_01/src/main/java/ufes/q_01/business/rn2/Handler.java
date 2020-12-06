/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufes.q_01.business.rn2;

/**
 *
 * @author Lucas
 */
public abstract class Handler {
    
    private final Handler proximo;
    
    private final String tag;

    public Handler(Handler proximo, String tag) {
        this.proximo = proximo;
        this.tag = tag;
    }
    
    public String verificaTag(String mensagem) {
        if(mensagem.contains(tag)) return "Mensagem imprópria!";
        
        if(this.proximo != null) return proximo.verificaTag(mensagem);
        
        return mensagem;
    }
}
