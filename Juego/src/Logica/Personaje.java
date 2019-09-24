package Logica;

import javax.swing.ImageIcon;

/**
 *
 * @author Mateo
 */
public class Personaje {

    private ImageIcon[] caminar;
    private ImageIcon[] saltar;
    private ImageIcon[] morir;
    private ImageIcon[] atacar;

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
}
