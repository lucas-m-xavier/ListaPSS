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
public class Ingrediente extends LancheDecorator{

    public Ingrediente(Elemento elemento, double valor, String descricao) {
        super(elemento, valor, descricao);
    }
    
    @Override
    public double getValor() {
        return this.getElementoValor() + this.valor;
    }
    
    @Override
    public String getDescricao() {
        return this.getElementoDescricao() + this.descricao;
    }
}
