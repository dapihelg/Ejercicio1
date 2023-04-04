public class Colas {
    public static void main(String[] args) {
        Cola cola1 = new Cola();
        cola1.agregarElementos(1);
        cola1.agregarElementos(10);
        cola1.agregarElementos(100);
        cola1.agregarElementos(1000);

        System.out.println("ELEMENTOS DE LA COLA 1:");

        int indice = 1;
        int indice1 = 1;
        Nodo aux = cola1.frente;
        while(aux != null){
            System.out.println("Elemento - "+indice+" - "+aux.dato);
            ++indice;
            aux = aux.siguiente;
        }

        System.out.printf("\n");

        Cola cola2 = cola1.crearCola();

        System.out.println("ELEMENTOS DE LA COLA 2:");
        while(!cola2.colaVacia()){
            System.out.println("Elemento - "+indice1+" - "+cola2.frente.dato);
            ++indice1;
            cola2.frente = cola2.frente.siguiente;
        }
    }

    public static class Nodo{
        float dato;
        Nodo siguiente;

    }

    public static class Cola {
        Nodo frente;
        Nodo fondo;

    public Cola() {
        this.frente = null;
        this.fondo = null;
    }

        boolean colaVacia(){
        return frente == null;
    }

        public void agregarElementos ( float dato){
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.dato = dato;
        nuevoNodo.siguiente = null;

        if (colaVacia()) {
            frente = nuevoNodo;
            fondo = nuevoNodo;
        } else {
            fondo.siguiente = nuevoNodo;
            fondo = nuevoNodo;
        }
    }

    public Cola crearCola(){
        Cola cola2 = new Cola();
        copiarElementos(cola2);
        return cola2;
    }

        public void copiarElementos(Cola cola2){
        if(!colaVacia()){
            float x = frente.dato;
            cola2.agregarElementos(x);
            frente = frente.siguiente;
            copiarElementos(cola2);
        }
        }
    }
}