import java.util.Scanner;

//Escreva um programa que calcule o fatorial de um número.
public class Desafio6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int fatorial = sc.nextInt();

        int result = 1;
        for (int i = 1; i <= fatorial; i++) {
            result = result * i;
        }
        System.out.println(result);
    }
}
