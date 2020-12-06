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
public interface MediatorChat {
    public void enviar(Participante participante, String mensage);
    public Participante criarParticipante(MediatorChat mediador, String name);
}
