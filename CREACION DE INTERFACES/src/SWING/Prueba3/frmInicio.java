package SWING.Prueba3;

import javax.swing.*;

public class frmInicio extends JFrame{
    private JPanel PanelPrincipal;
    private JLabel Nombre;
    private JTextField lblEtiqueta;
    private JButton BotonAceptar;
    private JTextField apellidosTextField;
    private JButton salirButton;
    private JButton button1;
    private JButton button2;
    private JButton button3;

    public static void main(String[] args) {
       frmInicio frmInicio = new frmInicio();
    }
    public frmInicio() {
        setContentPane(PanelPrincipal);
        setTitle("Formulario de bienvenida");
        setSize(450,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// Centra la ventana en la pantalla
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
