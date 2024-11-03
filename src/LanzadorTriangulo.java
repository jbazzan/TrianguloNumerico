public class LanzadorTriangulo {
    public static void main(String[] args) {
        // Inicializamos un array con los parametros que se especifica en la actividad
        int[] filas = {5, 7, 9};

        // Guardamos el classpath para que los procesos puedan encontrar la clase Triangulo
        String classpath = System.getProperty("java.class.path");

        // Lanzamos los tres procesos de forma simultanea
        for (int numero : filas) {
            try{
                // Creamos el proceso utilizando ProcessBuilder
                ProcessBuilder pb = new ProcessBuilder("java", "-cp", classpath, "Triangulo", String.valueOf(numero));
                // Redirigimos la salida a un archivo
                pb.redirectOutput(new java.io.File("triangulo" + numero + ".txt"));
                // Redirigimos cualquier error también al archivo
                pb.redirectErrorStream(true);

                // Iniciar el proceso
                Process p = pb.start();
                System.out.println("Iniciando el proceso para el triangulo de " + numero + " filas.");
            } catch (Exception e) {
                System.out.println("Error al iniciar el proceso para el triangulo de " + numero + "." + e.getMessage());
            }
        }

    }
}
