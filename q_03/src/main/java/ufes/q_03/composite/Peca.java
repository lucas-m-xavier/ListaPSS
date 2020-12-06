/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufes.q_03.composite;

/**
 *
 * @author Lucas
 */
public abstract class Peca {
    private final String descricao;
    
    private final double valor;

    public Peca(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Peca{" + "descricao=" + descricao + ", valor=" + valor + '}';
    }
}
