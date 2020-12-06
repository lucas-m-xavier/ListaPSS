/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufes.q_03.builder;

import ufes.q_03.composite.Computador;

/**
 *
 * @author Lucas
 */
public abstract class ComputadorBuilder {
    private Computador computador;

    public Computador getComputador() {
        return computador;
    }

    public void setComputador(Computador computador) {
        this.computador = computador;
    }
    
    public abstract void adicionarPecas();
    public abstract void criarComputador();
}
