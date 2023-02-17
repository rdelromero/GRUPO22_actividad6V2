package modelo.javabean;

public abstract class Persona {
    //Atributos de instancia
	private String nif, nombre, direccion, telefono;
	
	//Método constructor
	public Persona(String nif, String nombre, String direccion, String telefono) {
		this.nif=nif; this.nombre=nombre; this.direccion=direccion; this.telefono=telefono;
	}
	
	//Métodos getter
	public String getNif() {
		return nif;
	}
	public String getNombre() {
		return nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	
	//Métodos setter
	public void setNif(String nif) {
		this.nif = nif;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Persona [nif=" + nif + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono
				+ "]";
	}
	//Métodos propios
	public String llamar(Persona p) {
		return nombre+" llamando a "+p.getNombre()+".";
	}
	public abstract String trabajar();
}
