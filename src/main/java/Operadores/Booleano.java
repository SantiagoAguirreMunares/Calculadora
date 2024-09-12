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
public class Booleano {
    // Método estático para realizar operaciones de lógica proposicional
    public static void realizarOperaciones() throws IOException { // throws IOException si ocurre un error de entrada/salida al leer los números
        Lectura lectura = new Lectura(); // Crea una instancia de Lectura para leer la entrada del usuario
        boolean p;
        boolean q;

            // Lee los dos valores booleanos digitados por el usuario
            p = lectura.leerBooleano("Ingrese 'true' o 'false' para el primer valor: ");
            q = lectura.leerBooleano("Ingrese 'true' o 'false' para el segundo valor: ");

        System.out.println("Operaciones de Logica Proposicional");
        
            // Realiza las diferentes operaciones de lógica proposicional
            conjuncion(p, q);    // Llama al método para realizar la operación de conjunción
            disyuncion(p, q);    // Llama al método para realizar la operación de disyunción
            implicacion(p, q);   // Llama al método para realizar la operación de implicación
            bicondicional(p, q); // Llama al método para realizar la operación bicondicional
    }
    
    // Realiza la operación de conjunción (AND) entre los dos valores booleanos
    public static void conjuncion(boolean p, boolean q) {
        System.out.println("Operacion Conjuncion (AND):");
        System.out.println(p + " && " + q + " = " + (p && q));
    }

    // Realiza la operación de disyunción (OR) entre dos valores booleanos
    public static void disyuncion(boolean p, boolean q) {
        System.out.println("Operacion Disyuncion (OR):");
        System.out.println(p + " || " + q + " = " + (p || q));
    }

    // Realiza la operación de implicación (->) entre dos valores booleanos
    public static void implicacion(boolean p, boolean q) {
        System.out.println("Operacion Implicacion (p -> q):");
        System.out.println("(!" + p + " || " + q + ") = " + (!p || q));
    }

    // Realiza la operación de bicondicional(<->) entre dos valores booleanos
    public static void bicondicional(boolean p, boolean q) {
        System.out.println("Operacion Bicondicional (p <-> q):");
        System.out.println(p + " == " + q + " = " + (p == q));
    }
}