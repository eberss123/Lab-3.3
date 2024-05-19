
public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private int velocidadMaxima;

    // Constructor
    public Vehiculo(String marca, String modelo, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    // Métodos abstractos
    public abstract void arrancar();
    public abstract void detener();

    // Método concreto
    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidad Máxima: " + velocidadMaxima);
    }
}
