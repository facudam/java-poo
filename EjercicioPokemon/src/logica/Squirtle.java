
package logica;


public class Squirtle extends Pokemon implements IAgua {

    public Squirtle() {
    }
    
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy squirtle, ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy squirtle, ataque arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy squirtle, ataque mordisco");
    }

    @Override
    public void atacarHidroBomba() {
        System.out.println("Hola soy squirtle, ataque hidrobomba");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Hola soy squirtle, ataque burbuja");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Hola soy squirtle, ataque pistola de agua");
    }
}
