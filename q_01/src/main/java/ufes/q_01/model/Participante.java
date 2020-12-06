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
public abstract class Participante {
    protected MediatorChat mediator;
    
    public abstract String getName();
    public abstract void enviar(String message);
    public abstract void receber(String message, Participante participante);
}
