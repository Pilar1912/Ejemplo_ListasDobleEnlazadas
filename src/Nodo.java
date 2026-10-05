public class Nodo {

    int Id;
    String Nombre;
    int Edad;

    Nodo anterior;
    Nodo siguiente;

    public Nodo(int id, String nombre, int edad) {
        Id = id;
        Nombre = nombre;
        Edad = edad;

        anterior = null;
        siguiente = null;
    }
}