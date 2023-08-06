package gruposYCanciones;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class GruposYCanciones extends JFrame {

	private JPanel contentPane;
	
	static GruposYCanciones frame1;
	
	private JTextField Cod;
	private JButton mostGrupo;
	private ArrayList<Grupo> grupos;
	private ArrayList<Cancion> canciones;
	private JTextArea textArea;
	private JButton can;

	public ArrayList<Grupo> getGrupos() {
		return grupos;
	}

	public void setGrupos(ArrayList<Grupo> grupos) {
		this.grupos = grupos;
	}

	public ArrayList<Cancion> getCanciones() {
		return canciones;
	}

	public void setCanciones(ArrayList<Cancion> canciones) {
		this.canciones = canciones;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
		this.canciones=new ArrayList<>();
		this.grupos=new ArrayList<>();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 721, 433);
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
				GruposYCanciones app=new GruposYCanciones();
				textArea.setText("");
				if (app.getGrupos().isEmpty()) {
					try {
						Scanner in=new Scanner(new File("grupos.csv"));
						
						in.nextLine();
						while (in.hasNext()) {
							String linea[]=in.nextLine().split(";");
							
							app.getGrupos().add(new Grupo(linea[0], linea[1], Integer.parseInt(linea[2]), linea[3]));
						}
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				for (Grupo g:app.getGrupos()) {
					textArea.append(g+"\n");
				}
			}
		});
		mostGrupo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		mostGrupo.setBounds(64, 101, 156, 27);
		contentPane.add(mostGrupo);
		
		JLabel lblNewLabel_1 = new JLabel("Codigo de grupo");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(64, 157, 134, 34);
		contentPane.add(lblNewLabel_1);
		
		Cod = new JTextField();
		Cod.setBounds(64, 218, 134, 27);
		contentPane.add(Cod);
		Cod.setColumns(10);
		
		can = new JButton("Ver canciones");
		can.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GruposYCanciones app=new GruposYCanciones();
				if (app.getCanciones().isEmpty()) {
					try {
						Scanner in=new Scanner(new File("canciones.csv"));
						
						in.nextLine();
						while (in.hasNext()) {
							String linea[]=in.nextLine().split(";");
							
							app.getCanciones().add(new Cancion(linea[0], linea[1], linea[2], Integer.parseInt(linea[3]), Integer.parseInt(linea[4])));
						}
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				if (Cod.getText().isEmpty()) {
					textArea.setText("");
					for (Cancion can:app.getCanciones()) {
						textArea.append(can+"\n");
					}
				} else {
					textArea.setText("");
					for (Cancion can:app.getCanciones()) {
						if (can.getCodigo().equals(Cod.getText())) {
							textArea.append(can+"\n");
						}
					}
				}
			}
		});
		can.setFont(new Font("Tahoma", Font.PLAIN, 15));
		can.setBounds(64, 269, 156, 34);
		contentPane.add(can);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(266, 101, 388, 207);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
	}
}
