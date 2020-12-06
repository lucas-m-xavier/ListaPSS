/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufes.q_01.business.proxy;

import ufes.q_01.business.rn2.BloqueadorHTML;
import ufes.q_01.model.Participante;

/**
 *
 * @author Lucas
 */
public class ProxyHTML extends Proxy{
    
    private BloqueadorHTML bloqueadorHTML;

    public ProxyHTML() {
        this.bloqueadorHTML = new BloqueadorHTML();
    }

    @Override
    public void enviar(Participante participante, String mensagem) {
        this.getReal().enviar(participante, bloqueadorHTML.aplicarBloqueio(mensagem));
    }
}
