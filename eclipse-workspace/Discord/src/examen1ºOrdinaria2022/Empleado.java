package examen1ºOrdinaria2022;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Empleado extends Persona {
	private int turno;
	private ArrayList<Pedido> pedidosAsignados;
	
	public Empleado() throws FileNotFoundException {
		super();
		this.turno = 0;
		this.pedidosAsignados = new ArrayList<>();
		
		this.asignarPedidosTurno();
	}
	
	public Empleado(String dni, String nombre, String apellido, String direccion, int turno) throws FileNotFoundException {
		super(dni, nombre, apellido, direccion);
		this.turno = turno;
		this.pedidosAsignados = new ArrayList<>();
		
		this.asignarPedidosTurno();
	}
	
	public Empleado(String dni, String nombre, String apellido, String direccion, int turno,
			ArrayList<Pedido> pedidosAsignados) {
		super(dni, nombre, apellido, direccion);
		this.turno = turno;
		this.pedidosAsignados = pedidosAsignados;
	}

	public int getTurno() {
		return turno;
	}

	public void setTurno(int turno) {
		this.turno = turno;
	}

	public ArrayList<Pedido> getPedidosAsignados() {
		return pedidosAsignados;
	}

	public void setPedidosAsignados(ArrayList<Pedido> pedidosAsignados) {
		this.pedidosAsignados = pedidosAsignados;
	}

	@Override
	public String toString() {
		return "Empleado [turno=" + turno + "]";
	}
	
	public void asignarPedidosTurno() throws FileNotFoundException {
		Scanner in = new Scanner(new File("Pedidos.csv"));
		in.nextLine();
		
		while (in.hasNext()) {
			String linea[] = in.nextLine().split(";");
			boolean pertenece_al_empleado = this.turno == Integer.parseInt(linea[3]);
			
			if (pertenece_al_empleado) {
				this.pedidosAsignados.add(new Pedido(Integer.parseInt(linea[0]), linea[1], Integer.parseInt(linea[2]), Integer.parseInt(linea[3])));
			}
		}
	}
	
	public Factura generarFactura(Pedido p) throws FileNotFoundException {
		Factura f = new Factura(p.getCodigoPedido()+"_"+p.getDniCliente(), p.getCodigoPedido(), p.getDniCliente());
		
		try {
			BD.getInstance().consultaBD("INSERT INTO factura VALUES('"+f.getCodigoFactura()+"', "+f.getCodigoPedido()+", '"+f.getDniCliente()+"', "+(f.getTotal()+f.ivaReducido()-p.getDescuento())+")");
		} catch (SQLException e) {
			System.out.println("error");
		}
		
		return f;
	}
	
	public void generarFicheroFactura() throws FileNotFoundException {
		for (Pedido p:this.pedidosAsignados) {
			PrintWriter out = new PrintWriter(new File("Factura"+p.getDniCliente()+".txt"));
			Factura f = this.generarFactura(p);
			
			out.println("Factura: "+f.getCodigoFactura());
			out.println("Cliente: "+f.getDniCliente());
			out.println("******************************Productos***********************************");
			
			for (int producto = 0; producto < f.getProductosPedidos().size(); producto++) {
				out.println((producto+1)+""+f.getProductosPedidos().get(producto));
			}
			
			out.println("\t\t\tTOTAL "+f.getTotal()+"€");
			out.println("\t\t\tIVA "+f.ivaReducido()+"€");
			out.println("\t\t\tDescuento "+p.getDescuento()+"€");
			out.println("\t\t\tIMPORTE TOTAL "+(f.getTotal()+f.ivaReducido()-p.getDescuento())+"€");
			
			out.flush();
			out.close();
		}
	}
}
