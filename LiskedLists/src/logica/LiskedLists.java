
package logica;
import java.util.LinkedList;
import java.util.List;

public class LiskedLists {
    
    // Las linkedList no tienen un índice bien definido, a diferencia de los arrayLists.
   
    public static void main(String[] args) {
         //List<Persona> lista = new ArrayList<Persona> ();
        List<Persona> lista = new LinkedList<> (); //se infiere en tipo.
        
        
        // Agregar personas al FINAL de la lista:
        lista.add(new Persona(1, "Ignacio", 34));
        lista.add(new Persona(2, "Cualquiera", 54));
        lista.add(new Persona(3, "Martina", 28));
        lista.add(new Persona(4, "Candy", 4));
        
        // Agregar al PRINCIPIO de la lista:
        lista.add(0, new Persona(1, "Lorena", 24));
        
        for (Persona perso:lista) {
            System.out.println("Prueba 2: " + perso.getNombre());
        }
    }
    
}
