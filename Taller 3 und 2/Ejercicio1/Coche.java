package Ejercicio1;

public class Coche {

    private String marca;
    private String modelo;
    public static int contadorCoches = 0;

    // Constructor
    public Coche(String marca, String modelo) {
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
}
