package DesafioIdiota;

//Escreva um programa que inverta uma string

import java.util.Scanner;

public class Desafio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma palavra:");
        String word = sc.next();

        String wordInvertida = inverterString(word);
        System.out.println(wordInvertida);

    }
    public static String inverterString(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        return stringBuilder.reverse().toString();
    }

}
