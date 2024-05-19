/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ebers
 */
public class Main {
    public static void main(String[] args) {
        // Crear un objeto de la clase AutobusElectrico
        AutobusElectrico autobus = new AutobusElectrico("Tesla", "Model X", 120, 40, 80, "Ruta 5");

        // Mostrar la información del autobús eléctrico
        autobus.mostrarInfo();
        
        System.out.println();

        // Arrancar el autobús eléctrico
        autobus.arrancar();

        // Mostrar el nivel de batería actual
        System.out.println("Nivel de batería: " + autobus.nivelBateria() + "%");

        // Cargar la batería del autobús eléctrico
        autobus.cargarBateria();
        
        // Mostrar el nuevo nivel de batería
        System.out.println("Nivel de batería después de cargar: " + autobus.nivelBateria() + "%");

        // Detener el autobús eléctrico
        autobus.detener();

        // Mostrar el número de pasajeros y la ruta actual
        System.out.println("Número de pasajeros: " + autobus.numeroPasajeros());
        System.out.println("Ruta actual: " + autobus.rutaActual());
    }
}
