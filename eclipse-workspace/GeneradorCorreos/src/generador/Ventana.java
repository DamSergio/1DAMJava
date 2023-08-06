package generador;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame {

	private JPanel contentPane;
	private JTextField txtSd;
	private JButton crear;
	private JButton btnNewButton;
	private ArrayList<Correo> correos;
	private File file;

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public ArrayList<Correo> getCorreos() {
		return correos;
	}

	public void setCorreos(ArrayList<Correo> correos) {
		this.correos = correos;
	}

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana() {
		this.file=null;
		this.correos=new ArrayList<>();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 842, 487);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Selecciona el fichero alumnos para obtener los correos");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(130, 78, 605, 47);
		contentPane.add(lblNewLabel);
		
		txtSd = new JTextField();
		txtSd.setEditable(false);
		txtSd.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtSd.setBounds(48, 190, 478, 29);
		contentPane.add(txtSd);
		txtSd.setColumns(10);
		
		btnNewButton = new JButton("Selecciona el fichero");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fc=new JFileChooser();
				int seleccion=fc.showOpenDialog(contentPane);
				
				if(seleccion==JFileChooser.APPROVE_OPTION){
					txtSd.setText(fc.getSelectedFile().getAbsolutePath());
					file=fc.getSelectedFile();
					int i=fc.getSelectedFile().getName().lastIndexOf('.');
					String extension=fc.getSelectedFile().getName().substring(i+1);
					if (extension.equals("csv")) {
						JOptionPane.showMessageDialog(null, "Fichero valido");
						crear.setEnabled(true);
					} else {
						JOptionPane.showMessageDialog(null, "El fichero tiene que ser .csv");
						crear.setEnabled(false);
					}
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(536, 190, 199, 29);
		contentPane.add(btnNewButton);
		
		crear = new JButton("Crear y guardar fichero");
		crear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				//JOptionPane.showMessageDialog(null, file.getPath());
				
				try {
					BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file.getAbsolutePath()), "utf-8"));
					
					br.readLine();
					br.readLine();
					br.readLine();
					br.readLine();
					br.readLine();
					
					String cad;
					while ((cad=br.readLine())!=null) {
						String linea[]=cad.split(";");
						linea[0]=quitarTildes(linea[0]);
						
						String nombre[]=linea[0].split(",");
						String nombres[]=nombre[1].substring(1).split(" ");
						String pNombre=nombres[0].toLowerCase();
						
						pNombre=quitarTildes(pNombre);
						
						String apellidos[]=nombre[0].split(" ");
						String apellido=apellidos[0].toLowerCase();
						
						apellido=quitarTildes(apellido);
						
						String curso=linea[2].toLowerCase().substring(0, linea[2].length()-1);
						
						correos.add(new Correo(pNombre, apellido, curso, "@riberadeltajo.es"));
					}
					
					br.close();
				} catch (FileNotFoundException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
//				try {
//					Thread.sleep(1);
//					Scanner in = new Scanner(new File(file.getAbsolutePath()));
//					
//					for (int i=0; i<5; i++) {
//						in.nextLine();
//					}
//					
//					while (in.hasNext()) {
//						String linea[]=in.nextLine().split(";");
//						linea[0]=quitarTildes(linea[0]);
//						
//						String nombre[]=linea[0].split(",");
//						String nombres[]=nombre[1].substring(1).split(" ");
//						String pNombre=nombres[0].toLowerCase();
//						
//						String apellidos[]=nombre[0].split(" ");
//						String apellido=apellidos[0].toLowerCase();
//						
//						String curso=linea[2].toLowerCase().substring(0, linea[2].length()-1);
//						
//						correos.add(new Correo(pNombre, apellido, curso, "@riberadeltajo.es"));
//					}
//				} catch (Exception e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
				
//				if (correos.isEmpty()) {
//					JOptionPane.showMessageDialog(lblNewLabel, "Vacio");
//				}
				
				
				
				JFileChooser fc=new JFileChooser();
				 
				//Abrimos la ventana, guardamos la opcion seleccionada por el usuario
				int seleccion=fc.showSaveDialog(contentPane);
				 
				//Si el usuario, pincha en aceptar
				if(seleccion==JFileChooser.APPROVE_OPTION){
				 
				    //Seleccionamos el fichero
					try {
						PrintWriter out=new PrintWriter(fc.getSelectedFile());
						
						out.println("Correos de: DAM");
						
						for (Correo i:correos) {
							out.println(i);
						}
						
						out.flush();
						out.close();
						
						JOptionPane.showMessageDialog(null, "Fichero creado");
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				 
				}
			}
		});
		crear.setEnabled(false);
		crear.setFont(new Font("Tahoma", Font.PLAIN, 15));
		crear.setBounds(251, 324, 315, 29);
		contentPane.add(crear);
	}

	public String quitarTildes(String string) {
		
		string=string.replaceAll("á", "a");
		string=string.replaceAll("é", "e");
		string=string.replaceAll("í", "i");
		string=string.replaceAll("ó", "o");
		string=string.replaceAll("ú", "u");
		
		return string;
		
	}
}
