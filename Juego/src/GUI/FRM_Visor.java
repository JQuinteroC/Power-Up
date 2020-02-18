package GUI;

import Logica.Builder;
import Logica.ConstructorHuevo;
import Logica.Huevo;
import Logica.Mascota;
import Logica.Personaje;
import Logica.Poblacion;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FRM_Visor extends javax.swing.JFrame implements KeyListener {

    ArrayList<Personaje> p = new ArrayList<>();
    ArrayList<Personaje> huevos = new ArrayList<>();
    Poblacion grupo = new Poblacion("Grupo1");
    Poblacion grupo2 = new Poblacion("Grupo2");

    public FRM_Visor(Personaje p, Personaje huevo) {
        // Instancia de la ventana
        initComponents();
        super.setLocationRelativeTo(null);

        // Configuración del personaje y grupo
        p.setPanel(panel);
        this.p.add(p);
        this.p.add(p.clone());
        this.p.add(p.clone());
        this.p.add(p.clone());
        this.p.get(1).setDesplazamientoVertical(45);
        this.p.get(1).setDesplazamientoHorizontal(460);
        this.p.get(2).setDesplazamientoVertical(-10);
        this.p.get(2).setDesplazamientoHorizontal(530);
        this.p.get(3).setDesplazamientoVertical(-10);
        this.p.get(3).setDesplazamientoHorizontal(390);
        panel.add(this.p.get(0));
        panel.add(this.p.get(1));
        panel.add(this.p.get(2));
        panel.add(this.p.get(3));
        //se crean las poblaciones del patron Composite
        grupo.addPersonaje(this.p.get(0));
        grupo2.addPersonaje(this.p.get(1));
        grupo2.addPersonaje(this.p.get(2));
        grupo2.addPersonaje(this.p.get(3));

        //Metiendo al huevito
        huevo.setPanel(panel);
        this.huevos.add(huevo);
        this.huevos.get(0).setDesplazamientoVertical(250);
        this.huevos.get(0).setDesplazamientoHorizontal(480);
        panel.add(this.huevos.get(0));

        // Integración del listener 
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);

    }

    // <editor-fold defaultstate="collapsed" desc="Key listeners">  
    @Override
    public void keyPressed(KeyEvent e) {
        //JOptionPane.showMessageDialog(null, e.getKeyChar());
        for (int i = 0; i < 4; i++) {
            if (colision(p.get(i), huevos.get(0)) == true) {
                
            }
        }
        switch (e.getKeyCode()) { //Personaje Individual
            case 39:
                p.get(0).mover();
                p.get(0).desplazamiento = 39;
                break;
            case 38:
                p.get(0).mover();
                p.get(0).desplazamiento = 38;
                break;
            case 37:
                p.get(0).mover();
                p.get(0).desplazamiento = 37;
                break;
            case 40:
                p.get(0).mover();
                p.get(0).desplazamiento = 40;
                break;
            case 97:
                p.get(0).atacar();
                break;
            case 98:
                p.get(0).saltar();
                break;
            case 99:
                p.get(0).morir();
                break;
            case 80: {              // Quitar y adaptar para que se active al coger el huevo
                /// tambien adaptar a gestion de poblaciones
                ///
                ///
                //
                p.get(0).interrumpir();
                panel.remove(p.get(0));
                Personaje mas;
                try {
                    mas = new Mascota(p.get(0), panel);
                    p.set(0, mas);
                } catch (IOException ex) {
                    Logger.getLogger(FRM_Visor.class.getName()).log(Level.SEVERE, null, ex);
                }
                panel.add(p.get(0));
            }
            break;
            default:
                break;
        }
        switch (e.getKeyChar()) { //Personaje clonado
            case 'w':
                p.get(1).mover();
                p.get(2).mover();
                p.get(3).mover();
                p.get(1).desplazamiento = 38;
                p.get(2).desplazamiento = 38;
                p.get(3).desplazamiento = 38;
                break;
            case 'a':
                p.get(1).mover();
                p.get(2).mover();
                p.get(3).mover();
                p.get(1).desplazamiento = 37;
                p.get(2).desplazamiento = 37;
                p.get(3).desplazamiento = 37;
                break;
            case 's':
                p.get(1).mover();
                p.get(2).mover();
                p.get(3).mover();
                p.get(1).desplazamiento = 40;
                p.get(2).desplazamiento = 40;
                p.get(3).desplazamiento = 40;
                break;
            case 'd':
                p.get(1).mover();
                p.get(2).mover();
                p.get(3).mover();
                p.get(1).desplazamiento = 39;
                p.get(2).desplazamiento = 39;
                p.get(3).desplazamiento = 39;
                break;
            case 'e':
                p.get(1).atacar();
                p.get(2).atacar();  // espacio:32,enter:10,e:69, f:70,a:65, 1:97, 2:98, 3: 99
                p.get(3).atacar();
                break;
            case 'r':
                p.get(1).morir();
                p.get(2).morir();
                p.get(3).morir();
                break;
            case 'f':
                p.get(1).saltar();
                p.get(2).saltar();
                p.get(3).saltar();
                break;
            case 'q':
                FRM_Selector selector = null;
                try {
                    selector = FRM_Selector.getInstance();
                } catch (IOException ex) {
                    Logger.getLogger(FRM_Visor.class.getName()).log(Level.SEVERE, null, ex);
                }
                selector.setVisible(true);

                // Se interrumpe el hilo
                for (int i = 0; i < p.size(); i++) {
                    p.get(i).interrumpir();
                }

                this.dispose();
                break;

            default:
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }// </editor-fold>  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel.setOpaque(false);

        org.jdesktop.layout.GroupLayout panelLayout = new org.jdesktop.layout.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 1200, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 600, Short.MAX_VALUE)
        );

        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 600));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/catarata.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables

    private boolean colision(Personaje p, Personaje huevo) {
        if ((p.getBounds().x > huevo.getX()) & (p.getBounds().x < huevo.getX())) {

        }
        return false;
    }
}
