package testing;
import modelo.javabean.Persona;
import modelo.javabean.Profesor; import modelo.javabean.Alumno; import modelo.javabean.Administrativo;

public class Testing1 {
    public static void main (String[] args) {
    	Profesor profesor1 = new Profesor("51663221R", "Carlos Robles", "C/ Pez volador, 35", "516669922");
    	profesor1.setCompetencias("Matemáticas y Lengua española");
    	Alumno alumno1 = new Alumno("53222441A", "Alicia Torres", "C/ Luna lunera, 45", "639889998");
    	alumno1.setCurso("1.º Bachillerato");
    	Administrativo administrativo1 = new Administrativo("12345441A", "Rosa Torres", "C/ Luna llena, 25", "639889999");
    	administrativo1.setTareas("Hacer matrículas, controlar asistencia");
    	
    	System.out.println(profesor1);
    	System.out.println(alumno1);
    	System.out.println(administrativo1);
    	System.out.println(profesor1.trabajar());
    	System.out.println(alumno1.trabajar());
    	System.out.println(administrativo1.trabajar());
    	System.out.println(alumno1.llamar(profesor1));
    	System.out.println(profesor1.ponerNotas());
    	System.out.println(alumno1.hacerExamen());
    	System.out.println(administrativo1.gestionarMatricula());
    }
}
