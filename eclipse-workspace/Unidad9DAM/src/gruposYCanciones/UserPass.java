package gruposYCanciones;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class UserPass extends JFrame {

	private JPanel contentPane;
	
	static UserPass frame2;
	
	private JTextField name;
	private JTextField pass;
	private JButton btnSalir;
	private JButton start;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame2 = new UserPass();
					frame2.setVisible(true);
					GruposYCanciones.frame1=new GruposYCanciones();
					GruposYCanciones.frame1.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UserPass() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		name = new JTextField();
		name.setBounds(129, 72, 154, 20);
		contentPane.add(name);
		name.setColumns(10);
		
		pass = new JTextField();
		pass.setColumns(10);
		pass.setBounds(129, 131, 154, 20);
		contentPane.add(pass);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(129, 57, 88, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblContrasea = new JLabel("Contraseña");
		lblContrasea.setBounds(129, 117, 88, 14);
		contentPane.add(lblContrasea);
		
		start = new JButton("Entrar");
		start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(name.getText().equals("admin") && pass.getText().equals("1234")) {
					JOptionPane.showMessageDialog(frame2, "Bienvenido");
					frame2.setVisible(false);
					GruposYCanciones.frame1.setVisible(true);
				} else {
					if (!name.getText().equals("admin")) {
						JOptionPane.showMessageDialog(frame2, "Usuario incorrecto");
					}
					if (!pass.getText().equals("1234")) {
						JOptionPane.showMessageDialog(frame2, "Contraseña incorrecta");
					}
				}
			}
		});
		start.setBounds(57, 202, 110, 23);
		contentPane.add(start);
		
		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(240, 202, 110, 23);
		contentPane.add(btnSalir);
	}
}
