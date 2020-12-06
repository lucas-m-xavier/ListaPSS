/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufes.q_01.business.builder;

import ufes.q_01.business.proxy.ProxyHTML;
import ufes.q_01.model.SalaChat;

/**
 *
 * @author Lucas
 */
public class SalaSemHTML extends SalaBuilder {

    @Override
    public void criarSala() {
        this.setProxy(new ProxyHTML());
        this.setSala(new SalaChat());
    }
    
}
