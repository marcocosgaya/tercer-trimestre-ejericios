package SWING.Prueba1;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class frmInicio extends JFrame {

    public frmInicio() {
        setSize(400, 200);
        setTitle("Hola mundo!");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new frmInicio();
        });
    }
}
