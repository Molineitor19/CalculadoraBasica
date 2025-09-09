/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import calculadora.*;
import java.util.Scanner;

/**
 *
 * @author Nelson Molina Ramos
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Ingrese el primer numero: ");
        int n1 = sc.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int n2 = sc.nextInt();

        
        System.out.println("\nElija el tipo de calculadora:");
        System.out.println("1. Binaria");
        System.out.println("2. Octal");
        System.out.println("3. Hexadecimal");
        System.out.print("Opción: ");
        int opcion = sc.nextInt();

        Calculadora calc = null;

        switch (opcion) {
            case 1 -> calc = new Binario(n1, n2);
            case 2 -> calc = new Octal(n1, n2);
            case 3 -> calc = new Hexadecimal(n1, n2);
            default -> {
                System.out.println("Opción no válida.");
                System.exit(0);
            }
        }

       
        System.out.println("\nElija la operacion:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.print("Opcion: ");
        int operacion = sc.nextInt();

        if (operacion == 1) {
            calc.sumar();
        } else if (operacion == 2) {
            calc.restar();
        } else {
            System.out.println("Operacion no valida.");
            System.exit(0);
        }

        
        calc.convertir();

        sc.close();
    }
}
