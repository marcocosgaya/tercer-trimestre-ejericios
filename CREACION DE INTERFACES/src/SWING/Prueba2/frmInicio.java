package SWING.Prueba2;

import javax.swing.*;
import java.awt.*;

public class frmInicio extends JFrame {
    private JPanel Panel1;
    private JLabel lblTexto;
    public static  void main(String[] args) {
        frmInicio frm = new frmInicio();

    }
    public frmInicio() {
        setContentPane(Panel1);
        setTitle("Formulario de bienvenida");
        setSize(450,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// Centra la ventana en la pantalla
        setLocationRelativeTo(null);
        lblTexto.setText("Hola mundo");
        setVisible(true);
    }

}


