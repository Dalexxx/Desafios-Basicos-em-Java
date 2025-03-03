package DesafioIdiota;

//Escreva um programa que calcule o fatorial de um número.
public class Desafio6 {
    public static void main(String[] args) {
        int fatorial = 10;
        int result = 1;
        for (int i = 1; i <= fatorial; i++) {
            result = result * i;
        }
        System.out.println(result);
    }
}
