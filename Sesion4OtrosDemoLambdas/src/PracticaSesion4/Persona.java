package PracticaSesion4;

public class Persona {

	private String dni;
	private String nombre;
	private String apellido;
	private String sexo;
	private double altura;
	private double peso;
	
	public Persona() {}

	public Persona(String nombre, String apellido, String sexo, double altura, double peso) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.sexo = sexo;
		this.altura = altura;
		this.peso = peso;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
}
