/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author Nelson Molina Ramos
 */
public class Calculadora {
    protected int numero1;
    protected int numero2;
    protected int resultado;

    public Calculadora(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public void sumar() {
        resultado = numero1 + numero2;
        System.out.println("Resultado de la suma: " + resultado);
    }

    public void restar() {
        resultado = numero1 - numero2;
        System.out.println("Resultado de la resta: " + resultado);
    }

    
    public void convertir() {
        System.out.println("Conversión genérica desde clase padre.");
    }

    public int getResultado() {
        return resultado;
    }
}