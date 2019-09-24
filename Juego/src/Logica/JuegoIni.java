package Logica;

import GUI.FRM_Selector;
import java.io.IOException;

/**
 *
 * @author <a href="https://github.com/JQuinteroC">JQuinteroC</a>
 */
public class JuegoIni {

    public static void main(String[] args) throws IOException {
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
