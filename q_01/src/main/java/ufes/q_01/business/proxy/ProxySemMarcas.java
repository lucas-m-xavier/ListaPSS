/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufes.q_01.business.proxy;

import ufes.q_01.business.rn1.CensurasCollection;
import ufes.q_01.model.Participante;

/**
 *
 * @author Lucas
 */
public class ProxySemMarcas extends Proxy{

    private CensurasCollection censurasCollection;

    public ProxySemMarcas() {
        this.censurasCollection = new CensurasCollection();
    }
    
    @Override
    public void enviar(Participante participante, String mensagem) {
        this.getReal().enviar(participante, censurasCollection.aplicarCensura(mensagem));
    }
    
}
