package Logica;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author <a href="https://github.com/JQuinteroC">JQuinteroC</a>
 */
public class Mago extends ConstruirPersonaje {

    ImageIcon caminar[];
    ImageIcon saltar[];
    ImageIcon morir[];
    ImageIcon atacar[];

    public void ConstruirPersonaje() {
        personaje = new Personaje();
        personaje.setHilo(5, 5, 5, 5, 100);
        personaje.ancho = 419;
        personaje.alto = 381;
        personaje.relacion = true;
    }

    @Override
    public void CrearAnimaciones() {
        caminar = new ImageIcon[5];
        saltar = new ImageIcon[5];
        morir = new ImageIcon[5];
        atacar = new ImageIcon[5];

        for (int i = 0; i < 5; i++) {
            try {
                caminar[i] = new ImageIcon(ImageIO.read(new File("Recursos\\Wizard\\Walk\\2_WALK_" + i + ".png")));
            } catch (IOException ex) {
                Logger.getLogger(Mago.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        for (int i = 0; i < 5; i++) {
            try {
                saltar[i] = new ImageIcon(ImageIO.read(new File("Recursos\\Wizard\\Jump\\4_JUMP_" + i + ".png")));
            } catch (IOException ex) {
                Logger.getLogger(Mago.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        for (int i = 0; i < 5; i++) {
            try {
                morir[i] = new ImageIcon(ImageIO.read(new File("Recursos\\Wizard\\Die\\7_DIE_" + i + ".png")));
            } catch (IOException ex) {
                Logger.getLogger(Mago.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        for (int i = 0; i < 5; i++) {
            try {
                atacar[i] = new ImageIcon(ImageIO.read(new File("Recursos\\Wizard\\Attack\\5_ATTACK_" + i + ".png")));
            } catch (IOException ex) {
                Logger.getLogger(Mago.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        personaje.setAtacar(atacar);
        personaje.setCaminar(caminar);
        personaje.setMorir(morir);
        personaje.setSaltar(saltar);
    }

}
