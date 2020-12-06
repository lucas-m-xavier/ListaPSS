/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufes.q_03.builder;

import ufes.q_03.composite.CPU;
import ufes.q_03.composite.Computador;
import ufes.q_03.composite.HardDisk;
import ufes.q_03.composite.Memoria;
import ufes.q_03.composite.PlacaMae;

/**
 *
 * @author Lucas
 */
public class ComputadorBasico extends ComputadorBuilder {

    @Override
    public void adicionarPecas() {
        this.getComputador().adicionarPeca(new PlacaMae("G41-B", 200.50));
        this.getComputador().adicionarPeca(new Memoria("ddr3 4GB 1333mhz", 100));
        this.getComputador().adicionarPeca(new CPU("Intel core 2 quad Q6600", 10.99));
        this.getComputador().adicionarPeca(new HardDisk("Seagate 250GB", 80.90));
    }

    @Override
    public void criarComputador() {
        this.setComputador(new Computador("Computador basico OBRABO-1083"));
    }
}
