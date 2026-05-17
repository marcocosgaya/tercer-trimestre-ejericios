package HolaMundo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HolaMundo extends JFrame {
    private JPanel panel1;
    private JButton pulsarButton;

    public HolaMundo() {
        setTitle("Hola Mundo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel1);
        setSize(400,400);
        setVisible(true);


        pulsarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               JOptionPane.showMessageDialog(null,"Hola Mundo!") ;
            }
        });


    }
    public static void main(String[] args) {
        HolaMundo h = new HolaMundo();
    }
}
