package logica;

public class EjercicioPokemon {

    public static void main(String[] args) {
        Squirtle squirtle = new Squirtle ();
        Charmander charmander = new Charmander ();
        Bulbasaur bulba = new Bulbasaur ();
        Pikachu pika = new Pikachu();
        
        squirtle.atacarAraniazo();
        squirtle.atacarHidroBomba();
        
        charmander.atacarPlacaje();
        charmander.atacarLanzaLlamas();
        
        bulba.atacarMordisco();
        bulba.atacarParalizar();
        
        pika.atacarAraniazo();
        pika.atacarImpactTrueno();
    }
    
}
