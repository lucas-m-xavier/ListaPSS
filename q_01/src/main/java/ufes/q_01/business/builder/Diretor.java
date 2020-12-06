/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufes.q_01.business.builder;

import ufes.q_01.business.proxy.Proxy;

/**
 *
 * @author Lucas
 */
public class Diretor {
    private SalaBuilder builder;

    public Diretor(SalaBuilder builder) {
        this.builder = builder;
    }
    
    public Proxy build() {
        builder.criarSala();
        return builder.getProxy();
    }    
}
