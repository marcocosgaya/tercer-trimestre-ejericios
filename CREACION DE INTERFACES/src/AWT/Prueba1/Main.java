package AWT.Prueba1;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setSize(400,200);
        frame.setTitle("Prueba 1");

        //crear el label
        Label label = new Label("Prueba 1", Label.CENTER);
        //Añadir el label al frame
        frame.add(label);

        frame.setVisible(true);
    }
}
