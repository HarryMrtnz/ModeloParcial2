
public class Conductor {


	private String id;
	private String  nombre;
	private String apellido;
	
	public Conductor(String id, String nombre, String apellido) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return "Conductor [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + "]";
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
	
	
	public void  verListaPajeros() {
		
	}
	
	public void  buscarPasajero() {
		
	}
	
	public void  eliminarPajeros() {
		
	}

	public void  verRecaudacion() {
		
	}
	
}

