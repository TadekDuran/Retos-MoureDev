package Retos;

/*
 * Reto #3
 * ¿ES UN NÚMERO PRIMO?
 * Fecha publicación enunciado: 17/01/22
 * Fecha publicación resolución: 24/01/22
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
 */

public class C4NumeroPrimo {
    public static void main(String[] args)  {
        System.out.println("Números primos entre 1 y 100:");
        for (int i = 1; i <= 100; i++) {
            int num = i;
            if(check(num))  {
                System.out.println(num);
            }
        }
    }
    static boolean check(int num)   {
        if(num < 2)    {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if(num % i == 0)    {
                return false;
            }
        }
        return true;
    }
}
