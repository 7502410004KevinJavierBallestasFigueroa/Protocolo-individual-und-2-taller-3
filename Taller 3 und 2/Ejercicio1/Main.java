package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Coche coche1 = new Coche("Mazda", "Mazda 3");
        Coche coche2 = new Coche("Mazda", "Mazda CX5");
        Coche coche3 = new Coche("Mazda", "Mazda CX9");
        Coche coche4 = new Coche("Renault", "Sandero");
        Coche coche5 = new Coche("Renault", "Duster");
        
        System.out.println("Datos del carro 1");
        coche1.imprimirCoche();
        System.out.println("Datos del carro 2");
        coche2.imprimirCoche();
        System.out.println("Datos del carro 3");
        coche3.imprimirCoche();
        System.out.println("Datos del carro 4");
        coche4.imprimirCoche();
        System.out.println("Datos del carro 5");
        coche5.imprimirCoche();
        System.out.println("El numero total de coches es: " + coche5.numeroDeCoches());
        
    }
}