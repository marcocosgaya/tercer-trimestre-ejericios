import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.FocusAdapter;

public class monedas extends JFrame {
    private JPanel panel1;
    private JTextField textField1;
    private JComboBox comboBox1;
    private JButton obtenerButton;
    private JButton salirButton;


    public monedas() {
        setContentPane(panel1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setVisible(true);
        setLocationRelativeTo(null);
        setTitle("Monedas");




        obtenerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String valor = comboBox1.getSelectedItem().toString();

                if (valor.equals("Dolares")) {
                    int valorDolares = Integer.parseInt(textField1.getText());
                    int resultado = valorDolares * 100;

                }
            }
        });


        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

    }



    public static void main(String[] args) {
        monedas m = new monedas();

    }


}
