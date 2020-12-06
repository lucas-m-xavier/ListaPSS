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
public class ComputadorGamer extends ComputadorBuilder {

    @Override
    public void adicionarPecas() {
        this.getComputador().adicionarPeca(new PlacaMae("Asus TUF B360-M plus gamming BR", 800.50));
        this.getComputador().adicionarPeca(new Memoria("4x ddr4 8GB 4133mhz", 2500.98));
        this.getComputador().adicionarPeca(new CPU("Intel core i9 9900KF", 4010.99));
        this.getComputador().adicionarPeca(new HardDisk("Seagate 2T", 580.90));
        this.getComputador().adicionarPeca(new PlacaVideo("Pcyes Geforce Rtx 3080 Graffiti Gaming Pro", 9300.50));
    }

    @Override
    public void criarComputador() {
        this.setComputador(new Computador("Computador GAMER pro RGB +FPS"));
    }
}
