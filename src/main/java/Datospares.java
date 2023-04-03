public class Datospares {
    public static void main(String[] args) {
        Listaenlazada lista = new Listaenlazada();
        lista.insertar(1);
        lista.insertar(2);
        lista.insertar(3);
        lista.insertar(4);
        lista.insertar(5);
        lista.insertar(6);
        lista.insertar(7);
        lista.insertar(8);
        lista.insertar(9);
        lista.insertar(10);

        System.out.println("\n");

        lista.mostrarPares(lista.inicio);

    }

    public static class Nodo{
    public int numero;
    public Nodo siguiente;

    public Nodo(int numero) {
        this.numero = numero;
        this.siguiente = null;
    }
    }

    public static class Listaenlazada{
    public Nodo inicio;

    public Listaenlazada() {
        this.inicio = null;
    }

    public void insertar(int numero){
        Nodo nuevoNodo = new Nodo(numero);
        nuevoNodo.siguiente = inicio;
        inicio = nuevoNodo;
        System.out.println("Elemento -"+ nuevoNodo.numero);
    }
    public void mostrarPares(Nodo nodo){
        if(nodo == null){
            return;
        }
        if((nodo.numero/2*2)== nodo.numero){
            System.out.println("numeros pares de la lista "+nodo.numero);
        }
        mostrarPares(nodo.siguiente);
    }
}
}