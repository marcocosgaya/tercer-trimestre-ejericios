package SWING.Prueba4;

import javax.swing.*;

public class formControles extends JFrame {
    private JPanel panel1;
    private JCheckBox aceptarCondicionesCheckBox;
    private JPanel panel2;
    private JButton generarAcciónButton;
    private JButton salirButton;
    private JButton button1;
    private JPasswordField passwordField1;
    private JRadioButton madridRadioButton;
    private JRadioButton barcelonaRadioButton;
    private JRadioButton valenciaRadioButton;
    private JComboBox comboBox1;
    private JButton btnVentana;

    public static  void main(String[] args) {

        formControles f = new formControles();
    }

    public formControles() {
        setContentPane(panel1);
        setTitle("Formulario de bienvenida");
        setSize(450,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// Centra la ventana en la pantalla
        setLocationRelativeTo(null);
        setVisible(true);
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(madridRadioButton);
        buttonGroup.add(barcelonaRadioButton);
        buttonGroup.add(valenciaRadioButton);
        madridRadioButton.setActionCommand("Opcion1");
        barcelonaRadioButton.setActionCommand("Opcion2");
        valenciaRadioButton.setActionCommand("Opcion3");

        //tring resultRadioButton = buttonGroup.getSelection().getActionCommand();
        //

        String[] array = {"Madrid", "Barcelona", "Valencia"};
        for (String s : array) {
            comboBox1.addItem(s);
        }


        String valor = comboBox1.getSelectedItem().toString();
        int indice  = comboBox1.getSelectedIndex();
        JOptionPane.showMessageDialog(null, indice + " -+ " + valor);

    }


}
