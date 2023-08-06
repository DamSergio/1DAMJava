package gruposYcanciones;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Ventana2 extends JFrame {

	private JPanel contentPane;
	private JButton botonGrupos;
	private JButton botonCaciones;
	private JTextField textField;
	private JTextArea textArea;
	private ArrayList<Canciones>cancion;
	private ArrayList<Grupos>grupo;
	static Ventana2 frame2;
	
	
	
	//get and set 
	
	public static Ventana2 getFrame2() {
		return frame2;
	}

	public static void setFrame2(Ventana2 frame2) {
		Ventana2.frame2 = frame2;
	}
	
	public ArrayList<Canciones> getCancion() {
		return cancion;
	}

	public void setCancion(ArrayList<Canciones> cancion) {
		this.cancion = cancion;
	}

	public ArrayList<Grupos> getGrupo() {
		return grupo;
	}

	public void setGrupo(ArrayList<Grupos> grupo) {
		this.grupo = grupo;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame2 = new Ventana2();
					frame2.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana2() {
		this.grupo=new ArrayList<>();
		this.cancion=new ArrayList<>();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		botonGrupos = new JButton("Mostrar Grupos");
		botonGrupos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(" ");
				Ventana2 v=new Ventana2();
				
				try {
					Scanner entrada=new Scanner(new File("grupos.csv"));
					entrada.nextLine();
					
					while(entrada.hasNext()) {
						String linea[];
						linea=entrada.nextLine().split(";");
						v.getGrupo().add(new Grupos(linea[0],linea[1],linea[2],linea[3]));
					}
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				for (Grupos grupo : v.getGrupo()) {
					
					textArea.append(grupo+"\n");
				}
			}
		});
		botonGrupos.setBounds(18, 62, 131, 29);
		contentPane.add(botonGrupos);
		
		textField = new JTextField();
		textField.setBounds(28, 103, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		botonCaciones = new JButton("Ver Caciones");
		botonCaciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				Ventana2 v2=new Ventana2();
				
				try {
					Scanner entrada=new Scanner(new File("canciones.csv"));
					entrada.nextLine();
					
					while(entrada.hasNext()) {
						String linea[];
						linea=entrada.nextLine().split(";");
						
						v2.getCancion().add(new Canciones(linea[0],linea[1],linea[2],linea[3],linea[4]));
					}
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				if(textField.getText().isEmpty()) {
					for (Canciones canciones : v2.getCancion()) {
						textArea.append(canciones+"\n");
					}
				} else {
					for (Canciones canciones : v2.getCancion()) {
						if(canciones.getCodigoCancion().equals(textField.getText())) {
							textArea.append(canciones+"\n");
						}
					}
				}
				
			}
		});
		botonCaciones.setBounds(32, 166, 117, 29);
		contentPane.add(botonCaciones);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(180, 20, 248, 213);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
	}
}
