package logica;

public class POO {

    public static void main(String[] args) {
        
        Alumno aluVacio = new Alumno();
        Alumno alu1 = new Alumno(1, "Facundo", "Cáceres");
        
        System.out.println("La id del alumno 1 es: " + alu1.getId());
        
        aluVacio.setNombre("Candynator");
        System.out.println("El nombre ya no está vacío: " + aluVacio.getNombre());
    }
}
