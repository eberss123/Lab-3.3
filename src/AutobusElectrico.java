/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ebers
 */
public class AutobusElectrico extends Vehiculo implements Electrico, TransportePublico {
    private int capacidadPasajeros;
    private int nivelBateria;
    private String ruta;

    // Constructor
    public AutobusElectrico(String marca, String modelo, int velocidadMaxima, int capacidadPasajeros, int nivelBateria, String ruta) {
        super(marca, modelo, velocidadMaxima);
        this.capacidadPasajeros = capacidadPasajeros;
        this.nivelBateria = nivelBateria;
        this.ruta = ruta;
    }

    // Implementación de los métodos abstractos de Vehiculo
    @Override
    public void arrancar() {
        System.out.println("El autobús eléctrico está arrancando.");
    }

    @Override
    public void detener() {
        System.out.println("El autobús eléctrico se ha detenido.");
    }

    // Implementación de los métodos de Electrico
    @Override
    public void cargarBateria() {
        System.out.println("Cargando la batería del autobús.");
        nivelBateria = 100; // Asumimos que la carga completa es 100%
    }

    @Override
    public int nivelBateria() {
        return nivelBateria;
    }

    // Implementación de los métodos de TransportePublico
    @Override
    public int numeroPasajeros() {
        return capacidadPasajeros;
    }

    @Override
    public String rutaActual() {
        return ruta;
    }
    
    // Método concreto adicional
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Capacidad de Pasajeros: " + capacidadPasajeros);
        System.out.println("Nivel de Batería: " + nivelBateria + "%");
        System.out.println("Ruta Actual: " + ruta);
    }
    
}
