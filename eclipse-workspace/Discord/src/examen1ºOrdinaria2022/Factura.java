package examen1ºOrdinaria2022;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Factura implements Impuestos{
	private String codigoFactura;
	private int codigoPedido;
	private String dniCliente;
	private ArrayList<ProductoPedido> productosPedidos;
	private double total;
	
	public Factura() throws FileNotFoundException {
		super();
		this.codigoFactura = "";
		this.codigoPedido = 0;
		this.dniCliente = "";
		this.productosPedidos = cargarProductos();
		this.total = totalSinIva();
	}
	
	public Factura(String codigoFactura, int codigoPedido, String dniCliente) throws FileNotFoundException {
		super();
		this.codigoFactura = codigoFactura;
		this.codigoPedido = codigoPedido;
		this.dniCliente = dniCliente;
		this.productosPedidos = cargarProductos();
		this.total = totalSinIva();
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

	@Override
	public double ivaReducido() {
		return this.total * 0.04;
	}

	@Override
	public double totalSinIva() {
		double suma = 0;
		
		for (ProductoPedido producto:this.productosPedidos) {
			suma += producto.getPrecioKg() * producto.getKg();
		}
		
		return suma;
	}
	
	public ArrayList<ProductoPedido> cargarProductos() throws FileNotFoundException {
		ArrayList<ProductoPedido> productos = new ArrayList<>();
		
		Scanner in = new Scanner(new File("ProductosPedidos.csv"));
		in.nextLine();
		
		while (in.hasNext()) {
			String linea[] = in.nextLine().split(";");
			boolean pertenece_a_la_factura = this.codigoPedido == Integer.parseInt(linea[0]);
			
			if (pertenece_a_la_factura) {
				productos.add(new ProductoPedido(Integer.parseInt(linea[0]), Integer.parseInt(linea[1]), linea[2], linea[3], linea[4], Double.parseDouble(linea[5]), Double.parseDouble(linea[6])));
			}
		}
		
		return productos;
	}
}
