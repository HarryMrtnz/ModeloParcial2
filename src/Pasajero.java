
public class Pasajero {

	private String id;
	private String  nombre;
	private String apellido;
	private int edad;
	private double saldo;
	
	
	
	public Pasajero(String id, String nombre, String apellido, int edad, double saldo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.saldo = saldo;
	}


	@Override
	public String toString() {
		return "Pasajero [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", saldo="
				+ saldo + "]";
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
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


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}

	
	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	

	public void subir() {
		
	}
	
	public void bajar(){
		
	}
	
	public void pagar() {
		
	}

}
