package Retos;

import java.util.Arrays;

/*
* Reto #1
* ¿ES UN ANAGRAMA?
* Fecha publicación enunciado: 03/01/22
* Fecha publicación resolución: 10/01/22
* Dificultad: MEDIA
*
* Enunciado: Escribe una función que reciba dos palabras (String) y retorne verdadero o falso (Boolean) según sean o no anagramas.
* Un Anagrama consiste en formar una palabra reordenando TODAS las letras de otra palabra inicial.
* NO hace falta comprobar que ambas palabras existan.
* Dos palabras exactamente iguales no son anagrama.
*/

public class C2Anagramas {
    public static void main(String[] args) {
        String wordOne = "amor";
        String wordTwo = "romaa";
        if(isAnagram(wordOne, wordTwo)) {
            System.out.println("Son anagramas");
        }   else    {
            System.out.println("No son anagramas");
        }
    }

    static boolean isAnagram(String wordOne, String wordTwo) {
        if(wordOne.length() != wordTwo.length())    {
            return false;
        }
        if(wordOne.equals(wordTwo))  {
            return false;
        }
        char[] arrayA = wordOne.toUpperCase().toCharArray();
        char[] arrayB = wordTwo.toUpperCase().toCharArray();
        Arrays.sort(arrayA);
        Arrays.sort(arrayB);
        for (int i = 0; i < arrayA.length; i++) {
            try{
            if(Character.toUpperCase(arrayA[i]) != Character.toUpperCase(arrayB[i]))    {
                return false;
            }
            }   catch (Exception e) {
                return false;
            }
        }
        return true;
    }
}
