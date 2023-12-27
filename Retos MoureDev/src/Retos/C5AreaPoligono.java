package Retos;

import java.util.Scanner;

/*
 * Reto #4
 * ÁREA DE UN POLÍGONO
 * Fecha publicación enunciado: 24/01/22
 * Fecha publicación resolución: 31/01/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea UNA ÚNICA FUNCIÓN (importante que sólo sea una) que sea capaz de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 */

public class C5AreaPoligono {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args)  {
        String nombre = "";
        System.out.println("Indique el tipo de polígono:");
        System.out.println("1- Cuadrado");
        System.out.println("2- Rectangulo");
        System.out.println("3- Triangulo");
        int tipo = input.nextInt();
        switch(tipo)    {
            case 1:
                nombre = "cuadrado";
                break;
            case 2:
                nombre = "rectangulo";
                break;
            case 3:
                nombre = "triangulo";
                break;
        }
        if(Double.isNaN(calculadorArea(tipo, nombre)))  {
            System.out.println("¡El triángulo no existe!");
        }   else    {
            System.out.println("El area del " + nombre + " es de: " + calculadorArea(tipo, nombre));
        }
    }
    
    static double calculadorArea(int tipo, String nombre)    {
        double lado1;
        double lado2;
        double lado3;
        switch(tipo)    {
            case 1:
                lado1 = 5;
                return lado1*lado1;
            case 2:
                lado1 = 5;
                lado2 = 8;
                return lado1*lado2;
            case 3:
                lado1 = 7;
                lado2 = 9;
                lado3 = 15;
                double s = (lado1+lado2+lado3) / 2;
                return Math.sqrt(s*(s-lado1)*(s-lado2)*(s-lado3));
            default:
                System.out.println("Tipo incorrecto.");
                return 0;
        }
    }
}
