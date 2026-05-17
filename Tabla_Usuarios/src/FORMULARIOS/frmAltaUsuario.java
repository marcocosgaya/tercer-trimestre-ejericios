package FORMULARIOS;

import REPOSITORIO.usuarioDAO;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class frmAltaUsuario extends JFrame{
    private JPanel panel1;
    private JButton btnGuardar;
    private JButton btnSalir;
    private JTextField txtUsuario;
    private JTextField txtPassword;
    private JLabel lblUsuario;
    private JLabel lblPassword;
    private JLabel label;

    public  static void main(String[] args) {

        frmAltaUsuario frm = new frmAltaUsuario();
    }
    public frmAltaUsuario() {
        setContentPane(panel1);
        setSize(300, 200);
        setTitle("Usuario Acceso");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                dispose();
            }
        });

        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String usuario = txtUsuario.getText();
                String password = txtPassword.getText();
                usuarioDAO usuarioDAO = new usuarioDAO();
                boolean resultado = usuarioDAO.esUsuarioCorrecto(usuario, password);

                if(resultado == true){
                    label.setText("Usuario existente");
                }else {
                    label.setText("Usuario guardado");
                }
            }
        });


    }


}
