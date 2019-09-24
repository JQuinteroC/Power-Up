package Logica;

/**
 *
 * @author Mateo
 */
public class Builder {

    private ConstruirPersonaje constructor;

    public void setConstructor(ConstruirPersonaje constructor) {
        this.constructor = constructor;
    }

    public Personaje getPersonaje() {
        return constructor.getPersonaje();

    }

    public void CrearPersonaje() {
        constructor.CrearAnimaciones();
    }
}
