package canciones;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import singleton.BD;

import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class GruposYCanciones extends JFrame {

	private JPanel contentPane;
	
	static GruposYCanciones frame1;
	
	private JTextField Cod;
	private JButton mostGrupo;
	private ArrayList<Grupo> grupos;
	private Stack<Cancion> canciones;
	private JTextArea textArea;
	private JButton can;
	private JTextField min;
	private JButton lista;

	public ArrayList<Grupo> getGrupos() {
		return grupos;
	}

	public void setGrupos(ArrayList<Grupo> grupos) {
		this.grupos = grupos;
	}

	public Stack<Cancion> getCanciones() {
		return canciones;
	}

	public void setCanciones(Stack<Cancion> canciones) {
		this.canciones = canciones;
	}

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
					frame1 = new GruposYCanciones();
					frame1.setVisible(false);
					UserPass.frame2=new UserPass();
					UserPass.frame2.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GruposYCanciones() {
		this.canciones=new Stack<>();
		this.grupos=new ArrayList<>();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 724, 401);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("GRUPOS Y CANCIONES");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(266, 10, 216, 41);
		contentPane.add(lblNewLabel);
		
		mostGrupo = new JButton("Mostrar grupos");
		mostGrupo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				try {
					ResultSet grupos = BD.getInstance().consultaBD("select nombre from grupos");
					
					while (grupos.next()) {
						textArea.append(grupos.getString(1)+"\n");
					}
					BD.getInstance().cerrarConsulta();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		mostGrupo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		mostGrupo.setBounds(10, 19, 156, 27);
		contentPane.add(mostGrupo);
		
		JLabel lblNewLabel_1 = new JLabel("Codigo de grupo");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 56, 134, 34);
		contentPane.add(lblNewLabel_1);
		
		Cod = new JTextField();
		Cod.setBounds(10, 100, 134, 27);
		contentPane.add(Cod);
		Cod.setColumns(10);
		
		can = new JButton("Ver canciones");
		can.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				
				if (Cod.getText().equals("")) {
					try {
						ResultSet canciones = BD.getInstance().consultaBD("select titulo from canciones");
						
						while (canciones.next()) {
							textArea.append(canciones.getString(1)+"\n");
						}
						BD.getInstance().cerrarConsulta();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} else {
					try {
						boolean vacio = true;
						ResultSet canciones = BD.getInstance().consultaBD("select titulo from canciones where codigo_grupo = (select codigo from grupos where nombre ='"+Cod.getText()+"')");
						
						while (canciones.next()) {
							textArea.append(canciones.getString(1)+"\n");
							vacio = false;
						}
						
						if (vacio) {
							textArea.setText("No hay canciones de este grupo");
						}
						
						BD.getInstance().cerrarConsulta();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		can.setFont(new Font("Tahoma", Font.PLAIN, 15));
		can.setBounds(10, 137, 156, 34);
		contentPane.add(can);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(266, 101, 388, 207);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		lista = new JButton("Crear Lista");
		lista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GruposYCanciones app = new GruposYCanciones();
				app.canciones.clear();
				textArea.setText("");
				
				String user = UserPass.frame2.name.getText();
				String pass = UserPass.frame2.pass.getText();
				
				try {
					ResultSet canciones = BD.getInstance().consultaBD("select * from canciones where codigo_grupo in (select codigo from grupos where tipo_musica = (select tipo_musica from usuarios where login = '"+user+"' and password = '"+pass+"'))");
					
					while (canciones.next()) {
						app.canciones.add(new Cancion(canciones.getString(1), canciones.getString(2), canciones.getString(3), canciones.getInt(4)));
					}
					BD.getInstance().cerrarConsulta();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				int minutos = Integer.parseInt(min.getText());
				
				while (minutos > 0) {
					int random = (int) (Math.random()*app.canciones.size());
					
					Cancion c = app.canciones.remove(random);
					textArea.append(c+"\n");
					
					minutos -= c.getMinutos();
				}
			}
		});
		lista.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lista.setBounds(10, 320, 156, 34);
		contentPane.add(lista);
		
		min = new JTextField();
		min.setBounds(10, 274, 134, 27);
		contentPane.add(min);
		min.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Minutos de duracion");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(10, 237, 134, 27);
		contentPane.add(lblNewLabel_2);
	}
}
