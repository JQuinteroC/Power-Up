package Logica;

import GUI.FRM_Selector;

/**
 *
 * @author <a href="https://github.com/JQuinteroC">JQuinteroC</a>
 */
public class JuegoIni {
    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        FRM_Selector interfaz = FRM_Selector.getInstance();

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        interfaz.setVisible(true);
    }
}
