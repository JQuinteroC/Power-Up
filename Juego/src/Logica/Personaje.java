package Logica;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JPanel;

/**
 *
 * @author Mateo
 */
public class Personaje extends JComponent implements Cloneable {

    private ImageIcon[] caminar;
    private ImageIcon[] saltar;
    private ImageIcon[] morir;
    private ImageIcon[] atacar;
    static int x = 0;
    static int numero = 0;
    static JPanel panel = null;
    static Thread hilo;

    public void setHilo(int mover, int saltar, int morir, int atacar) {
        Personaje.hilo = new Thread() {
            @Override
            public void run() {
                try {
                    while (true) {
                        if (x == 0) {
                            numero++;
                            numero = numero % mover;

                            panel.repaint();

                            hilo.sleep(80);
                        } else if (x == 1) {
                            numero++;
                            numero = numero % saltar;

                            panel.repaint();

                            hilo.sleep(80);
                        } else if (x == 2) {
                            numero++;
                            numero = numero % morir;

                            panel.repaint();

                            hilo.sleep(80);
                        } else if (x == 3) {
                            numero++;
                            numero = numero % atacar;

                            panel.repaint();

                            hilo.sleep(80);
                        }
                    }
                } catch (java.lang.InterruptedException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        };
    }

    public Personaje clone() {
        Personaje PersonajeClonado = null;
        try {
            PersonajeClonado = (Personaje) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        } // catch	
        return PersonajeClonado;
    } // method clone

    public void setPanel(JPanel panel) {
        Personaje.panel = panel;
        setBounds(0, 0, panel.getWidth(), panel.getHeight());
    }

    public ImageIcon[] getCaminar() {
        return caminar;
    }

    public void setCaminar(ImageIcon[] caminar) {
        this.caminar = caminar;
    }

    public ImageIcon[] getSaltar() {
        return saltar;
    }

    public void setSaltar(ImageIcon[] saltar) {
        this.saltar = saltar;
    }

    public ImageIcon[] getMorir() {
        return morir;
    }

    public void setMorir(ImageIcon[] morir) {
        this.morir = morir;
    }

    public ImageIcon[] getAtacar() {
        return atacar;
    }

    public void setAtacar(ImageIcon[] atacar) {
        this.atacar = atacar;
    }

    public void paint(Graphics g) {
        if (x == 0) {
            g.drawImage(caminar[numero].getImage(), 50, 0, 587, 556, null);
        }
        if (x == 1) {
            g.drawImage(saltar[numero].getImage(), 50, 0, 587, 556, null);
        }
        if (x == 2) {
            g.drawImage(morir[numero].getImage(), 50, 0, 587, 556, null);
        }
        if (x == 3) {
            g.drawImage(atacar[numero].getImage(), 50, 0, 587, 556, null);
        }
    }

    static public void mover() {
        x = 0;
        numero = 0;
        if (!hilo.isAlive()) {
            hilo.start();
        }
    }

    static public void saltar() {
        x = 1;
        numero = 0;
        if (!hilo.isAlive()) {
            hilo.start();
        }
    }

    static public void morir() {
        x = 2;
        numero = 0;
        if (!hilo.isAlive()) {
            hilo.start();
        }
    }

    static public void atacar() {
        x = 3;
        numero = 0;
        if (!hilo.isAlive()) {
            hilo.start();
        }
    }
}
