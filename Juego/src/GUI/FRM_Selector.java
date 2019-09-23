package GUI;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author <a href="https://github.com/JQuinteroC">JQuinteroC</a>
 */
public class FRM_Selector extends javax.swing.JFrame {
    private static FRM_Selector GUI;
    
    /**
     * Creates new form FRM_Selector
     */
    private FRM_Selector() {
        initComponents();
        super.setLocationRelativeTo(null);
        
        Image img= new ImageIcon("/GUI/0_Goblin_Idle_000.png").getImage();
        ImageIcon img2=new ImageIcon(img.getScaledInstance(300, 300, Image.SCALE_SMOOTH));
        lblOgro.setIcon(img2);
    }
    
    public static FRM_Selector getInstance() {
        if (GUI == null) {
            GUI = new FRM_Selector();
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

        lblMago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/1_IDLE_000.png"))); // NOI18N
        lblMago.setFocusable(false);
        lblMago.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblMago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMagoMouseClicked(evt);
            }
        });

        lblOgro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/0_Goblin_Idle_000.png"))); // NOI18N
        lblOgro.setToolTipText("");
        lblOgro.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblOgro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblOgro.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lblOgro.setMaximumSize(new java.awt.Dimension(387, 350));
        lblOgro.setMinimumSize(new java.awt.Dimension(387, 350));
        lblOgro.setPreferredSize(new java.awt.Dimension(387, 350));
        lblOgro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        jLabel2.setText("Selector");

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(24, 24, 24)
                .add(lblMago)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 59, Short.MAX_VALUE)
                .add(lblOgro, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(30, 30, 30))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jLabel2)
                .add(336, 336, 336))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .add(28, 28, 28)
                .add(jLabel2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 51, Short.MAX_VALUE)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(lblOgro, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lblMago))
                .add(47, 47, 47))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        FRM_Visor ventana = new FRM_Visor();
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblMagoMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblMago;
    private javax.swing.JLabel lblOgro;
    // End of variables declaration//GEN-END:variables
}
