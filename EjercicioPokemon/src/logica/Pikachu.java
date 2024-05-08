
package logica;

public class Pikachu extends Pokemon implements IElectrico {

    public Pikachu() {
    }
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy pikachu, ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy pikachu, ataque arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy pikachu, ataque mordisco");
    }

    @Override
    public void atacarImpactTrueno() {
        System.out.println("Hola soy pikachu, ataque impact trueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Hola soy pikachu, ataque puño trueno");
    }
}
