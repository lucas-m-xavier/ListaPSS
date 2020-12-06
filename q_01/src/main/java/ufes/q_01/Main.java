/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufes.q_01;

import ufes.q_01.business.builder.Diretor;
import ufes.q_01.business.builder.SalaCensura;
import ufes.q_01.business.builder.SalaSemHTML;
import ufes.q_01.business.proxy.Proxy;
import ufes.q_01.model.Participante;
import ufes.q_01.model.ParticipanteChat;

/**
 *
 * @author Lucas
 */
public class Main {
    public static void main(String[] args) {
        String textoMarcas = "Olá amigo, ficou sabendo que a Apple comprou uma grande parte da IBM graças a Microsoft"
                + " na ultima sexta?";
        String textoHTML = "<p> Estou escrevendo um parágrafo sobre algo muito interessante. </p>";
        
        Diretor diretor = new Diretor(new SalaCensura());
        
        Proxy proxy = diretor.build();
        
        Participante fulano = new ParticipanteChat("Fulano", proxy.getReal());
        Participante beltrano = new ParticipanteChat("Beltrano", proxy.getReal());
        Participante sicrano = new ParticipanteChat("Sicrano", proxy.getReal());
        
        proxy.getReal().criarParticipante(proxy.getReal(), fulano.getName());
        proxy.getReal().criarParticipante(proxy.getReal(), beltrano.getName());
        proxy.getReal().criarParticipante(proxy.getReal(), sicrano.getName());
        
        proxy.enviar(sicrano, textoMarcas);
        proxy.enviar(sicrano, textoHTML);
        
        diretor = new Diretor(new SalaSemHTML());
        
        proxy = diretor.build();
        
        proxy.getReal().criarParticipante(proxy.getReal(), fulano.getName());
        proxy.getReal().criarParticipante(proxy.getReal(), beltrano.getName());
        proxy.getReal().criarParticipante(proxy.getReal(), sicrano.getName());
        
        proxy.enviar(sicrano, textoHTML);
        proxy.enviar(sicrano, textoMarcas);
    }
}
