package Ejercicio3;

public class CocheStatic {

    private String marca;
    private String modelo;
    public static int contadorCoches = 0;

    public CocheStatic(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        contadorCoches++;
    }

    public void imprimirCoche() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }

    public static int numeroDeCoches() {
        return contadorCoches;
    }
//Esto esta bien//
    public static void marcaCoche(CocheStatic coche) {
        coche.marca = "Toyota";
        System.out.println("Marca: " + coche.marca);
    }
//Esto esta mal//
    public static void metodoIncorrecto() {
        marca = "Toyota";
        System.out.println("Modelo: " + modelo);
    }
    
}


