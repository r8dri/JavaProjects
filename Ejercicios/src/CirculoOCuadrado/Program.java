//Dados el radio de un círculo y el área de un cuadrado, devuelve true si la circunferencia
// del círculo es mayor que el perímetro del cuadrado. De lo contrario, devuelve false.
// Los valores de entrada no producirán perímetros iguales.
//Ejemplos
//Program.circleOrSquare(16, 625) ➞ true
//
//Program.circleOrSquare(5, 100) ➞ false
//
//Program.circleOrSquare(8, 144) ➞ true
package CirculoOCuadrado;

import java.util.Scanner;

public class Program {
    public static boolean circleOrSquare(int radius, int squareArea) {
        return (2 * Math.PI * radius) > (Math.sqrt(squareArea) * 4);
    }

    static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int radio;
        int areaCuadrado;
        System.out.println("Ingresa el radio del circulo:");
        radio = read.nextInt();
        System.out.println("Ingresa el area del cuadrado:");
        areaCuadrado = read.nextInt();
        if(circleOrSquare(radio, areaCuadrado)){
            System.out.println("Es mayor la circunferencia que el perimetro");
        } else {
            System.out.println("Es mayor el perimetro que la circunferencia");
        }
    }
}
