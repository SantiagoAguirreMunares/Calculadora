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
public class Incremental {
    // Método estático para realizar operaciones incrementales y decrementales
    public static void realizarOperaciones() throws IOException{ //throws IOException si ocurre un error de entrada/salida al leer los números
        Lectura lectura = new Lectura();  // Crea una instancia de Lectura para leer la entrada del usuario
        int a; // Variable para almacenar el número ingresado por el usuario

            // Lee un número entero del usuario
            a = lectura.leerEntero("Ingrese un numero: ");

        int original = a; // Almacena el valor original de 'a' para su reutilización

        System.out.println("Operadores Incrementales");
        
            // Muestra el valor actual de 'a'
            System.out.println("Mostrar el valor actual de a:");
            System.out.println("a = " + original);
            
            // Incrementa 'a' en 1 usando 'a++' y muestra el resultado antes y después del incremento
            System.out.println("Incrementar a en 1 usando 'a++':");
            System.out.println("a++ = " + (a++));
            System.out.println("Valor de a despues del incremento: " + a);

            a = original; // Reinicia 'a' al valor original

            // Decrementa 'a' en 1 usando 'a--' y muestra el resultado antes y después del decremento
            System.out.println("Decrementar a en 1 usando 'a--':");
            System.out.println("a-- = " + (a--));
            System.out.println("Valor de a despues del decremento: " + a);
}
}