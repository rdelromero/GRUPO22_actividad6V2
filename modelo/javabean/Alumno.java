package modelo.javabean;
public class Alumno extends Persona {
	//Atributos de instancia
    private String curso;
    
    //Método constructor
	public Alumno(String nif, String nombre, String direccion, String telefono) {
		super(nif, nombre, direccion, telefono);
	}
	
	//Método getter
	public String getCurso() {
		return curso;
	}
	//Método setter
	public void setCurso(String curso) {
		this.curso=curso;
	}
	
	@Override
	public String toString() {
		return "Alumno ["+getNif()+", "+getNombre()+", "+getDireccion() + ", " +getTelefono()+"] "+"Cursando: "+curso+".";
	}
	
	//Método exigido en Persona
	public String trabajar() {
		return "El alumno "+getNombre()+" va a estudiar para el curso "+curso+".";
	}
	//Métodos propios de la subclase Alumno
	public String hacerExamen() {
		return "El alumno "+getNombre()+" va a hacer su examen.";
	}
}
