package DesafioIdiota;

//ContaBancaria conta = new ContaBancaria(12345, "João Silva");
//conta.depositar(1000);
//conta.sacar(300);
//conta.exibirSaldo();
public class Desafio10 {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria(11,"neymar");

        conta.depositar(500);
        conta.depositar(500);
        conta.sacar(500);
        conta.sacar(500);
        conta.sacar(500);
        conta.exibirInfo();

    }



}
