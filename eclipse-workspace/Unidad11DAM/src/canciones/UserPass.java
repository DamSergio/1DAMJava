package canciones;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import singleton.BD;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class UserPass extends JFrame {

	private JPanel contentPane;
	
	static UserPass frame2;
	
	public JTextField name;
	public JTextField pass;
	private JButton btnSalir;
	private JButton start;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		BD.getInstance().setUsuario("canciones");
		BD.getInstance().setPassword("1234");
		BD.getInstance().setCadenaConexion("jdbc:oracle:thin:@localhost:1521:XE");
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame2 = new UserPass();
					frame2.setVisible(true);
					GruposYCanciones.frame1=new GruposYCanciones();
					GruposYCanciones.frame1.setVisible(false);
					Admin.frame3 = new Admin();
					Admin.frame3.setVisible(false);
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
				try {
					boolean vacio = true;
					ResultSet tabla = BD.getInstance().consultaBD("select tipo_usuario from usuarios where login='"+name.getText()+"' and password='"+pass.getText()+"'");
					
					while (tabla.next()) {
						if (tabla.getString(1).equals("A")) {
							frame2.setVisible(false);
							Admin.frame3.setVisible(true);
						} else {
							frame2.setVisible(false);
							GruposYCanciones.frame1.setVisible(true);
						}
						
						vacio = false;
					}
					
					if (vacio) {
						JOptionPane.showMessageDialog(frame2, "Usuario incorrecto");
					}
					BD.getInstance().cerrarConsulta();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
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
