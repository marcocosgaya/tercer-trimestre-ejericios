import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
public class Main{
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
// Crear JSON desde un objeto
            Usuario usuario = new Usuario("Carlos López", 28, "carlos@example.com");
            objectMapper.writeValue(new File("C:\\descargas\\usuario.json"), usuario);
            System.out.println("Archivo JSON creado correctamente.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}