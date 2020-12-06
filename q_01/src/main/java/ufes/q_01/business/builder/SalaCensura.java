/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufes.q_01.business.builder;

import ufes.q_01.business.proxy.ProxySemMarcas;
import ufes.q_01.model.SalaChat;

/**
 *
 * @author Lucas
 */
public class SalaCensura extends SalaBuilder{

    @Override
    public void criarSala() {
        this.setProxy(new ProxySemMarcas());
        this.setSala(new SalaChat());
    }
    
}
