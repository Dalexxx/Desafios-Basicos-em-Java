public class ContaBancaria {

    private int numeroConta;
    private String titular;
    private int saldo;
    public ContaBancaria(int numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
    }

    public void depositar(int valor){
        saldo += valor;
        System.out.println("Foram depositados R$" + valor + " na sua conta");
        System.out.println("Seu saldo atual: R$" + saldo);
    }

    public void sacar(int valor) {
        if(saldo < valor) {
            System.out.println("Não tem saldo suficiente");
        } else {
            saldo -= valor;
            System.out.println("Você sacou R$" + valor + " da sua conta");
            System.out.println("Seu saldo atual: R$" + saldo);
        }
    }

    public void exibirInfo(){
        System.out.println("Conta: " + numeroConta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$" + saldo);
    }
}
