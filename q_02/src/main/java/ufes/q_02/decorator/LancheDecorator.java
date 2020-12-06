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
public class LancheDecorator extends Elemento{

    private final Elemento elemento;

    public LancheDecorator(Elemento elemento, double valor, String descricao) {
        this.setValor(valor);
        this.setDescricao(descricao);
        this.elemento = elemento;
    }
    
    public double getElementoValor() {
        return elemento.getValor();
    }
    
    public String getElementoDescricao() {
        return elemento.getDescricao();
    }
}
