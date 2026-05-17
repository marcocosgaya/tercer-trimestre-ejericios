package EJERCICIO1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frmDAMCalculadora extends JFrame{

    private JPanel panel1;
    private JTextField Numero1;
    private JTextField Numero2;
    private JButton calcularButton;
    private JRadioButton Restar;
    private JRadioButton Multiplicar;
    private JRadioButton Sumar;
    private JRadioButton Dividir;
    private JButton salirButton;
    private JLabel etiquetaInformación;

    public static void  main(String[] args) {
        frmDAMCalculadora frame = new frmDAMCalculadora();
    }

   public  frmDAMCalculadora(){
       setContentPane(panel1);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setSize(400,300);
       setVisible(true);
       setTitle("Formulario 1º DAM - Calculadora");


       salirButton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               System.exit(0);
           }
       });
       calcularButton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {

               if(Sumar.isSelected()){

               }
           }
       });
   }
}
