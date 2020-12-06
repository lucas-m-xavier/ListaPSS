/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufes.q_01.model;

/**
 *
 * @author Lucas
 */
public class ParticipanteChat extends Participante{
    private final String name;

    public ParticipanteChat(String name, MediatorChat chatMediator) {
        this.name = name;
        this.mediator = chatMediator;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void enviar(String message) {
        this.mediator.enviar(this, message);
    }

    @Override
    public void receber(String message, Participante participante) {
        System.out.println(participante.getName()+": "+ message);
    }
}
