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
                    lista.agregar(sc);
                    break;

                case 2:
                    lista.mostrarInicioFin();
                    break;

                case 3:
                    lista.mostrarFinInicio();
                    break;

                case 4:
                    lista.buscar(sc);
                    break;

                case 5:
                    lista.eliminar(sc);
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