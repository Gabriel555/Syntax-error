/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.modelo;

import java.io.Serializable;

/**
 *
 * @author root
 */
public class Cliente implements Serializable{
    private Integer numCliente;
    private Persona persona;
    

    public Cliente(Integer numCliente, Persona persona) {
        this.numCliente = numCliente;
        this.persona = persona;
        
    }

    public Integer getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(Integer numCliente) {
        this.numCliente = numCliente;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }


    @Override
    public String toString() {
        return "Cliente{" + "numCliente=" + numCliente + ", persona=" + persona + '}';
    }
}
