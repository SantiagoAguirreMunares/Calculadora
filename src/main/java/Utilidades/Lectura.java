/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;
import java.io.BufferedReader; // Importa la clase BufferedReader para leer texto de una entrada de caracteres
import java.io.IOException;  // Importa la clase IOException para manejar errores de entrada/salida
import java.io.InputStreamReader; // Importa la clase InputStreamReader para convertir el flujo de bytes en un flujo de caracteres
/**
 *
 * @author santi
 */

public class Lectura {
    private BufferedReader reader; // Lector de buffer

    public Lectura() {
        reader = new BufferedReader(new InputStreamReader(System.in));  //Inicializa el lector de buffer (BufferedReader) para leer la entrada
    }

    // Método para leer un número entero
    public int leerEntero(String mensaje) throws IOException{
        System.out.print(mensaje);
        while (true) {
            try {
                return Integer.parseInt(reader.readLine()); // Intenta convertir la entrada a un entero
            } catch (NumberFormatException | IOException e) {
                System.out.println("Entrada invalida. Ingrese un numero entero.");  // Muestra un mensaje de error si la entrada no es válida
            }
        }
    }

    // Método para leer un número decimal (double) 
    public double leerDoble(String mensaje) throws IOException{
        System.out.print(mensaje);
        while (true) {
            try {
                return Double.parseDouble(reader.readLine());
            } catch (NumberFormatException | IOException e) {
                System.out.println("Entrada invalida. Ingrese un numero decimal.");
            }
        }
    }
    
    // Método para leer un valor booleano
    public boolean leerBooleano(String mensaje) throws IOException {
        System.out.print(mensaje);
        while (true) {
            String entrada = reader.readLine().toLowerCase();
            if (entrada.equals("true")) {
                return true;
            } else if (entrada.equals("false")) {
                return false;
            } else {
                System.out.println("Entrada invalida. Por favor ingrese 'true' o 'false'.");
            }
        }
    }
}