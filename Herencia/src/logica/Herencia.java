package logica;

public class Herencia {

    public static void main(String[] args) {
     
        Empleado emple1 = new Empleado();
        
        emple1.getId();
        
        Consultor con1 = new Consultor();
        
        con1.setApellido("Cáceres");
        
        System.out.println("El nombre del consultor 1 es: " + con1.apellido);
        
        // Polimorfismo:
        //Tanto las clases EMpleado, Consultor y Jefe son hijos de Persona, por 
        //eso es que nos permite ingresarlas dentro de un vector de tipo Persona.
        Persona vector[] = new Persona [4];
        vector[0] = new Persona();
        vector[1] = new Empleado();
        vector[2] = new Consultor();
        vector[3] = new Jefe();
    }
    
    Persona perso = new Persona();
    Consultor consul = new Consultor();
    
    //perso = consul; no se por qué me tira error.
    
}
