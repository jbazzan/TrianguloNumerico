import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Triangulo {
    public static void main(String[] args)
    {
        //Creamos la variable para que imprimir la fecha y hora de cuando inicia el proceso.
        LocalDateTime fechaHoraActual = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String fechaHora = fechaHoraActual.format(formato);

        // Verificamos si es han ingresado argumentos
        if (args.length == 0)
        {
            System.out.println("Se requiere un argumento");
            return;
        }
        // Casteamos los argumentos a enteros.
        int filas = Integer.parseInt(args[0]);
        // Imprimimos la fecha y hora en donde empieza el proceso
        System.out.println("Inicio del proceso: " + fechaHora);
        System.out.println();
        // Vamos a realizar tantas vueltas como indica la variable filas
        for (int i=filas; i>=1; i--)
        {
            // Vamos a imprimir el conteo de la variable filas
            for (int n=1; n<=i; n++)
            {
                System.out.print(n);
            }
            // Dejamos un salto de linea para que se vaya formando el triangulo
            System.out.println();
        }
        // Imprimimos la fecha y hora en donde termina el proceso
        System.out.println();
        System.out.println("Finalizacion del proceso: " + fechaHora);
    }
}
