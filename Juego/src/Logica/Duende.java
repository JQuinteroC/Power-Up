package Logica;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Graphics;

/**
 *
 * @author Mateo
 */
public class Duende extends ConstruirPersonaje implements Cloneable {

    ImageIcon caminar[];
    ImageIcon saltar[];
    ImageIcon morir[];
    ImageIcon atacar[];

    public void ConstruirPersonaje() {
        personaje = new Personaje();
    }

    @Override
    public void CrearAnimaciones() {
        caminar = new ImageIcon[24];
        saltar = new ImageIcon[18];
        morir = new ImageIcon[15];
        atacar = new ImageIcon[12];

        /*for (int i = 0; i < 24; i++) {
            //caminar[i] = new ImageIcon(new ImageIcon(getClass().getResource("Recursos\\Goblin\\Walk\\0_Goblin_Walking_" + i + ".png")).getImage());
            
        }
        for (int i = 0; i < 18; i++) {
            //saltar[i] = new ImageIcon(new ImageIcon(getClass().getResource("Recursos\\Goblin\\Jump\\0_Goblin_Jump_" + i + ".png")).getImage());
            
        }
        for (int i = 0; i < 15; i++) {
            //morir[i] = new ImageIcon(new ImageIcon(getClass().getResource("Recursos\\Goblin\\Die\\0_Goblin_Dying_" + i + ".png")).getImage());
            
        }
        for (int i = 0; i < 12; i++) {
            //atacar[i] = new ImageIcon(new ImageIcon(getClass().getResource("Recursos\\Goblin\\Attack\\0_Goblin_Slashing_" + i + ".png")).getImage());
            
        }*/
        for (int i = 0; i < 24; i++) {
            caminar[i] = new ImageIcon(new ImageIcon(getClass().getResource("/recursos/0_Goblin_Walking_" + i + ".png")).getImage());
        }
        for (int i = 0; i < 6; i++) {
            saltar[i] = new ImageIcon(new ImageIcon(getClass().getResource("/recursos/0_Goblin_Jump Start_" + (i + 1) + ".png")).getImage());
            saltar[11 - i] = new ImageIcon(new ImageIcon(getClass().getResource("/recursos/0_Goblin_Jump Start_" + (i + 1) + ".png")).getImage());
        }
        for (int i = 0; i < 15; i++) {
            morir[i] = new ImageIcon(new ImageIcon(getClass().getResource("/recursos/0_Goblin_Dying_" + i + ".png")).getImage());
        }
        for (int i = 0; i < 12; i++) {
            atacar[i] = new ImageIcon(new ImageIcon(getClass().getResource("/recursos/0_Goblin_Slashing_" + i + ".png")).getImage());
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
