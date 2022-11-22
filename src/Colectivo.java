
public class Colectivo {
	private String id;
	private boolean estado;
	private int  capacidad;
	private double precio;

	public Colectivo(String id, boolean estado, int capacidad, double precio) {
		super();
		this.id = id;
		this.estado = estado;
		this.capacidad = capacidad;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Colectivo [id=" + id + ", capacidad=" + capacidad + ", precio=" + precio + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

		public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	public void encender() {
		
	}
	
	public void apagar() {
		
	}
	
}
