package DesafioIdiota;

import java.util.Objects;
import java.util.Scanner;

//Escreva um programa que verifique se uma palavra é um palíndromo (ou seja, se ela é a mesma lida de trás para frente).
public class Desafio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma palavra:");
        String word = sc.next();

        String wordInvertida = inverterString(word);
        System.out.println(wordInvertida);
        if (Objects.equals(word, wordInvertida)) {
            System.out.printf("'%s' é um palíndromo", word);
        } else {
            System.out.printf("'%s' NÃO um palíndromo", word);
        }

    }
    public static String inverterString(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        return stringBuilder.reverse().toString();
    }

}
