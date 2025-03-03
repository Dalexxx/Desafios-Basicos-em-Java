package DesafioIdiota;

import java.util.Scanner;

//Escreva um programa que verifique se um número é primo.
public class Desafio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num = sc.nextInt();
        if (num == 2 || num == 3 || num == 5 || num == 7) {
            System.out.println("primo");
        } else if (num <= 1) {
            System.out.println("não é primo");
        } else if (num %2 == 0 || num %3 == 0 || num %5 == 0 || num %7 == 0) {
            System.out.println("não é primo");
        } else {
            System.out.println("primo");
        }
    }
}
