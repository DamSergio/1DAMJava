package examen2022;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Factura implements Impuestos {
	private String codigoFactura;
	private int codigoPedido;
	private String dniCliente;
	private ArrayList<ProductoPedido> productosPedidos;
	private double total;
	
	public Factura() {
		super();
		this.codigoFactura = "";
		this.codigoPedido = 0;
		this.dniCliente = "";
		this.productosPedidos = new ArrayList<>();
		this.total = 0;
	}
	
	public Factura(String codigoFactura, int codigoPedido, String dniCliente) throws FileNotFoundException {
		super();
		this.codigoFactura = codigoFactura;
		this.codigoPedido = codigoPedido;
		this.dniCliente = dniCliente;
		this.productosPedidos = cargarProductos();
		this.total = totalSinIVA();
	}
	
	public Factura(String codigoFactura, int codigoPedido, String dniCliente,
			ArrayList<ProductoPedido> productosPedidos, double total) {
		super();
		this.codigoFactura = codigoFactura;
		this.codigoPedido = codigoPedido;
		this.dniCliente = dniCliente;
		this.productosPedidos = productosPedidos;
		this.total = total;
	}

	public String getCodigoFactura() {
		return codigoFactura;
	}

	public void setCodigoFactura(String codigoFactura) {
		this.codigoFactura = codigoFactura;
	}

	public int getCodigoPedido() {
		return codigoPedido;
	}

	public void setCodigoPedido(int codigoPedido) {
		this.codigoPedido = codigoPedido;
	}

	public String getDniCliente() {
		return dniCliente;
	}

	public void setDniCliente(String dniCliente) {
		this.dniCliente = dniCliente;
	}

	public ArrayList<ProductoPedido> getProductosPedidos() {
		return productosPedidos;
	}

	public void setProductosPedidos(ArrayList<ProductoPedido> productosPedidos) {
		this.productosPedidos = productosPedidos;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Factura [codigoFactura=" + codigoFactura + ", codigoPedido=" + codigoPedido + ", dniCliente="
				+ dniCliente + ", productosPedidos=" + productosPedidos + ", total=" + total + "]";
	}
	
	public ArrayList<ProductoPedido> cargarProductos() throws FileNotFoundException{
		Scanner in = new Scanner(new File("ProductosPedidos.csv"));
		ArrayList<ProductoPedido> productos = new ArrayList<>();
		
		in.nextLine();
		while (in.hasNext()) {
			String line[] = in.nextLine().split(";");
			boolean pertenece_Al_Pedido = Integer.parseInt(line[0]) == this.codigoPedido;
			
			if (pertenece_Al_Pedido) {
				productos.add(new ProductoPedido(Integer.parseInt(line[0]), Integer.parseInt(line[1]), line[2], line[3], line[4], Double.parseDouble(line[5]), Double.parseDouble(line[6])));
			}
		}
		
		return productos;
	}

	@Override
	public double ivaReducido() {
		return this.total * 0.04;
	}

	@Override
	public double totalSinIVA() {
		double total = 0;
		
		for (ProductoPedido producto : this.productosPedidos) {
			total += producto.getPrecioKg() * producto.getKg();
		}
		
		return total;
	}
}