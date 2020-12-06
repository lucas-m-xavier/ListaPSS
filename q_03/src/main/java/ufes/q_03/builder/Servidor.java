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
import ufes.q_03.composite.PlacaVideo;

/**
 *
 * @author Lucas
 */
public class Servidor extends ComputadorBuilder {

    @Override
    public void adicionarPecas() {
        this.getComputador().adicionarPeca(new PlacaMae("PowerEdge T140 MLK Motherboard, BCC", 800.50));
        this.getComputador().adicionarPeca(new Memoria("8x ddr4 4GB 3600mhz", 2500.98));
        this.getComputador().adicionarPeca(new CPU("Intel Xeon E-2224 turbo", 1730.99));
        this.getComputador().adicionarPeca(new HardDisk("Seagate 4T", 970.90));
    }

    @Override
    public void criarComputador() {
        this.setComputador(new Computador("PowerEdge ABC1382"));
    }
}
