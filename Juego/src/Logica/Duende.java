package Logica;

import static Logica.Personaje.hilo;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author Mateo
 */
public class Duende extends ConstruirPersonaje implements Cloneable {

    ImageIcon caminar[];
    ImageIcon saltar[];
    ImageIcon morir[];
    ImageIcon atacar[];

    @Override
    public void ConstruirPersonaje() {
        personaje = new Personaje();
        personaje.setHilo(24, 18, 15, 12);
    }

    @Override
    public void CrearAnimaciones() {
        caminar = new ImageIcon[24];
        saltar = new ImageIcon[18];
        morir = new ImageIcon[15];
        atacar = new ImageIcon[12];

        for (int i = 0; i < 24; i++) {
            try {
                caminar[i] = new ImageIcon(ImageIO.read(new File("Recursos\\Goblin\\Walk\\0_Goblin_Walking_" + i + ".png")));
            } catch (IOException ex) {
                Logger.getLogger(Duende.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        for (int i = 0; i < 18; i++) {
            try {
                saltar[i] = new ImageIcon(ImageIO.read(new File("Recursos\\Goblin\\Jump\\0_Goblin_Jump_" + i + ".png")));
            } catch (IOException ex) {
                Logger.getLogger(Duende.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        for (int i = 0; i < 15; i++) {
            try {
                morir[i] = new ImageIcon(ImageIO.read(new File("Recursos\\Goblin\\Die\\0_Goblin_Dying_" + i + ".png")));
            } catch (IOException ex) {
                Logger.getLogger(Duende.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        for (int i = 0; i < 12; i++) {
            try {
                atacar[i] = new ImageIcon(ImageIO.read(new File("Recursos\\Goblin\\Attack\\0_Goblin_Slashing_" + i + ".png")));
            } catch (IOException ex) {
                Logger.getLogger(Duende.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        personaje.setAtacar(atacar);
        personaje.setCaminar(caminar);
        personaje.setMorir(morir);
        personaje.setSaltar(saltar);
    }

    /* public Personaje clone() {
        Duende PersonajeClonado = null;
        try {
            PersonajeClonado = (Duende) super.clone();
            PersonajeClonado.addAnimaciones();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        } // catch	
        return PersonajeClonado;
    } // method clone*/
}
