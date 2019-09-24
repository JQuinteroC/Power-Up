package GUI;

import Logica.Builder;
import Logica.Duende;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author <a href="https://github.com/JQuinteroC">JQuinteroC</a>
 */
public class FRM_Selector extends javax.swing.JFrame {

    private static FRM_Selector GUI;

    /**
     * Creates new form FRM_Selector
     */
    private FRM_Selector() throws IOException {
        initComponents();
        super.setLocationRelativeTo(null);
        Image s = ImageIO.read(new File("Recursos\\Wizard\\Idle\\1_IDLE_000.png"));
        ImageIcon l = new ImageIcon(s.getScaledInstance(387, 350, Image.SCALE_SMOOTH));
        lblMago.setIcon(l);

        s = ImageIO.read(new File("Recursos\\Goblin\\Idle\\Goblin_Idle_000.png"));
        l = new ImageIcon(s.getScaledInstance(387, 350, Image.SCALE_SMOOTH));
        lblOgro.setIcon(l);
    }

    public static FRM_Selector getInstance() throws IOException {
        if (GUI == null) {
            try {
                GUI = new FRM_Selector();
            } catch (IOException ex) {
                Logger.getLogger(FRM_Selector.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return GUI;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblMago = new javax.swing.JLabel();
        lblOgro = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        lblMago.setFocusable(false);
        lblMago.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblMago.setMaximumSize(new java.awt.Dimension(387, 350));
        lblMago.setMinimumSize(new java.awt.Dimension(387, 350));
        lblMago.setPreferredSize(new java.awt.Dimension(387, 350));
        lblMago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMagoMouseClicked(evt);
            }
        });

        lblOgro.setToolTipText("");
        lblOgro.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblOgro.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lblOgro.setMaximumSize(new java.awt.Dimension(387, 350));
        lblOgro.setMinimumSize(new java.awt.Dimension(387, 350));
        lblOgro.setPreferredSize(new java.awt.Dimension(387, 350));
        lblOgro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lblOgro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOgroMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        jLabel2.setText("Selector");

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jLabel2)
                .add(336, 336, 336))
            .add(jPanel1Layout.createSequentialGroup()
                .add(21, 21, 21)
                .add(lblMago, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(28, 28, 28)
                .add(lblOgro, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(14, 14, 14)
                .add(jLabel2)
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(lblMago, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(lblOgro, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblMagoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMagoMouseClicked
        //FRM_Visor ventana = new FRM_Visor();
        //ventana.setVisible(true);
        //this.setVisible(false);
    }//GEN-LAST:event_lblMagoMouseClicked

    private void lblOgroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOgroMouseClicked
        Builder build = new Builder();
        build.setConstructor(new Duende());
        build.CrearPersonaje();
        FRM_Visor ventana = new FRM_Visor(build.getPersonaje());
        ventana.setVisible(true);
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_lblOgroMouseClicked

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        JOptionPane.showMessageDialog(null, "Si Sirvo");    
        
    }//GEN-LAST:event_formKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblMago;
    private javax.swing.JLabel lblOgro;
    // End of variables declaration//GEN-END:variables
}
