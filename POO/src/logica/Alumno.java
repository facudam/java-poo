
package logica;

public class Alumno {
    // Debemos declarar los atributos como privados:
    private int id;
    private String nombre;
    private String apellido;

    // Contructores:
    public Alumno() { // Contructor vacío
    }

    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
    
    
    
    
    // Métodos:
    public void mostrarNombre() {
        System.out.println("Hola, soy un alumno y se decir mi nombre");
    }
    
    public void saberSiAprobado(double calificacion) {
        if (calificacion >= 6) {
            System.out.println("Aprobé la materia");
        } else {
            System.out.println("Uy, no aprobé");
        }
    }
}
