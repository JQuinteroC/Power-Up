package Logica;

import javax.swing.ImageIcon;

/**
 *
 * @author <a href="https://github.com/JQuinteroC">JQuinteroC</a>
 */
public class Mago extends Personaje {

    public Mago() {
        super.setHilo(5, 5, 5, 5, 130);
        super.ancho = 419;
        super.alto = 381;
        super.relacion = true;
        super.caminar = new ImageIcon[5];
        super.saltar = new ImageIcon[5];
        super.morir = new ImageIcon[5];
        super.atacar = new ImageIcon[5];
    }
}
