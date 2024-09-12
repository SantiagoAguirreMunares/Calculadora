/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Operadores;
import Utilidades.Lectura; // Importa la clase Lectura para leer datos desde la entrada estándar
import java.io.IOException; // Importa la clase IOException para manejar errores de entrada/salida
/**
 *
 * @author santi
 */
public class Bits {
    // Método estático para realizar operaciones a nivel de bits
    public static void realizarOperaciones() throws IOException { // throws IOException si ocurre un error de entrada/salida al leer los números
        Lectura lectura = new Lectura(); // Crea una instancia de Lectura para leer la entrada del usuario
        int a;
        int b;
        
        // Lee los dos números enteros del usuario para las operaciones de bits
        a = lectura.leerEntero("Ingrese el primer numero (para operaciones de bits): ");
        b = lectura.leerEntero("Ingrese el segundo numero (para operaciones de bits): ");

        System.out.println("Operadores de Bits");
        
        // Realiza y muestra el resultado de la operación AND bit a bit
        System.out.println("Realizar operacion AND bit a bit:");
        System.out.println(a + " (" + Integer.toBinaryString(a) + ") & " + b + " (" + Integer.toBinaryString(b) + ") = " + (a & b) + " (" + Integer.toBinaryString(a & b) + ")");
        
        // Realiza y muestra el resultado de la operación OR bit a bit
        System.out.println("Realizar operacion OR bit a bit:");
        System.out.println(a + " (" + Integer.toBinaryString(a) + ") | " + b + " (" + Integer.toBinaryString(b) + ") = " + (a | b) + " (" + Integer.toBinaryString(a | b) + ")");
        
        // Realiza y muestra el resultado de la operación XOR bit a bit
        System.out.println("Realizar operacion XOR bit a bit:");
        System.out.println(a + " (" + Integer.toBinaryString(a) + ") ^ " + b + " (" + Integer.toBinaryString(b) + ") = " + (a ^ b) + " (" + Integer.toBinaryString(a ^ b) + ")");

        // Realiza y muestra el resultado del complemento del primer número
        System.out.println("Realizar operacion de complemento del primer numero:");
        System.out.println("~" + a + " (" + Integer.toBinaryString(a) + ") = " + (~a) + " (" + Integer.toBinaryString(~a) + ")");
        
        // Realiza y muestra el resultado del complemento del segundo número
        System.out.println("Realizar operacion de complemento del segundo numero:");
        System.out.println("~" + b + " (" + Integer.toBinaryString(b) + ") = " + (~b) + " (" + Integer.toBinaryString(~b) + ")");
        
        // Realiza y muestra el resultado del desplazamiento a la izquierda del primer número
        System.out.println("Desplazar a la izquierda los bits del primer numero:");
        System.out.println(a + " (" + Integer.toBinaryString(a) + ") << 1 = " + (a << 1) + " (" + Integer.toBinaryString(a << 1) + ")");
        
        // Realiza y muestra el resultado del desplazamiento a la derecha del primer número
        System.out.println("Desplazar a la derecha los bits del primer numero:");
        System.out.println(a + " (" + Integer.toBinaryString(a) + ") >> 1 = " + (a >> 1) + " (" + Integer.toBinaryString(a >> 1) + ")");
        
        // Realiza y muestra el resultado del desplazamiento a la izquierda del segundo número
        System.out.println("Desplazar a la izquierda los bits del segundo numero:");
        System.out.println(b + " (" + Integer.toBinaryString(b) + ") << 1 = " + (b << 1) + " (" + Integer.toBinaryString(b << 1) + ")");
        
        // Realiza y muestra el resultado del desplazamiento a la derecha del segundo número
        System.out.println("Desplazar a la derecha los bits del segundo numero:");
        System.out.println(b + " (" + Integer.toBinaryString(b) + ") >> 1 = " + (b >> 1) + " (" + Integer.toBinaryString(b >> 1) + ")");
    }
}