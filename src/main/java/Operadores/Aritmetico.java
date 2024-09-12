/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Operadores;
import Utilidades.Lectura; // Importa la clase Lectura para leer datos desde la entrada estándar
import java.text.NumberFormat; // Importa la clase NumberFormat para formatear números
import java.util.Locale; // Importa la clase Locale para especificar la localización
import java.io.IOException; // Importa la clase IOException para manejar errores de entrada/salida
/**
 *
 * @author santi
 */
public class Aritmetico {
    // Método estático para realizar operaciones aritméticas básicas
    public static void realizarOperaciones() throws IOException{ // throws IOException si ocurre un error de entrada/salida al leer los números
        Lectura lectura = new Lectura(); // Crea una instancia de Lectura para leer la entrada del usuario
        NumberFormat formatoNumeros = NumberFormat.getInstance(Locale.US); // Formateador de números para la localización de EE. UU.
        int a;
        int b;
        
            // Lee dos números enteros digitados por el usuario
            a = lectura.leerEntero("Ingrese el primer numero: ");
            b = lectura.leerEntero("Ingrese el segundo numero: ");

        System.out.println("Operaciones Aritmeticas");
        
            // Realiza y muestra el resultado de la suma
            System.out.println("Sumar los dos numeros:");
            System.out.println(formatoNumeros.format(a) + " + " + formatoNumeros.format(b) + " = " + formatoNumeros.format(a + b));
            
            // Realiza y muestra el resultado de la resta
            System.out.println("Restar el primer numero menos el segundo:");
            System.out.println(formatoNumeros.format(a) + " - " + formatoNumeros.format(b) + " = " + formatoNumeros.format(a - b));
            
            // Realiza y muestra el resultado de la multiplicación
            System.out.println("Multiplicar los dos numeros:");
            System.out.println(formatoNumeros.format(a) + " * " + formatoNumeros.format(b) + " = " + formatoNumeros.format(a * b));

            // Realiza y muestra el resultado de la división, si el divisor no es cero
            System.out.println("Dividir el primer numero por el segundo:");
            if (b != 0) {
                System.out.println(formatoNumeros.format(a) + " / " + formatoNumeros.format(b) + " = " + formatoNumeros.format(a / b));
            } else {
                System.out.println("Division por cero no es posible.");
            }
            
            // Realiza y muestra el resultado del módulo, si el divisor no es cero
            System.out.println("Obtener el residuo de la division del primer numero por el segundo:");
            if (b != 0) {
                System.out.println(formatoNumeros.format(a) + " % " + formatoNumeros.format(b) + " = " + formatoNumeros.format(a % b));
            } else {
                System.out.println("Modulo por cero no es posible.");
            }
    }
}