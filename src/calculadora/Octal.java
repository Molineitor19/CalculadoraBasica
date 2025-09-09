/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author Nelson Molina Ramos
 */
public class Octal extends Calculadora {

    public Octal(int numero1, int numero2) {
        super(numero1, numero2);
    }

    @Override
    public void convertir() {
        System.out.println("Resultado en Octal: " + Integer.toOctalString(resultado));
    }
}
