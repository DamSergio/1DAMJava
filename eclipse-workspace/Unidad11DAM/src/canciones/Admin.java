package canciones;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import singleton.BD;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Admin extends JFrame {
	
	static Admin frame3;
	private JPanel contentPane;
	private JComboBox opcion;
	private JTextField codG;
	private JTextField nomG;
	private JLabel lblNombreGrupo;
	private JTextField anoG;
	private JLabel lblAoGrupo;
	private JTextField tipG;
	private JLabel lblTipoMusica;
	private JTextField codC;
	private JLabel lblTituloCancion;
	private JTextField nomC;
	private JLabel lblNombreCancion;
	private JTextField disC;
	private JLabel lblDisco;
	private JTextField minC;
	private JLabel lblMinutos;
	private JButton users;
	private JButton accion;
	private JButton groups;
	private JButton songs;

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
					frame3 = new Admin();
					frame3.setVisible(false);
					UserPass.frame2 = new UserPass();
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
	public Admin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 949, 457);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		opcion = new JComboBox();
		opcion.setModel(new DefaultComboBoxModel(new String[] {"1. Dar de alta nuevo grupo en la BD.", "2. Dar de baja un grupo borrando todas sus canciones.", "3. Dar de baja una canción de un grupo.", "4. Dar de alta canción de un grupo."}));
		opcion.setBounds(20, 27, 293, 21);
		contentPane.add(opcion);
		
		codG = new JTextField();
		codG.setBounds(429, 48, 96, 19);
		contentPane.add(codG);
		codG.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Codigo Grupo");
		lblNewLabel.setBounds(429, 31, 96, 13);
		contentPane.add(lblNewLabel);
		
		nomG = new JTextField();
		nomG.setColumns(10);
		nomG.setBounds(548, 48, 96, 19);
		contentPane.add(nomG);
		
		lblNombreGrupo = new JLabel("Nombre Grupo");
		lblNombreGrupo.setBounds(548, 31, 96, 13);
		contentPane.add(lblNombreGrupo);
		
		anoG = new JTextField();
		anoG.setColumns(10);
		anoG.setBounds(671, 48, 96, 19);
		contentPane.add(anoG);
		
		lblAoGrupo = new JLabel("Año Grupo");
		lblAoGrupo.setBounds(671, 31, 96, 13);
		contentPane.add(lblAoGrupo);
		
		tipG = new JTextField();
		tipG.setColumns(10);
		tipG.setBounds(792, 48, 96, 19);
		contentPane.add(tipG);
		
		lblTipoMusica = new JLabel("Tipo Musica");
		lblTipoMusica.setBounds(792, 31, 96, 13);
		contentPane.add(lblTipoMusica);
		
		codC = new JTextField();
		codC.setColumns(10);
		codC.setBounds(428, 137, 96, 19);
		contentPane.add(codC);
		
		lblTituloCancion = new JLabel("Codigo Grupo Cancion");
		lblTituloCancion.setBounds(428, 120, 112, 13);
		contentPane.add(lblTituloCancion);
		
		nomC = new JTextField();
		nomC.setColumns(10);
		nomC.setBounds(550, 137, 96, 19);
		contentPane.add(nomC);
		
		lblNombreCancion = new JLabel("Nombre Cancion");
		lblNombreCancion.setBounds(550, 120, 96, 13);
		contentPane.add(lblNombreCancion);
		
		disC = new JTextField();
		disC.setColumns(10);
		disC.setBounds(669, 137, 96, 19);
		contentPane.add(disC);
		
		lblDisco = new JLabel("Disco");
		lblDisco.setBounds(669, 120, 96, 13);
		contentPane.add(lblDisco);
		
		minC = new JTextField();
		minC.setColumns(10);
		minC.setBounds(792, 137, 96, 19);
		contentPane.add(minC);
		
		lblMinutos = new JLabel("Minutos");
		lblMinutos.setBounds(792, 120, 96, 13);
		contentPane.add(lblMinutos);
		
		users = new JButton("Consultar Usuarios");
		users.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ResultSet users = BD.getInstance().consultaBD("select * from usuarios");
					
					PrintWriter out = new PrintWriter(new File("usuarios.txt"));
					
					while (users.next()) {
						for (int i = 1; i < users.getMetaData().getColumnCount(); i++) {
							out.print(users.getString(i)+" ");
						}
						out.println();
					}
					
					out.flush();
					out.close();
					
					BD.getInstance().cerrarConsulta();
				} catch (SQLException | FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		users.setBounds(33, 322, 217, 58);
		contentPane.add(users);
		
		accion = new JButton("Aceptar");
		accion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch (opcion.getSelectedIndex()) {
				case 0:
					try {
						BD.getInstance().consultaBD("insert into grupos values("+codG.getText()+",'"+nomG.getText()+"',"+anoG.getText()+",'"+tipG.getText()+"')");
						
						BD.getInstance().cerrarConsulta();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					break;
				case 1:
					try {
						BD.getInstance().consultaBD("delete from grupos where codigo='"+codG.getText()+"'");
						BD.getInstance().consultaBD("delete from canciones where codigo_grupo='"+codG.getText()+"'");
						
						BD.getInstance().cerrarConsulta();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					break;
				case 2:
					try {
						BD.getInstance().consultaBD("delete from canciones where titulo='"+nomC.getText()+"'");
						
						BD.getInstance().cerrarConsulta();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					break;
				case 3:
					try {
						BD.getInstance().consultaBD("insert into canciones values("+codC.getText()+", '"+disC.getText()+"', '"+nomC.getText()+"', "+minC.getText()+", 0)");
						
						BD.getInstance().cerrarConsulta();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					break;
				}
			}
		});
		accion.setBounds(20, 116, 293, 58);
		contentPane.add(accion);
		
		groups = new JButton("Generar Grupos");
		groups.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ResultSet groups = BD.getInstance().consultaBD("select * from grupos");
					
					PrintWriter out = new PrintWriter(new File("grupos.csv"));
					
					while (groups.next()) {
						for (int i = 1; i < groups.getMetaData().getColumnCount(); i++) {
							out.print(groups.getString(i)+";");
						}
						out.println();
					}
					
					out.flush();
					out.close();
					
					BD.getInstance().cerrarConsulta();
				} catch (SQLException | FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		groups.setBounds(341, 322, 217, 58);
		contentPane.add(groups);
		
		songs = new JButton("Generar Canciones");
		songs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ResultSet songs = BD.getInstance().consultaBD("select * from canciones");
					
					PrintWriter out = new PrintWriter(new File("canciones.csv"));
					
					while (songs.next()) {
						for (int i = 1; i < songs.getMetaData().getColumnCount(); i++) {
							out.print(songs.getString(i)+";");
						}
						out.println();
					}
					
					out.flush();
					out.close();
					
					BD.getInstance().cerrarConsulta();
				} catch (SQLException | FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		songs.setBounds(671, 322, 217, 58);
		contentPane.add(songs);
	}
}
