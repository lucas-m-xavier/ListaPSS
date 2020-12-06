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
public class LancheBeirute extends LancheBuilder{
    @Override
    public void criarLanche() {
        this.setLanche(new Lanche());
    }

    @Override
    public void addIngrediente() {
        this.setLanche(new Ingrediente(this.getLanche(), 2, "Rosbife "));
        this.setLanche(new Ingrediente(this.getLanche(), 0.6, "Ovo Frito "));
        this.setLanche(new Ingrediente(this.getLanche(), 2, "Queijo "));
        this.setLanche(new Ingrediente(this.getLanche(), 0.5, "Alface "));
        this.setLanche(new Ingrediente(this.getLanche(), 0.6, "Tomate "));
    }
}
