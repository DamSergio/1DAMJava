package gruposYcanciones;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana1 extends JFrame {

	private JPanel nombre;
	static Ventana1 frame1;
	private JTextField nom;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField contraseña;
	private JButton entrar;
	private JButton salir;

	
	//get set
	public static Ventana1 getFrame1() {
		return frame1;
	}

	public static void setFrame1(Ventana1 frame1) {
		Ventana1.frame1 = frame1;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame1 = new Ventana1();
					frame1.setVisible(true);
					Ventana2.frame2=new Ventana2();
					Ventana2.frame2.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		nombre = new JPanel();
		nombre.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(nombre);
		nombre.setLayout(null);
		
		lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(187, 51, 61, 16);
		nombre.add(lblNewLabel);
		
		nom = new JTextField();
		nom.setBounds(150, 68, 130, 26);
		nombre.add(nom);
		nom.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Contraseña");
		lblNewLabel_1.setBounds(181, 99, 83, 16);
		nombre.add(lblNewLabel_1);
		
		contraseña = new JTextField();
		contraseña.setBounds(150, 127, 130, 26);
		nombre.add(contraseña);
		contraseña.setColumns(10);
		
		entrar = new JButton("Entrar");
		entrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if(nom.getText().equals("admin") && contraseña.getText().equals("1234")) {
					frame1.setVisible(false);
					Ventana2.frame2.setVisible(true);
					JOptionPane.showMessageDialog(frame1, "Usuario y contrasela correctos");
				} else {
					if(!nom.getText().equals("admin")) {
						JOptionPane.showMessageDialog(frame1, "Nombre incorrecto");
					}
					if(!contraseña.getText().equals("1234")) {
						JOptionPane.showMessageDialog(frame1, "Contraseña incorrecta");
					}
				}
				
			}
		});
		entrar.setBounds(103, 172, 117, 29);
		nombre.add(entrar);
		
		salir = new JButton("Salir");
		salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		salir.setBounds(229, 172, 117, 29);
		nombre.add(salir);
	}
}
