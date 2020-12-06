/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufes.q_03.composite;

import java.util.ArrayList;

/**
 *
 * @author Lucas
 */
public abstract class PecaComposite extends Peca {
    private ArrayList<Peca> pecas = new ArrayList<>();
    
    public PecaComposite(String descricao, double valor) {
        super(descricao, valor);
    }
    
    public void adicionarPeca(Peca peca) {
        this.pecas.add(peca);
    }

    public ArrayList<Peca> getPecas() {
        return pecas;
    }

    @Override
    public String toString() {
        return "PecaComposite{" + "pecas=" + pecas + '}';
    }
}
