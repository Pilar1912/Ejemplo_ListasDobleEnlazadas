import java.util.Scanner;

public class Metodos {

    Nodo inicio;
    Nodo fin;

    // Agregar estudiante al final
    public void agregar(Scanner sc) {

        System.out.print("Ingrese el ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Ingrese el nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese la edad: ");
        int edad = sc.nextInt();

        Nodo nuevo = new Nodo(id, nombre, edad);

        // Si la lista está vacía
        if (inicio == null) {

            inicio = nuevo;
            fin = nuevo;

        } else {

            fin.siguiente = nuevo;
            nuevo.anterior = fin;
            fin = nuevo;
        }

        System.out.println("Estudiante agregado correctamente.");
    }

    // Mostrar desde el inicio hasta el final
    public void mostrarInicioFin() {

        if (inicio == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        Nodo actual = inicio;

        while (actual != null) {

            System.out.println(
                "ID: " + actual.Id +
                " | Nombre: " + actual.Nombre +
                " | Edad: " + actual.Edad
            );

            actual = actual.siguiente;
        }
    }

    // Mostrar desde el final hasta el inicio
    public void mostrarFinInicio() {

        if (fin == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        Nodo actual = fin;

        while (actual != null) {

            System.out.println(
                "ID: " + actual.Id +
                " | Nombre: " + actual.Nombre +
                " | Edad: " + actual.Edad
            );

            actual = actual.anterior;
        }
    }

    // Buscar estudiante por ID
    public void buscar(Scanner sc) {

        System.out.print("Ingrese el ID que desea buscar: ");
        int id = sc.nextInt();

        Nodo actual = inicio;

        while (actual != null) {

            if (actual.Id == id) {

                System.out.println("Estudiante encontrado:");
                System.out.println("ID: " + actual.Id);
                System.out.println("Nombre: " + actual.Nombre);
                System.out.println("Edad: " + actual.Edad);

                return;
            }

            actual = actual.siguiente;
        }

        System.out.println("No se encontró un estudiante con ese ID.");
    }

    // Eliminar estudiante por ID
    public void eliminar(Scanner sc) {

        System.out.print("Ingrese el ID del estudiante a eliminar: ");
        int id = sc.nextInt();

        Nodo actual = inicio;

        while (actual != null) {

            if (actual.Id == id) {

                // Caso 1: es el primer nodo
                if (actual == inicio) {
                    inicio = actual.siguiente;

                    if (inicio != null) {
                        inicio.anterior = null;
                    } else {
                        fin = null;
                    }

                // Caso 2: es el último nodo
                } else if (actual == fin) {

                    fin = actual.anterior;
                    fin.siguiente = null;

                // Caso 3: está en el medio
                } else {

                    actual.anterior.siguiente = actual.siguiente;
                    actual.siguiente.anterior = actual.anterior;
                }

                System.out.println("Estudiante eliminado correctamente.");
                return;
            }

            actual = actual.siguiente;
        }

        System.out.println("No se encontró un estudiante con ese ID.");
    }
}