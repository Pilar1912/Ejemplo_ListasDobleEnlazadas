import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Metodos lista = new Metodos();

        int opcion;

        do {

            System.out.println("\n===== LISTA DOBLEMENTE ENLAZADA =====");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Mostrar de inicio a fin");
            System.out.println("3. Mostrar de fin a inicio");
            System.out.println("4. Buscar estudiante");
            System.out.println("5. Eliminar estudiante");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    String respuestaA = lista.agregar(sc);
                    System.out.println(respuestaA);
                    break;

                case 2:
                    String respuestaB = lista.mostrarInicioFin();
                    System.out.println(respuestaB);
                    break;

                case 3:
                    String respuestaC = lista.mostrarFinInicio();
                    System.out.println(respuestaC);
                    break;

                case 4:
                    String respuestaD = lista.buscar(sc);
                    System.out.println(respuestaD);
                    break;

                case 5:
                    String respuestaE = lista.eliminar(sc);
                    System.out.println(respuestaE);
                    break;

                case 6:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 6);

        sc.close();
    }
}