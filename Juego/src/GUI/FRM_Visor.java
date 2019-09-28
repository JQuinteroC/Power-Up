package GUI;

import Logica.Personaje;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class FRM_Visor extends javax.swing.JFrame implements KeyListener {

    ArrayList<Personaje> p = new ArrayList<>();
    int x = 0;
    int numero = 0;

    public FRM_Visor(Personaje p) {
        // Instancia de la ventana
        initComponents();
        super.setLocationRelativeTo(null);

        // Configuración del personaje
        this.p.add(p);
        this.p.add(p.clone());
        this.p.add(p.clone());
        p.setPanel(panel);
        panel.add(this.p.get(0));
        panel.add(this.p.get(1));
        panel.add(this.p.get(2));

        // Integración del listener 
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }

    // <editor-fold defaultstate="collapsed" desc="Key listeners">  
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == 39) {
            p.get(0).mover();
        }
        if (e.getKeyCode() == 38) {
            p.get(0).saltar();
        }
        if (e.getKeyCode() == 37) {
            p.get(0).atacar();
        }
        if (e.getKeyCode() == 40) {
            p.get(0).morir();
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
        btnRegresar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 590));

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
        
        // Se interrumpe el hilo
        for (int i = 0; i < p.size(); i++) {
            p.get(i).hilo.interrupt();
        }
        
        this.dispose();
    }//GEN-LAST:event_btnRegresarMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
