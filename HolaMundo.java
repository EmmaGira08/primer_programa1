/* Hola Mundo
    integrantes:
            -Emmanuel Giraldo Arango
            -Juan Pablo Morales Parra
            -David Robinson Hernandez */

import java.util.Scanner;

public class HolaMundo {

    public static void main(String[] args) {
        // Mensaje de bienvenida
        System.out.println("==================================================");
        System.out.println("   ¡Bienvenido al Programa de Bienvenida Java!    ");
        System.out.println("==================================================\n");

        // 2. Instanciar la clase Scanner para leer datos desde la consola
        Scanner scanner = new Scanner(System.in);

        // Solicitar y guardar el nombre del usuario
        System.out.print("Por favor, ingresa tu nombre: ");
        String nombreUsuario = scanner.nextLine();

        // Saludo personalizado con el nombre ingresado
        System.out.println("\n¡Hola, " + nombreUsuario + "! Es un gusto saludarte.");

        // 3. Obtener e imprimir información básica del equipo/sistema operativo
        System.out.println("\n--------------------------------------------------");
        System.out.println("       Información Básica del Sistema:            ");
        System.out.println("--------------------------------------------------");
        
        // Obtener el nombre del sistema operativo
        String osName = System.getProperty("os.name");
        // Obtener la arquitectura del sistema operativo
        String osArch = System.getProperty("os.arch");
        // Obtener la versión de Java que se está ejecutando
        String javaVersion = System.getProperty("java.version");
        // Obtener el número de núcleos/procesadores disponibles para la JVM
        int procesadores = Runtime.getRuntime().availableProcessors();

        // Mostrar la información obtenida
        System.out.println("Sistema Operativo : " + osName + " (" + osArch + ")");
        System.out.println("Versión de Java   : " + javaVersion);
        System.out.println("Núcleos CPU       : " + procesadores);
        System.out.println("--------------------------------------------------");

        // Cerrar el objeto Scanner para liberar recursos
        scanner.close();
        
        System.out.println("\n¡Programa finalizado con éxito!");
    }
}