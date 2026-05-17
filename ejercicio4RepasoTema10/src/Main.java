import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            Vehiculo[] vehiculos = objectMapper.readValue(new File("c:\\descargas\\vehiculo.json"), Vehiculo[].class);
            int contador2016=0;
            int contador2017=0;
            int contador2018=0;
            int contador2019=0;
            int contador2020=0;



            for (Vehiculo v : vehiculos) {
                if (v.getAnio() == 2016) {
                    contador2016++;
                }else if (v.getAnio() == 2017) {
                    contador2017++;
                }else if (v.getAnio() == 2018) {
                    contador2018++;
                }else if (v.getAnio() == 2019) {
                    contador2019++;
                }else if (v.getAnio() == 2020) {
                    contador2020++;
                }


            }

            System.out.println("Vehículos 2016: " + contador2016);
            System.out.println("Vehículos 2017: " + contador2017);
            System.out.println("Vehículos 2018: " + contador2018);
            System.out.println("Vehículos 2019: " + contador2019);
            System.out.println("Vehículos 2020: " + contador2020);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
