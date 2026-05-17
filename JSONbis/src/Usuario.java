
    public class Usuario {
        private String nombre;
        private int edad;
        private String email;

        // Constructor vacío (necesario para Jackson)
        public Usuario() {
        }

        // Constructor con parámetros
        public Usuario(String nombre, int edad, String email) {
            this.nombre = nombre;
            this.edad = edad;
            this.email = email;
        }

        // Getters y setters (OBLIGATORIO para Jackson)
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        // Método toString() para imprimir el objeto
        @Override
        public String toString() {
            return "Usuario{" +
                    "nombre='" + nombre + '\'' +
                    ", edad=" + edad +
                    ", email='" + email + '\'' +
                    '}';
        }
    }
