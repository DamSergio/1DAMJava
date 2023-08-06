package prueba;

public class Producto {
	private String codigo;
	private String nombre;
	private String gama;
	private String dimensiones;
	private String proveedor;
	private String descripcion;
	private int stock;
	private double precio;
	private double precio_prov;
	
	public Producto() {
		super();
		this.codigo = "";
		this.nombre = "";
		this.gama = "";
		this.dimensiones = "";
		this.proveedor = "";
		this.descripcion = "";
		this.stock = 0;
		this.precio = 0;
		this.precio_prov = 0;
	}
	
	public Producto(String codigo, String nombre, String gama, String dimensiones, String proveedor,
			String descripcion, int stock, double precio, double precio_prov) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.gama = gama;
		this.dimensiones = dimensiones;
		this.proveedor = proveedor;
		this.descripcion = descripcion;
		this.stock = stock;
		this.precio = precio;
		this.precio_prov = precio_prov;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGama() {
		return gama;
	}

	public void setGama(String gama) {
		this.gama = gama;
	}

	public String getDimensiones() {
		return dimensiones;
	}

	public void setDimensiones(String dimensiones) {
		this.dimensiones = dimensiones;
	}

	public String getProveedor() {
		return proveedor;
	}

	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getPrecio_prov() {
		return precio_prov;
	}

	public void setPrecio_prov(double precio_prov) {
		this.precio_prov = precio_prov;
	}

	@Override
	public String toString() {
		return "prodcutos [codigo=" + codigo + ", nombre=" + nombre + ", gama=" + gama + ", dimensiones=" + dimensiones
				+ ", proveedor=" + proveedor + ", descripcion=" + descripcion + ", stock=" + stock + ", precio="
				+ precio + ", precio_prov=" + precio_prov + "]";
	}
}
