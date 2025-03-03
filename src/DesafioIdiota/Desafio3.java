package DesafioIdiota;

import java.util.Scanner;

//Desafio 3: Contador de Vogais
//Crie um programa que conte quantas vogais (a, e, i, o, u) existem em uma string.
public class Desafio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String word = sc.next();
        int vogais = 0;
        for(int i = 0; i < word.length(); i++) {
            char letra = word.charAt(i);
            System.out.println(letra);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                vogais += 1;
            }
        }

        System.out.println("Número de vogais: " + vogais);
    }
}
