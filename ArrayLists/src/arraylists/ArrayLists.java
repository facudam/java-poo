
package arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

    public static void main(String[] args) {
        
        List<Persona> lista = new ArrayList<Persona> ();
        lista.add(new Persona(1, "Facundo", 34));
        lista.add(new Persona(2, "Cualquiera", 54));
        lista.add(new Persona(3, "Catalina", 28));
        lista.add(new Persona(4, "Candy", 4));
        
        // Recorrer por índice:
        //Utilizamos .size() porque en una collections y el tamaño puede variar.
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Prueba: " + lista.get(i).getNombre());
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        //Recorrido foreach:
        for (Persona perso:lista) {
            System.out.println("Prueba 2: " + perso.getNombre());
        }
    }
    
}
