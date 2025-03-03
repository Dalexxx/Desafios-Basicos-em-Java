package DesafioIdiota;


import java.util.Random;
import java.util.Scanner;

//Crie um jogo onde o programa gera um número aleatório entre 1 e 100, e o usuário tenta adivinhar. O programa deve dar dicas ("maior" ou "menor") até que o usuário acerte.
public class Desafio9 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Tente adivinhar o número que eu escolhi");

        int player = 0;
        int pc = random.nextInt(100) + 1;

        while (pc != player){

            System.out.println("Digite um número:");
            player = sc.nextInt();

            if (pc > player) {
                System.out.println("Maior!");
            } else if (player > pc) {
                System.out.println("Menor!");
            }
        }

        System.out.println("Parabéns, vc acertou");

    }
}
