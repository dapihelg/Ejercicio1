import java.util.Stack;

public class Pilas {

    public static void main(String[] args) {
        Stack<Integer> pila1 = new Stack<>();

        pila1.push(30);
        pila1.push(50);
        pila1.push(70);
        pila1.push(90);
        pila1.push(999);

        Stack<Integer> pila2 = new Stack<>();

        System.out.println("Pila 1 ANTES de sacar los enteros "+pila1);
        System.out.println("Pila 2 ANTES de introducir los enteros "+pila2);
        moverEnteros(pila1, pila2);
        System.out.println("Pila 1 DESPUÉS de sacar los enteros "+pila1);
        System.out.println("Pila 2 DESPUÉS de introducir los enteros "+pila2);
    }

    public static void moverEnteros(Stack<Integer> pila1, Stack<Integer> pila2) {
        Stack<Integer> aux = new Stack<>();
        while (!pila1.empty()) {
            int entero = pila1.pop();
            aux.push(entero);
        }

            while(!aux.empty()){
                int entero = aux.pop();
                pila2.push(entero);
            }
        }
    }

