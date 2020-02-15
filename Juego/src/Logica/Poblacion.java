package Logica;

import java.util.ArrayList;

/**
 *
 * @author Mateo
 */
public class Poblacion implements Composite {

    private String nombrePoblacion = "";
    ArrayList<Composite> poblacion = new ArrayList<Composite>();

    public Poblacion(String nombre) {
        this.nombrePoblacion=nombre;
    }

    @Override
    public void operacion(int accion) {

        for (int i = 0; i < poblacion.size(); i++) {
            poblacion.get(i).operacion(accion);
        }

    }

    public void addPersonaje(Composite p) {
        this.poblacion.add(p);
    }

}
