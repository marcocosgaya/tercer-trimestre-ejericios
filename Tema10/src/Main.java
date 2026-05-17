import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args){
        String ruta = "C:\\descargas\\nuevo_arcivo.bin";
        try{
            FileOutputStream fos = new FileOutputStream(ruta);
            byte[] datos = {65, 66, 67};
            fos.write(datos);
            fos.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}