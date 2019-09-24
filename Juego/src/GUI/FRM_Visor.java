package GUI;

import Logica.Personaje;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.Graphics;
import javax.swing.JOptionPane;

public class FRM_Visor extends javax.swing.JFrame implements Runnable {

    Thread hilo;
    Personaje p;
    int x = 0;
    int numero = 0;

    public FRM_Visor(Personaje p) {
        initComponents();
        super.setLocationRelativeTo(null);
        this.p = p;
        p.setPanel(panel);
        panel.add(p);
        hilo = new Thread(this);
        // hilo.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        btnRegresar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel.setOpaque(false);

        org.jdesktop.layout.GroupLayout panelLayout = new org.jdesktop.layout.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 640, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 540, Short.MAX_VALUE)
        );

        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 640, 540));

        btnRegresar.setText("jButton1");
        btnRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegresarMouseClicked(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 10, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/catarata.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseClicked
        FRM_Selector selector = null;
        try {
            selector = FRM_Selector.getInstance();
        } catch (IOException ex) {
            Logger.getLogger(FRM_Visor.class.getName()).log(Level.SEVERE, null, ex);
        }
        selector.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarMouseClicked

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        JOptionPane.showMessageDialog(null, "Si Sirvo");
        if (evt.getKeyCode() == 39) {
            p.mover();
        }
        if (evt.getKeyCode() == 38) {
            p.saltar();
        }
        if (evt.getKeyCode() == 37) {
            p.Atacar();
        }
        if (evt.getKeyCode() == 40) {
            p.Morir();
        }
    }//GEN-LAST:event_formKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables

    public void run() {
        try {
            while (true) {
                if (x == 0) {
                    numero++;
                    numero = numero % 24;

                    this.repaint();

                    hilo.sleep(80);
                } else if (x == 1) {
                    numero++;
                    numero = numero % 12;

                    this.repaint();

                    hilo.sleep(80);
                } else if (x == 2) {
                    numero++;
                    numero = numero % 15;

                    this.repaint();

                    hilo.sleep(80);
                } else if (x == 3) {
                    numero++;
                    numero = numero % 12;

                    this.repaint();

                    hilo.sleep(80);
                }
            }

        } catch (java.lang.InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
