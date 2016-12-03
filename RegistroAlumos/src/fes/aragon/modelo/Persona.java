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
public class Persona implements Serializable{
    private String nombre;
    private String aPaterno;
    private String aMaterno;
    private String Correo1;
    private String Correo2;
    private int edad;
    private String Sexo;
    private int CP;
    private int Telefono;
    private String PaginaPersonal;

    public Persona(String nombre, String aPaterno, String aMaterno, String Correo1,String Correo2, int edad, 
            String Sexo, int CP, int Telefono, String PaginaPersonal ) {
        this.nombre = nombre;
        this.aPaterno = aPaterno;
        this.aMaterno = aMaterno;
        this.Correo1 = Correo1;
        this.Correo2 = Correo2;
        this.edad = edad;
        this.Sexo = Sexo;
        this.CP = CP;
        this.Telefono = Telefono;
        this.PaginaPersonal = PaginaPersonal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getaPaterno() {
        return aPaterno;
    }

    public void setaPaterno(String aPaterno) {
        this.aPaterno = aPaterno;
    }

    public String getaMaterno() {
        return aMaterno;
    }

    public void setaMaterno(String aMaterno) {
        this.aMaterno = aMaterno;
    }
    
    public String getCorreo1() {
        return Correo1;
    }

    public void setCorreo1(String Correo1) {
        this.Correo1 = Correo1;
        
    }public String getCorreo2() {
        return Correo2;
    }

    public void setCorreo2(String Correo2) {
        this.Correo2 = Correo2;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }
    
    public int getCP() {
        return CP;
    }

    public void setCP(int CP) {
        this.CP = CP;
    }
    
    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }
    
    public String PaginaPersonal() {
        return PaginaPersonal;
    }

    public void setPaginaPersonal(String PaginaPersonal) {
        this.PaginaPersonal = PaginaPersonal;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", aPaterno=" + aPaterno + ", aMaterno=" + aMaterno + ", Correo1=" + Correo1 
                +", Correo2=" + Correo2 + ", edad=" + edad + ", Sexo=" + Sexo + ", CP=" + CP + ", Telefono=" + Telefono 
                + ", PaginaPersonal=" +   PaginaPersonal +'}';
    }
    
    
    
}
