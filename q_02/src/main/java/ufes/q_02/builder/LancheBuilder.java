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
public abstract class LancheBuilder {
    private Elemento lanche;

    public abstract void criarLanche();
    public abstract void addIngrediente();
    
    public Elemento getLanche() {
        return lanche;
    }

    public void setLanche(Elemento lanche) {
        this.lanche = lanche;
    }
}
