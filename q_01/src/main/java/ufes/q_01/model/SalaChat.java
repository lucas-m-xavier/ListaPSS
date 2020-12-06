/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufes.q_01.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lucas
 */
public class SalaChat implements MediatorChat{

    private List<Participante> participantes = new ArrayList<>();

    public SalaChat() {
    }
    
    //DUVIDA CLEAN CODE -> nome para o participante do foreach considerando que participante já percebe ao 
    //participante passado por parametro
    @Override
    public void enviar(Participante participante, String mensage) {
        for(Participante participant : this.participantes) {
            if(!participante.equals(participant)) 
                participant.receber(mensage, participante);
        }
    }

    @Override
    public Participante criarParticipante(MediatorChat mediador, String name) {
        Participante participante = new ParticipanteChat(name, mediador);
        this.participantes.add(participante);
        return participante;
    }
    
}
