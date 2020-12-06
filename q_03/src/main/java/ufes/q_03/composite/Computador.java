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
public class Computador extends PecaComposite {
    
    public Computador(String descricao) {
        super(descricao, 0);
    }
    
    @Override
    public double getValor() {
        double precoComputador = 0;
        
        for(Peca p : this.getPecas()) {
            precoComputador += p.getValor();
        }
        
        return precoComputador;
    }
}
