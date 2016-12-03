/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.control;

import fes.aragon.modelo.Cliente;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.io.EOFException;

/**
 *
 * @author root
 */
public class Archivo {

    private File file;
    private String Archivo;
    private List<Cliente> lista
            = new ArrayList<Cliente>();

    public Archivo() {

    }

    public Archivo(File file, String Archivo) {
        super();
        this.file = file;
        this.Archivo = Archivo;
    }

    public Archivo(String Archivo) {
        this.Archivo = Archivo;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getArchivo() {
        return Archivo;
    }

    public void setArchivo(String Archivo) {
        this.Archivo = Archivo;
    }

    /*public void agregar(Cliente cliente) throws IOException {
        lista.add(cliente);
        guardar();
    }*/
    public void guardar(ArrayList<Cliente> cliente) {
        try {
            ObjectOutputStream fSalida = new ObjectOutputStream(new FileOutputStream(Archivo));
            for (Cliente cliente1 : cliente) {
                fSalida.writeObject(cliente1);
            }
            fSalida.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        /*File f = null; //:v
        f = new File("DatosCliente.dat");
        FileOutputStream fr = new FileOutputStream(f, false);
        ObjectOutputStream salida = new ObjectOutputStream(fr);
        salida.writeObject(lista);
        salida.close();
        fr.close();*/
    }
    public ArrayList<Cliente> leerCliente(){
        ArrayList<Cliente> Lista=new ArrayList<Cliente>();
        try {
            ObjectInputStream fLectura = new ObjectInputStream(new FileInputStream(Archivo));
            Object Temporal=fLectura.readObject();
            while (Temporal!=null) {
                if (Temporal instanceof Cliente) {
                    Lista.add((Cliente) Temporal);
                    Temporal=fLectura.readObject();
                }
                
            }
        } catch (EOFException eofe) {
            System.out.println("Final de Archivo");
        } catch (Exception e){
            e.printStackTrace();            
        }
        return Lista;
    }

    /*private void abrir() throws IOException, ClassNotFoundException {
        File f = null;
        f = new File("DatosCliente.dat");
        FileInputStream fs = new FileInputStream(f);
        ObjectInputStream ent = new ObjectInputStream(fs);
        lista = (List<Cliente>) ent.readObject();
        ent.close();
        for (Cliente cliente1 : lista) {
            System.out.println(cliente1);
        }

    }

    public List<Cliente> getLista() {
        return lista;
    }*/

}
