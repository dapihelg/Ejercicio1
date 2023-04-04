
public class Recepcionpedidos {
    public static void main(String[] args) {
        String Roberto = "Roberto", Julio="Julio", Amanda="Amanda", Alexa="Alexa",
                AT="Advocado Technologies", Tx="Telmex", CIA="CIA";

        Recepcionpedidos datos = new Recepcionpedidos(cliente, cantidad);
        Recepcionpedidos.Colapedidos pedidos = new Recepcionpedidos.Colapedidos();

        pedidos.insercionPedidos(Roberto, 1);
        pedidos.insercionPedidos(Amanda, 1);
        pedidos.insercionPedidos(Alexa, 1);
        pedidos.insercionPedidos(Julio, 1);
        pedidos.insercionPedidos(AT, 25);
        pedidos.insercionPedidos(CIA, 100);
        pedidos.insercionPedidos(Tx, 50);

        pedidos.extraccionPedidos();
        pedidos.extraccionPedidos();

        pedidos.info();
    }

    static String cliente;
    static int cantidad;

    public Recepcionpedidos(String cliente, int cantidad) {
        this.cliente = cliente;
        this.cantidad = cantidad;
    }

    public String toString(){
        return "Cliente "+cliente+" cantidad de producto "+cantidad;
    }

    public static class Colapedidos{
        class Nodo {
            String cliente;
            int cantidad;
            Nodo siguiente;

            public Nodo(String cliente, int cantidad) {
                this.cliente = cliente;
                this.cantidad = cantidad;
                this.siguiente = null;
            }
        }

            Nodo inicio;
            Nodo fin;

            public Colapedidos(){
                this.inicio = null;
                this.fin = null;
            }

            public boolean colaVacia(){
                return inicio == null;
            }

            public void insercionPedidos(String cliente, int cantidad){
                Nodo nuevoPedido = new Nodo(cliente, cantidad);
                if(colaVacia()){
                    inicio = fin = nuevoPedido;
                }
                else{
                    fin.siguiente = nuevoPedido;
                    fin = nuevoPedido;
                }
            }

            public void extraccionPedidos() {
                if (!colaVacia()) {
                    inicio = inicio.siguiente;
                }
                else {
                    System.out.println("no hay pedidos");
                }
            }

            public void info(){
                int indice = 1;
                Nodo leer = inicio;
                while(leer != null){
                    System.out.println(" "+indice+" -Cliente- "+leer.cliente+" -cantidad de producto- "
                            +leer.cantidad);
                    ++indice;
                    leer = leer.siguiente;
                }
            }
        }
    }
