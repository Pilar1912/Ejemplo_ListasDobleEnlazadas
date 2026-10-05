import java.util.Scanner;

public class Metodos {

    Nodo cabeza;
    Nodo cola;

    // Agregar estudiante al final
    public String agregar(Scanner sc) {
        String respuesta = null;

        System.out.print("Ingrese el ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Ingrese el nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese la edad: ");
        int edad = sc.nextInt();

        Nodo nuevo = new Nodo(id, nombre, edad);

        // Si la lista está vacía
        if (cabeza == null) {

            cabeza = nuevo;
            cola = nuevo;

        } else {

            cola.siguiente = nuevo;
            nuevo.anterior = cola;
            cola = nuevo;
        }

        respuesta = "Estudiante agregado correctamente.";
        return respuesta;
    }

    // Mostrar desde el inicio hasta el final
    public String mostrarInicioFin() {
        String respuesta = "";

        if (cabeza == null) {
            respuesta = "La lista está vacía.";
            return respuesta;
        }

        Nodo actual = cabeza;

        while (actual != null) {

            System.out.println(
                "ID: " + actual.Id +
                " | Nombre: " + actual.Nombre +
                " | Edad: " + actual.Edad
            );

            actual = actual.siguiente;
        }
        return respuesta;
    }

    // Mostrar desde el final hasta el inicio
    public String mostrarFinInicio() {
        String respuesta = "";

        if (cola == null) {
            respuesta = "La lista está vacía.";
            return respuesta;
        }

        Nodo actual = cola;

        while (actual != null) {

            System.out.println(
                "ID: " + actual.Id +
                " | Nombre: " + actual.Nombre +
                " | Edad: " + actual.Edad
            );

            actual = actual.anterior;
        }
        return respuesta;
    }

    // Buscar estudiante por ID
    public String buscar(Scanner sc) {

        System.out.print("Ingrese el ID que desea buscar: ");
        int id = sc.nextInt();

        Nodo actual = cabeza;

        while (actual != null) {

            if (actual.Id == id) {

                System.out.println("Estudiante encontrado:");
                System.out.println("ID: " + actual.Id);
                System.out.println("Nombre: " + actual.Nombre);
                System.out.println("Edad: " + actual.Edad);

                return "Estudiante encontrado.";
            }

            actual = actual.siguiente;
        }

        return "No se encontró un estudiante con ese ID.";
    }

    // Eliminar estudiante por ID
    public String eliminar(Scanner sc) {
        String respuesta = null;

        System.out.print("Ingrese el ID del estudiante a eliminar: ");
        int id = sc.nextInt();

        Nodo actual = cabeza;

        while (actual != null) {

            if (actual.Id == id) {

                // Caso 1: es el primer nodo
                if (actual == cabeza) {
                    cabeza = actual.siguiente;

                    if (cabeza != null) {
                        cabeza.anterior = null;
                    } else {
                        cola = null;
                    }

                // Caso 2: es el último nodo
                } else if (actual == cola) {

                    cola = actual.anterior;
                    cola.siguiente = null;

                // Caso 3: está en el medio
                } else {

                    actual.anterior.siguiente = actual.siguiente;
                    actual.siguiente.anterior = actual.anterior;
                }

                respuesta = "Estudiante eliminado correctamente.";
                return respuesta;
            }

            actual = actual.siguiente;
        }

        respuesta = "No se encontró un estudiante con ese ID.";
        return respuesta;
    }
}