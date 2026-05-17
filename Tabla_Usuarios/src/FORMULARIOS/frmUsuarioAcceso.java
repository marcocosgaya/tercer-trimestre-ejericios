package FORMULARIOS;

import REPOSITORIO.usuarioDAO;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frmUsuarioAcceso  extends JFrame {
    private JPanel panel1;
    private JButton btnAlta;
    private JButton btnEntrar;
    private JButton btnSalir;
    private JLabel lblAcceso;
    private JTextField txtUsuario;
    private JTextField txtPassword;
    private JLabel lbl;
    private JLabel lblUsuario;
    private JLabel lblPassword;


    public  static void main(String[] args) {
        frmUsuarioAcceso frm = new frmUsuarioAcceso();
    }


    public frmUsuarioAcceso() {
        setContentPane(panel1);
        setSize(300, 200);
        setTitle("Usuario Acceso");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });

        btnEntrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String nombre = txtUsuario.getText();
                String password = txtPassword.getText();
                //JOptionPane.showMessageDialog(null, "Usuario "+nombre+"Password"+password);
                usuarioDAO usuarioDAO = new usuarioDAO();
                boolean resultadoAcceso = usuarioDAO.esUsuarioCorrecto(nombre, password);
                JOptionPane.showMessageDialog(null, resultadoAcceso);
            }
        });
    }


}
