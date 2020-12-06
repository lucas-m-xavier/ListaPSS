/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufes.q_02.builder;

import ufes.q_02.decorator.Ingrediente;
import ufes.q_02.decorator.Lanche;

/**
 *
 * @author Lucas
 */
public class LancheAmericano extends LancheBuilder{

    @Override
    public void criarLanche() {
        this.setLanche(new Lanche());
    }

    @Override
    public void addIngrediente() {
        this.setLanche(new Ingrediente(this.getLanche(), 1.50, "Pão brioche "));
        this.setLanche(new Ingrediente(this.getLanche(), 1, "Presunto "));
        this.setLanche(new Ingrediente(this.getLanche(), 0.5, "Ovo "));
        this.setLanche(new Ingrediente(this.getLanche(), 2, "Queijo "));
        this.setLanche(new Ingrediente(this.getLanche(), 0.3, "Alface "));
        this.setLanche(new Ingrediente(this.getLanche(), 0.8, "Maionese "));
        this.setLanche(new Ingrediente(this.getLanche(), 0.2, "Tomate "));
    }
}
