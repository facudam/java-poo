
package logica;

public class Bulbasaur extends Pokemon implements IPlanta {

    public Bulbasaur() {
    }
    
    

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy bulbasaur, ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy bulbasaur, ataque arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy bulbasaur, ataque mordisco");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Hola soy bulbasaur, ataque drenaje");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Hola soy bulbasaur, ataque paralizar");
    }
    
}
