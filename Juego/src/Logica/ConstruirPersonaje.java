package Logica;

/**
 *
 * @author Mateo
 */
public abstract class ConstruirPersonaje {

    protected Personaje personaje;

    public Personaje getPersonaje() {
        return personaje;
    }

    public abstract void ConstruirPersonaje();
    public abstract void CrearAnimaciones();
}
