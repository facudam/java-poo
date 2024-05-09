package logica;


import java.util.List;
import java.util.LinkedList; 

public class LinkedLists {

    public static void main(String[] args) {
         //List<Persona> lista = new ArrayList<Persona> ();
        List<Persona> lista = new LinkedList<>();
        lista.add(new Persona(1, "Ignacio", 34));
        lista.add(new Persona(2, "Cualquiera", 54));
        lista.add(new Persona(3, "Martina", 28));
        lista.add(new Persona(4, "Candy", 4));
        
        // Recorrer por índice:
        
        for (Persona perso:lista) {
            System.out.println("Prueba 2: " + perso.getNombre());
        }
    }
    
}
