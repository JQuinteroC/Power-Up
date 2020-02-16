package Logica;

import java.io.IOException;
import javax.swing.JPanel;

/**
 *
 * @author <a href="https://github.com/JQuinteroC">JQuinteroC</a>
 */
public abstract class Decorador extends Personaje {

    protected Personaje personaje;

    public Decorador(Personaje personaje, JPanel panel) throws IOException {
        this.personaje = personaje;
        this.personaje.setPanel(panel);
    }
}

