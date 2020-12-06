/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufes.q_02.decorator;

/**
 *
 * @author Lucas
 */
public class Lanche extends Elemento{

    public Lanche() {
    }
    
    @Override
    public double getValor() {
        return 0;
    }

    @Override
    public String getDescricao() {
        return "lanche com: ";
    }
    
}
