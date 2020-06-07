package clases;

public class Producto {
	//Atributos...
	private String codigo, descripcion, categoria, marca, unidadMedida;
	private int existencia;
	//Constructor...
	public Producto() {
		this.setCodigo("");
		this.setDescripcion("");
		this.setCategoria("");
		this.setMarca("");
		this.setUnidadMedida("");
		this.setExistencia(0);
	}
	//Métodos Getters y Setters...
	public String getCodigoProducto() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getUnidadMedida() {
		return unidadMedida;
	}

	public void setUnidadMedida(String unidadMedida) {
		this.unidadMedida = unidadMedida;
	}

	public int getExistencia() {
		return existencia;
	}

	public void setExistencia(int existencia) {
		this.existencia = existencia;
	}
	//Métodos
	public int disminuirInventario(int pcantidad){
		return this.existencia-pcantidad;
	}
	public int aumentarInventario(int pcantidad){
		return this.existencia+pcantidad;
	}
}