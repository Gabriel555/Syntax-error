package fes.aragon.swing;

import fes.aragon.control.Archivo;
import fes.aragon.modelo.Cliente;
import fes.aragon.modelo.Persona;
import fes.aragon.utilerias.Tabla;
import java.awt.FlowLayout;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class VentanaAlumno extends JFrame {
	private JLabel lblNombre;
	private JLabel lblaPaterno;
	private JLabel lblaMaterno;
	private JLabel lblCorreo1;
	private JLabel lblCorreo2;
	private JLabel lblEdad;
        private JLabel lblSexo;
        private JLabel lblCP;
        private JLabel lblTelefono;
        private JLabel lblPaginaPersonal;
        private JLabel lblNumeroCuenta;
	private JTextField txtNombre;
	private JTextField txtaPaterno;
	private JTextField txtaMaterno;
	private JTextField txtCorreo1;
	private JTextField txtCorreo2;
	private JTextField txtEdad;
        private JTextField txtSexo;
        private JTextField txtCP;
        private JTextField txtTelefono;
        private JTextField txtPaginaPersonal;
        private JTextField txtNumeroCuenta;
	
	private JButton btnAgregar;
	private JPanel panel;
	private ArrayList<Cliente> listado;
	private JTable tblMotos;
	private JScrollPane scrollTabla;
	private Tabla modelo;
	
	//private JLabel lblVisita;
	//private String ;		//elementos de enlace
	//private String txtUrl;
	
	private JButton btnGuardar;
	private JButton btnRecuperar;
	private JButton btnEliminar;
	
	private JButton btnModificar;
	private JButton btnGuardarCambios;
	private Cliente motoModificacion;
	
	
	private Archivo am;
	

	public VentanaAlumno() {
	     GraphicsEnvironment env =
	    		 GraphicsEnvironment.getLocalGraphicsEnvironment();
	     
		lblNombre = new JLabel("Nombre:");
		lblaPaterno = new JLabel("Apellido Paterno:");
		lblaMaterno = new JLabel("Apellido Materno:");
		lblCorreo1 = new JLabel("Correo:");
		lblCorreo2 = new JLabel("Correo (unam):");
		lblEdad= new JLabel("Edad:");
                lblSexo= new JLabel("Sexo:");
                lblCP= new JLabel("C.P:");
                lblTelefono= new JLabel("Teléfono:");
                lblPaginaPersonal= new JLabel("Pagina Personal:");
                lblNumeroCuenta= new JLabel("Número de Cuenta:");

		txtNombre = new JTextField();
		txtaPaterno = new JTextField();
		txtaMaterno = new JTextField();
		txtCorreo1 = new JTextField();
		txtCorreo2 = new JTextField();
		txtEdad = new JTextField();
                txtSexo = new JTextField();
                txtCP = new JTextField();
                txtTelefono = new JTextField();
                txtPaginaPersonal = new JTextField();
                txtNumeroCuenta = new JTextField();
		
		txtNombre.setColumns(15);
                
		txtaPaterno.setColumns(15);
		txtaMaterno.setColumns(15);
		txtCorreo1.setColumns(5);
		txtCorreo2.setColumns(10);
		txtEdad.setColumns(4);
                txtSexo.setColumns(4);
                txtCP.setColumns(4);
                txtTelefono.setColumns(4);
                txtPaginaPersonal.setColumns(4);
                txtNumeroCuenta.setColumns(4);
		
		btnAgregar=new JButton("Agregar Daos");
		btnGuardar=new JButton("Guardar en archivo");
		btnRecuperar=new JButton("Leer de archivo");
		btnEliminar=new JButton("Eliminar");
		btnModificar=new JButton("Modificar Datos");
		btnGuardarCambios=new JButton("Guardar cambios");
		
		tblMotos=new JTable();
		listado=new ArrayList<Cliente>();
		modelo=new Tabla(listado);
		tblMotos.setModel(modelo);
		scrollTabla = new JScrollPane(tblMotos);
		
		
		am=new Archivo();
		
		panel = (JPanel) this.getContentPane();
		panel.setLayout(new FlowLayout(FlowLayout.LEFT));
		//this.setSize(600, 400);
		this.setMaximizedBounds(env.getMaximumWindowBounds());
        this.setExtendedState(this.getExtendedState() | this.MAXIMIZED_BOTH);
		
        this.setTitle("REGISTRO DE ALUMNOS");
		panel.add(lblNombre);
		panel.add(txtNombre);
		panel.add(lblaPaterno);
		panel.add(txtaPaterno);
		panel.add(lblCorreo1);
		panel.add(txtCorreo1);
		panel.add(lblCorreo2);
		panel.add(txtCorreo2);
		panel.add(lblEdad);
		panel.add(txtEdad);
		panel.add(lblSexo);
		panel.add(txtSexo);
		panel.add(lblCP);
		panel.add(txtCP);
		panel.add(lblTelefono);
		panel.add(txtTelefono);
		panel.add(lblPaginaPersonal);
		panel.add(txtPaginaPersonal);
		panel.add(lblNumeroCuenta);
		panel.add(txtNumeroCuenta);
		panel.add(btnAgregar);
		panel.add(btnGuardar);
		panel.add(btnRecuperar);
		panel.add(scrollTabla);
		panel.add(btnEliminar);
		panel.add(btnModificar);
		panel.add(btnGuardarCambios);
		btnGuardarCambios.setVisible(false);
		
		

		
		/**
		 * Eventos de la ventana
		 */
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
				super.windowClosing(e);
			}
		});
		
		// Boton de agregar
		btnAgregar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// Por implementar: VALIDACION y MANEJO DE EXCEPCIONES
				listado.add(
						new Cliente(1,new Persona(
                                                                
								txtNombre.getText(),
								txtaPaterno.getText(),
								txtaMaterno.getText(),
								txtCorreo1.getText(),
								txtCorreo2.getText(),
								Integer.parseInt(txtEdad.getText()),
								txtSexo.getText(),
								Integer.parseInt(txtCP.getText()),
                                                                Integer.parseInt(txtTelefono.getText()),
								txtPaginaPersonal.getText()
                                                                //Integer.parseInt(txtNumeroCuenta.getText())
                                                
                                                                        )
								)
						);
				

				actualizarTabla();
				limpiarFormulario();
			}
		});
		// Boton guardar a archivo
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JFileChooser jfc=new JFileChooser();
				jfc.showSaveDialog(null);
				am.setArchivo(jfc.getSelectedFile().getAbsolutePath());
				try {
					am.guardar(listado);
				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Error al intentar guardar el archivo");					
				}
			}
		}); // fin del btoton guardar a archivo
		
		btnRecuperar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JFileChooser jfc=new JFileChooser();
				jfc.showOpenDialog(null);
				am.setArchivo(jfc.getSelectedFile().getAbsolutePath());
				try {
					listado = am.leerCliente();
					actualizarTabla();
				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Error al intentar leer el archivo");	
				}
			}
		}); // fin boton leer archivo
		
		btnEliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int renglonSeleccionado=tblMotos.getSelectedRow();
				System.out.println("Seleccionado:"+renglonSeleccionado);
				if(renglonSeleccionado == -1){
					// no se ah elegido un renglon de la tabla
					JOptionPane.showMessageDialog(null, "No se ha seleccionado nada de la tabla, por favor seleccione un rengl�n e intente de nuevo");
				}else{
					int respuesta=JOptionPane.showConfirmDialog(null,"�Realmente deseas eliminar este registro?");
							if (respuesta== JOptionPane.OK_OPTION) {
								listado.remove(renglonSeleccionado);
								modelo.setDatos(listado);
								actualizarTabla();
							}
				}
			}
			
		}); // fin de eliminar
		
		btnModificar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				limpiarFormulario();
				habilitarModificacion(true);
				int renglonSeleccionado=tblMotos.getSelectedRow();
				if(renglonSeleccionado == -1){
					// no se ha elegido un renglon de la tabla
					JOptionPane.showMessageDialog(null, "No se ha seleccionado nada de la tabla, por favor seleccione un rengl�n e intente de nuevo");
					habilitarModificacion(false);
				}else{
					motoModificacion=listado.get(renglonSeleccionado); 
					txtNombre.setText(motoModificacion.getPersona().getNombre());
					txtaPaterno.setText(motoModificacion.getPersona().getaPaterno());
					txtaMaterno.setText(motoModificacion.getPersona().getaMaterno());
                                        txtCorreo1.setText(motoModificacion.getPersona().getCorreo1());
					txtCorreo2.setText(motoModificacion.getPersona().getCorreo2());
                                        txtEdad.setText(""+motoModificacion.getPersona().getEdad());
					txtSexo.setText(motoModificacion.getPersona().getSexo());
					txtCP.setText(""+motoModificacion.getPersona().getCP());
                                        txtTelefono.setText(""+motoModificacion.getPersona().getTelefono());
                                        txtPaginaPersonal.setText(motoModificacion.getPersona().PaginaPersonal());
					txtNombre.requestFocus();
				}
			}
		}); // fin de modificar
		
		btnGuardarCambios.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//habilitarModificacion(true);
				int renglonSeleccionado=tblMotos.getSelectedRow();
				listado.set(renglonSeleccionado,
						new Cliente(1,new Persona(
								txtNombre.getText(),
								txtaPaterno.getText(),
								txtaMaterno.getText(),
                                                                txtCorreo1.getText(),
                                                                txtCorreo2.getText(),
								Integer.parseInt(txtEdad.getText()),
								txtSexo.getText(),
								Integer.parseInt(txtCP.getText()),
                                                                Integer.parseInt(txtTelefono.getText()),
                                                                txtPaginaPersonal.getText()
								)
                                                )
						);
				actualizarTabla();
				limpiarFormulario();
				habilitarModificacion(false);
				am.guardar(listado);
			}
		});
		
	}

	private void actualizarTabla(){
		modelo.setDatos(listado);
		tblMotos.revalidate();

	}
	
	private void limpiarFormulario(){
		txtNombre.setText("");
		txtaPaterno.setText("");
		txtaMaterno.setText("");
		txtCorreo1.setText(""); 
		txtCorreo2.setText("");
		txtEdad.setText("");
                txtSexo.setText("");
                txtCP.setText("");
                txtTelefono.setText("");
                txtPaginaPersonal.setText("");
	}
	
	
	 
	private void habilitarModificacion(boolean estado){
		
		btnAgregar.setVisible(!estado);
		btnGuardar.setVisible(!estado);
		btnRecuperar.setVisible(!estado);
		btnEliminar.setVisible(!estado);
		btnModificar.setVisible(!estado);
		btnGuardarCambios.setVisible(estado);
		
	}
	
		
	public static void main(String[] args) {
		VentanaAlumno ventana = new VentanaAlumno();
		ventana.setVisible(true);
		
		
	}

}
