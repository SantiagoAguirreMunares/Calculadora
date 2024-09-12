/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Operadores;
import Utilidades.Lectura; // Importa la clase Lectura para leer datos desde la entrada estándar
import java.io.IOException; // Importa la clase IOException para manejar errores de entrada/salida

/**
 *
 * @author nanet
 */

public class Relacional {
    // Método estático para realizar operaciones relacionales
    public static void realizarOperaciones() throws IOException{ //throws IOException si ocurre un error de entrada/salida al leer los números
        Lectura lectura = new Lectura(); // Crea una instancia de Lectura para leer la entrada del usuario

        // Lee un número de tipo double del usuario
        double num1 = lectura.leerDoble("Ingrese un numero: ");

         // Evalúa si el número es positivo, negativo o cero y muestra el resultado
        if (num1 > 0) {
            System.out.println("El numero es positivo.");
        } else if (num1 < 0) {
            System.out.println("El numero es negativo.");
        } else {
            System.out.println("El numero es cero.");
        }
    }
}