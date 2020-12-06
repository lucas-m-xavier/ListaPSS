/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufes.q_03.main;

import ufes.q_03.builder.ComputadorGamer;
import ufes.q_03.builder.Diretor;
import ufes.q_03.builder.Servidor;
import ufes.q_03.composite.Computador;

/**
 *
 * @author Lucas
 */
public class Main {
    public static void main(String[] args) {
        Diretor diretor1 = new Diretor(new Servidor());
        
        Computador c1 = diretor1.builder();
        
        diretor1 = new Diretor(new ComputadorGamer());
        
        Computador c2 = diretor1.builder();
        
        System.out.println(c1.getDescricao() + "\n" + c1.getPecas() + "\nValor Total:" + c1.getValor() + "\n");
        System.out.println(c2.getDescricao() + "\n" + c2.getPecas() + "\nValor Total:" + c2.getValor());
    }
}
