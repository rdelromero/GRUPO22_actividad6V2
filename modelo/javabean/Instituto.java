package modelo.javabean;
import java.util.ArrayList; import java.util.List;
public class Instituto {
    //Atributos de instancia
	ArrayList<Persona> comunidad;
	
	public Instituto() {
		comunidad=new ArrayList<>();
	}
	
	//Métodos exigidos por la interface
	
	/*Método que recibe un objeto de tipo Persona, busca a esta persona dentro del actual listado de miembros
	 * que forman parte del instituto y si ya forma parte del listado simplemente devuelve false, y si no forma parte del
	 * listado se le añade al listado y devuelve true*/
	public boolean altaPersona(Persona personadardealta) {
		for (Persona miembro: comunidad) {
			if (miembro==personadardealta)
				return false;
		}
		comunidad.add(personadardealta);
		return true;
	}
	
	/*Método que recibe un objeto de tipo String, en concreto el NIF de la persona, buca este NIF dentro del
	 * actual listado de miembros del instituto y si lo encuentra, devuelve la persona que tiene este NIF, y
	 * si no lo encuentra simplemente devuelve NULL*/
	public Persona buscarPersona(String nif) {
		for (Persona persona: comunidad) {
			if (persona.getNif()==nif)
				return persona;
		}
		return null;
	}
	
	/*Método que no recibe ningún parámetro y simplemente devuelve el listado de miembros del instituto*/
	public List<Persona> buscarTodas() {
		return comunidad;
	}
	
	/*Método que recibe un objeto de tipo Persona, busca a esta persona dentro del actual listado de miembros
	 * que forman parte del instituto y si lo encuentra lo elimina del listado y devuelve true, y si no lo
	 * encuentra simplemente devuelve false */
	public boolean eliminarPersona(Persona personaadardebaja) {
		for (Persona miembro: comunidad) {
			if (miembro==personaadardebaja) {
				comunidad.remove(personaadardebaja);
				return true;
		    }
		}
		return false;
	}
	
	/*Método que recibe un String y hace uso del operador de comparación instanceof:
	 * Primero crea una List de tipo Persona llamada listaportipo.
	 * Segundo se pregunta si el String recibido se correponde con alguna clase de entre Profesor, Alumno y Administrativo.
	 * En caso ser alguna de esas clases, recorre la lista de todos los miembros del instituto y aquellos que se correspondan
	 * con esa clase son añadidos a listaportipo.
	 * Tercero devuelve listaportipo*/
	public List<Persona> buscarPersonaPorTipo(String tipoPersona) {
		List<Persona> listaportipo=new ArrayList<>();
		switch (tipoPersona) {
		case "Profesor":
			for (Persona miembro: comunidad) {
				if (miembro instanceof Profesor)
					listaportipo.add(miembro);
			}
			break;
	    case "Alumno":
		    for (Persona miembro: comunidad) {
			    if (miembro instanceof Alumno)
				    listaportipo.add(miembro);
		    }
		    break;
        case "Administrativo":
	        for (Persona miembro: comunidad) {
		        if (miembro instanceof Administrativo)
			        listaportipo.add(miembro);
	        }
	        break;
	    default:
	    	break;
        }
		return listaportipo;
	}
	
	/*Método alternativo a buscarPersonaPorTipo() y que evita la necesidad de citar explícitamente las clases. Este método recibe un String y:
	 * Primero crea una List de tipo Persona llamada listaportipo.
	 * Segundo, recorre el listado de todos los miembros del instituto y para cada miembro se pregunta si su clase en String es el
	 * mismo String que se ha proporcionado al método como parámetro. Si efectivamente lo es, añade el miembro a la listaportipo.
	 * Tercero devuelve listaportipo.*/
	public List<Persona> buscarPersonaPorTipoAlt(String tipoPersona) {
		List<Persona> listaportipo=new ArrayList<>();
		for (Persona miembro: comunidad) {
			if (miembro.getClass().getSimpleName().equals(tipoPersona))
				listaportipo.add(miembro);
		}
		return listaportipo;
	}
	
	/*Método alternativo a buscarPersonaPorTipo(). Este recibe una clase, crea una List de tipo Persona llamada listaportipo, recorre
	el listado de todos los miembros del instituto y si la clase del miembro en cuestión se corresponde con la proporcionada como parámetro
	al método este miembro es añadido a listaportipo. Una vez termina de recorrer el listado devuelve listaportipo.*/
	public List<Persona> buscarPersonaPorTipo(Class tipoPersona) {
		List<Persona> listaportipo=new ArrayList<>();
		for (Persona miembro: comunidad) {
			if (tipoPersona.isInstance(miembro))
		    	  listaportipo.add(miembro);
		}
		return listaportipo;
	}
}
