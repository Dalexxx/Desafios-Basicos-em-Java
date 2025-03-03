package DesafioIdiota;

import java.util.Objects;
import java.util.Scanner;

//Crie um programa que receba dois números e uma operação (+, -, *, /) e exiba o resultado.
public class Desafio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int n = sc.nextInt();
        System.out.println("Digite outro numero: ");
        int n2 = sc.nextInt();
        System.out.println("Digite o operador: ");
        String s = sc.next();

        if (Objects.equals(s, "+")) {
            System.out.println("Resultado: " + (n + n2));
        } else if (Objects.equals(s, "-")) {
            System.out.println("Resultado: " + (n - n2));
        } else if (Objects.equals(s, "*")) {
            System.out.println("Resultado: " + (n * n2));
        } else if (Objects.equals(s, "/")) {
            System.out.println("Resultado: " + (n / n2));
        }
    }
}
