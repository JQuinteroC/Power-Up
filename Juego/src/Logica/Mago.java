package Logica;

import javax.swing.ImageIcon;

/**
 *
 * @author <a href="https://github.com/JQuinteroC">JQuinteroC</a>
 */
public class Mago extends ConstruirPersonaje implements Cloneable {

    ImageIcon caminar[];
    ImageIcon saltar[];
    ImageIcon morir[];
    ImageIcon atacar[];

    public void ConstruirPersonaje() {
        personaje = new Personaje();
    }

    @Override
    public void CrearAnimaciones() {
        caminar = new ImageIcon[5];
        saltar = new ImageIcon[5];
        morir = new ImageIcon[5];
        atacar = new ImageIcon[5];

        for (int i = 0; i < 5; i++) {
            caminar[i] = new ImageIcon(new ImageIcon(getClass().getResource("Recursos\\Wizard\\Walk\\2_WALK_" + i + ".png")).getImage());
        }
        for (int i = 0; i < 5; i++) {
            saltar[i] = new ImageIcon(new ImageIcon(getClass().getResource("Recursos\\Wizard\\Jump\\4_JUMP_" + i + ".png")).getImage());
        }
        for (int i = 0; i < 5; i++) {
            morir[i] = new ImageIcon(new ImageIcon(getClass().getResource("Recursos\\Wizard\\Die\\7_DIE_" + i + ".png")).getImage());
        }
        for (int i = 0; i < 5; i++) {
            atacar[i] = new ImageIcon(new ImageIcon(getClass().getResource("Recursos\\Wizard\\Attack\\5_ATTACK_" + i + ".png")).getImage());
        }

        personaje.setAtacar(atacar);
        personaje.setCaminar(caminar);
        personaje.setMorir(morir);
        personaje.setSaltar(saltar);
    }

    /* public Personaje clone() {
        Mago PersonajeClonado = null;
        try {
            PersonajeClonado = (Mago) super.clone();
            PersonajeClonado.addAnimaciones();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        } // catch	
        return PersonajeClonado;
    } // method clone*/
}
