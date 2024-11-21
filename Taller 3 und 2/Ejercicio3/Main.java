package Ejercicio3;

public class Main {
    public static void main(String[] args) {

        CocheStatic miCoche = new CocheStatic("Ford", "2012");

        System.out.println("Datos del coche creado:");
        miCoche.imprimirCoche();

        System.out.println("Llamando a la marca creada en el método static:");
        CocheStatic.marcaCoche(miCoche);

        System.out.println("Después de llamar a metodoCorregido:");
        miCoche.imprimirCoche();
    }
}

