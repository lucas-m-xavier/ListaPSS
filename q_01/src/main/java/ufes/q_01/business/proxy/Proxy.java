/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufes.q_01.business.proxy;

import ufes.q_01.model.MediatorChat;
import ufes.q_01.model.Participante;
import ufes.q_01.model.SalaChat;

/**
 *
 * @author Lucas
 */
public abstract class Proxy {
    private SalaChat real;
    
    public abstract void enviar (Participante participante, String mensagem);
    
    public Participante criarParticipante(MediatorChat mediador, String name) {
        return this.real.criarParticipante(mediador, name);
    }

    public SalaChat getReal() {
        return real;
    }

    public void setReal(SalaChat real) {
        this.real = real;
    }
}
