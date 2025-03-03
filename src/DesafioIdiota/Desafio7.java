package DesafioIdiota;

import java.util.Scanner;

//Crie um programa que exiba a tabuada de um número.
public class Desafio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número da tabuada: ");
        int numero = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", numero, i, numero*i);

        }
    }
}
