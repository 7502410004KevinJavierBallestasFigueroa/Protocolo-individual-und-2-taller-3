
package Ejercicio2;

public class Matematicas {

    private int a;
    private int b;

    public Matematicas() {
        this.a = 2;
        this.b = 2;
    }
    public Matematicas(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public static int sumar(int a, int b) {
        return a + b;
    }
    public static int resta(int a, int b) {
        return a - b;
    }
    public static int multiplicacion(int a, int b) {
        return a * b;
    }
    public static int division(int a, int b) {
        return a / b;
    }
}



