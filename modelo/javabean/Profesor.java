package modelo.javabean;
public class Profesor extends Persona {
    //Atributos de instancia
	private String competencias;
	
	//Método constructor
	public Profesor(String nif, String nombre, String direccion, String telefono) {
		super(nif, nombre, direccion, telefono);
	}
	
	//Método getter
	public String getCompetencias() {
		return competencias;
	}
	//Método setter
	public void setCompetencias(String competencias) {
		this.competencias=competencias;
	}
	
	@Override
	public String toString() {
		return "Profesor ["+getNif()+", "+getNombre()+", "+getDireccion() + ", " +getTelefono()+"] "+"Competencias: "+competencias+".";
	}

	//Método exigido en Persona
	public String trabajar() {
		return "El profesor "+getNombre()+ " va a impartir su clase.";
	}
	
	//Métodos propios de la subclase Profesor
	public String ponerNotas() {
		return "El profesor "+getNombre()+" va a corregir los exámenes.";
	}
}
