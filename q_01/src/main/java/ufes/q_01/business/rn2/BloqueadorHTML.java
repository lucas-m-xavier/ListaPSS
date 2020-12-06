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
public class BloqueadorHTML {
    public Handler primeiro;

    public BloqueadorHTML() {
        this.primeiro = new HandlerAHref();
    }
    
    public String aplicarBloqueio(String mensagem) {
        return primeiro.verificaTag(mensagem);
    }
}
