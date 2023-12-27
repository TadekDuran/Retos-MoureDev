package Retos;

/*
* Reto #2
* LA SUCESIÓN DE FIBONACCI
* Fecha publicación enunciado: 10/01/22
* Fecha publicación resolución: 17/01/22
* Dificultad: DIFÍCIL
*
* Enunciado: Escribe un programa que imprima los 50 primeros números de la sucesión de Fibonacci empezando en 0.
* La serie Fibonacci se compone por una sucesión de números en la que el siguiente siempre es la suma de los dos anteriores.
* 0, 1, 1, 2, 3, 5, 8, 13...
*/

public class C3Fibonacci {
    public static void main(String[] args) {
        Long fiboNum;
        Long fiboA = 0L;
        Long fiboB = 1L;
        System.out.println("Fibo N°0:" + fiboA);
        System.out.println("Fibo N°1:" + fiboB);
        for (int i = 2; i <= 50; i++) {
            fiboNum = fiboA + fiboB;
            System.out.println("Fibo N°" + i + ": " + fiboNum);
            fiboA = fiboB;
            fiboB = fiboNum;
        }
    }
}
