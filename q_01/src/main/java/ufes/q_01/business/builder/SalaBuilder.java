/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufes.q_01.business.builder;

import ufes.q_01.business.proxy.Proxy;
import ufes.q_01.model.SalaChat;

/**
 *
 * @author Lucas
 */
public abstract class SalaBuilder {
    private Proxy proxy;

    public abstract void criarSala();

    public Proxy getProxy() {
        return proxy;
    }
    
    public void setProxy(Proxy proxy) {
        this.proxy = proxy;
    }
    
    public void setSala(SalaChat real) {
        this.proxy.setReal(real);
    }
}
