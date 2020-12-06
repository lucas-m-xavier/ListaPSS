/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufes.q_02.builder;

import ufes.q_02.decorator.Elemento;

/**
 *
 * @author Lucas
 */
public class Diretor {
    
    private LancheBuilder lancheBuilder;

    public Diretor(LancheBuilder lancheBuilder) {
        this.lancheBuilder = lancheBuilder;
    }
    
    public Elemento criar() {
        this.lancheBuilder.criarLanche();
        this.lancheBuilder.addIngrediente();
        return this.lancheBuilder.getLanche();
    }
}
