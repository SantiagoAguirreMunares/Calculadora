/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.santiago.calculadora;
import Utilidades.Lectura;
import Operadores.Aritmetico;
import Operadores.Bits;
import Operadores.Booleano;
import Operadores.Incremental;
import Operadores.Relacional;
import java.io.IOException;
/**
 * Mi primer programa
 *
 * @author santiago.aguirrem
 */

public class Calculadora {

    public static void main(String[] args) throws IOException {
        Lectura lectura = new Lectura();
        boolean continuar = true;

        while (continuar) {
            System.out.println("Calculadora Operativa:");
            System.out.println("1. Operaciones Aritmeticas");
            System.out.println("2. Operaciones de Bits");
            System.out.println("3. Operaciones Booleanas");
            System.out.println("4. Operaciones Incrementales");
            System.out.println("5. Operaciones Relacionales");
            System.out.println("0. Salir");

            int opcion = lectura.leerEntero("Seleccione una opcion: ");

            switch (opcion) {
                case 1 -> Aritmetico.realizarOperaciones();
                case 2 -> Bits.realizarOperaciones();
                case 3 -> Booleano.realizarOperaciones();
                case 4 -> Incremental.realizarOperaciones();
                case 5 -> Relacional.realizarOperaciones();
                case 0 -> {
                    System.out.println("Saliendo del programa...");
                    continuar = false;
                }
                default -> System.out.println("Opcion invalida. Intente nuevamente");
            }
        }

        System.out.println("¡Gracias por utilizar este programa!");
    }
}