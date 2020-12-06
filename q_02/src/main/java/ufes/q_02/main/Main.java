/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufes.q_02.main;

import ufes.q_02.builder.Diretor;
import ufes.q_02.builder.LancheAmericano;
import ufes.q_02.builder.LancheBeirute;
import ufes.q_02.decorator.Elemento;

/**
 *
 * @author Lucas
 */
public class Main {
    public static void main(String[] args) {
        Diretor d1 = new Diretor(new LancheAmericano());
        Elemento lanche1 = d1.criar();
        
        System.out.println("Americano: \n" + lanche1.getDescricao() + "\nValor do lanche:" + lanche1.getValor());
        
        d1 = new Diretor(new LancheBeirute());
        Elemento lanche2 = d1.criar();
        System.out.println("Beirute: \n" + lanche2.getDescricao() + "\nValor do lanche:" + lanche2.getValor());
    }
}
