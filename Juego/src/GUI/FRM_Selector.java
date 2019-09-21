package GUI;

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

        lblMago = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblMago.setText("jLabel1");
        lblMago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMagoMouseClicked(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(104, 104, 104)
                .add(lblMago)
                .addContainerGap(255, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(125, 125, 125)
                .add(lblMago)
                .addContainerGap(159, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblMagoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMagoMouseClicked
        FRM_Visor ventana = new FRM_Visor();
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblMagoMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblMago;
    // End of variables declaration//GEN-END:variables
}
