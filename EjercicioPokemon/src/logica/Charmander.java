
package logica;

public class Charmander extends Pokemon implements IFuego {

    public Charmander() {
    }
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy charmander, ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy charmander, ataque arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy charmander, ataque mordisco");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Hola soy charmander, ataque puño de fuego");
    }

    @Override
    public void atacarLanzaLlamas() {
        System.out.println("Hola soy charmander, ataque lanza llamas");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Hola soy charmander, ataque ascuas");
    }
}
