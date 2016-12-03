/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.utilerias;

import fes.aragon.control.Archivo;
import fes.aragon.modelo.Cliente;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author root
 */
public class Tabla implements TableModel {
    ArrayList<Cliente> datos;

    public Tabla() {
        datos= new ArrayList<Cliente>();
    }

    public Tabla(ArrayList<Cliente> datos) {
        this.datos = datos;
    }

    public ArrayList<Cliente> getDatos() {
        return datos;
    }

    public void setDatos(ArrayList<Cliente> datos) {
        this.datos = datos;
    }

    
    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return 10;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Cliente cliente = datos.get(rowIndex);
        //String dato = null;
        switch (columnIndex) {
            case 0:
                return cliente.getPersona().getNombre();
            case 1:
                 return cliente.getPersona().getaPaterno();
                
            case 2:
                 return cliente.getPersona().getaMaterno();
                
            case 3:
                return cliente.getPersona().getCorreo1();
                
            case 4:
                return cliente.getPersona().getCorreo2();
                
            case 5:
                return Integer.toString(cliente.getPersona().getEdad());
                
            case 6:
                return cliente.getPersona().getSexo();
                
            case 7:
                return Integer.toString(cliente.getPersona().getCP());
                
            case 8:
                return Integer.toString(cliente.getPersona().getTelefono());
                
            case 9:
                return cliente.getPersona().PaginaPersonal();
                
            default: 
                break;
            
        }
        return null;

    }

    @Override
    public String getColumnName(int columnIndex) {
			String colName="";
			switch (columnIndex) {
			case 0:
				colName="Nombre";
				break;
			case 1:
				colName="Apellido Paterno";
				break;
			case 2:
				colName="Apellido Materno";
				break;
			case 3:
				colName="correo1";
				break;
			case 4:
				colName="correo2";
				break;
			case 5:
				colName="Edad";
				break;
                        case 6:
				colName="Sexo";
				break;
                        case 7:
				colName="C.P";
				break;
                        case 8:
				colName="Telefono";
				break;
                        case 9:
				colName="Pagina Personal";
				break;
			default:
			case 10:
				colName="ND";
				break;

			}
			return colName;
		}


    @Override
    public Class<?> getColumnClass(int columnIndex) {
			switch (columnIndex) {
			case 0:
				return String.class;
			case 1:
				return String.class;
			case 2:
				return String.class;
			case 3:
				return Integer.class;
			case 4:
				return String.class;
			case 5:
				return Integer.class;
			default:
				return Integer.class;
			}
		}

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
}

    @Override
    public void removeTableModelListener(TableModelListener l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
