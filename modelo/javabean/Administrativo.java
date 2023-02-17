package modelo.javabean;
public class Administrativo extends Persona {
	//Atributos de instancia
    private String tareas;
    
    //Método constructor
	public Administrativo(String nif, String nombre, String direccion, String telefono) {
		super(nif, nombre, direccion, telefono);
	}
	
	//Método getter
	public String getTareas() {
		return tareas;
	}
	//Método setter
	public void setTareas(String tareas) {
		this.tareas=tareas;
	}
	
	@Override
	public String toString() {
		return "Administrativo ["+getNif()+", "+getNombre()+", "+getDireccion() + ", " +getTelefono()+"] "+"Tareas: "+tareas+".";
	}
	
	//Método exigido en Persona
	public String trabajar() {
		return "El administrativo "+getNombre()+" va a realizar estas tareas: " +tareas+".";
	}
	//Métodos propios de la subclase Administrativo
	public String gestionarMatricula() {
		return "El administrativo "+getNombre()+" va a gestionar una matrícula.";
	}
}
