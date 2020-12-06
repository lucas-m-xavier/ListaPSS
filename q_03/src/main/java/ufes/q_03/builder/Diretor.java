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
public class Diretor {
    private ComputadorBuilder computadorBuilder;

    public Diretor(ComputadorBuilder computadorBuilder) {
        this.computadorBuilder = computadorBuilder;
    }
    
    public Computador builder() {
        this.computadorBuilder.criarComputador();
        this.computadorBuilder.adicionarPecas();
        return this.computadorBuilder.getComputador();
    }
}
