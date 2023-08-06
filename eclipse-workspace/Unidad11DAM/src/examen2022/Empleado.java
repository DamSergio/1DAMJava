package examen2022;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.Scanner;

public class Empleado extends Persona {
	private int turno;
	private ArrayList<Pedido> pedidosAsignados;
	
	public Empleado() throws FileNotFoundException {
		super();
		this.turno = 0;
		this.pedidosAsignados = new ArrayList<>();
		asignarPedidosTurno();
	}
	
	public Empleado(String dni, String nombre, String apellido, String direccion, int turno) throws FileNotFoundException {
		super(dni, nombre, apellido, direccion);
		this.turno = turno;
		this.pedidosAsignados = new ArrayList<>();
		asignarPedidosTurno();
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
		return "Empleado [turno=" + turno + ", pedidosAsignados=" + pedidosAsignados + "]";
	}
	
	public void asignarPedidosTurno() throws FileNotFoundException {
		Scanner pedidos = new Scanner(new File("Pedidos.csv"));
		pedidos.nextLine();
		
		while (pedidos.hasNext()) {
			String line[] = pedidos.nextLine().split(";");
			boolean pertenece_Al_Empleado = Integer.parseInt(line[3]) == this.turno;
			
			if (pertenece_Al_Empleado) {
				this.pedidosAsignados.add(new Pedido(Integer.parseInt(line[0]), line[1], Integer.parseInt(line[2]), Integer.parseInt(line[3])));
			}
		}
	}
	
	public void generarFicheroFactura() throws FileNotFoundException, SQLException {
		for (Pedido p : this.pedidosAsignados) {
			Factura f = generarFactura(p);
			
			PrintWriter out = new PrintWriter(new File("Factura"+f.getDniCliente()+".txt"));
			
			out.println("Factura: "+f.getCodigoFactura());
			out.println("Cliente: "+f.getDniCliente());
			out.println("*************************Productos*************************");
			for (int producto = 0; producto < f.getProductosPedidos().size(); producto++) {
				out.println(producto+""+f.getProductosPedidos().get(producto));
			}
			out.println();
			out.println("\t\t\tTOTAL: "+f.getTotal());
			out.println("\t\t\tIVA: "+f.ivaReducido());
			out.println("\t\t\tDescuento: "+p.getDescuento());
			out.println("\t\t\tIMPORTE TOTAL: "+(f.getTotal()+f.ivaReducido()-p.getDescuento()));
			
			out.flush();
			out.close();
		}
	}
	
	public Factura generarFactura(Pedido p) throws FileNotFoundException, SQLException {
		Factura f = new Factura(p.getCodigoPedido()+"_"+p.getDniCliente(), p.getCodigoPedido(), p.getDniCliente());
		try {
			BD.getInstance().consultaBD("INSERT INTO factura VALUES('"+p.getCodigoPedido()+"_"+p.getDniCliente()+"', '"+p.getCodigoPedido()+"', '"+p.getDniCliente()+"', "+(f.getTotal()+f.ivaReducido()-p.getDescuento())+")");
		} catch (SQLIntegrityConstraintViolationException e) {
			
		}
		return f;
	}
}