public class Correntista {

    public static void main(String[] args) {
        
        Conta conta = new Conta();

        System.out.println("Informações da Conta:" +
        "\nTitular: " + conta.titular +
        "\nAgência: " + conta.agencia +
        "\nNúmero da Conta: " + conta.numero +
        "\nData de abertura: " + conta.dataAbertura +
        "\nSaldo atual: R$" + conta.saldo +
        "\nRendimento: R$" + conta.calcularRendimento());

        
        if (conta.saldo >= 500){
            conta.sacar(500);
            System.out.println("\nValor sacado: R$ 500,00" + "\nSaldo atual: R$ " + conta.saldo);
        }
        else{
            System.out.println("\nSaldo insuficiente.");
        }
        
        conta.depositar(100);
        System.out.println("\nValor depositado: R$ 100,00" + "\nSaldo atual: R$ " + conta.saldo);

        if (conta.saldo >= 1000){
            conta.sacar(1000);
            System.out.println("\nValor sacado: R$ 1000,00" + "\nSaldo atual: R$ " + conta.saldo);
        }
        else{
            System.out.println("\nSaldo insuficiente.");
        }

        conta.depositar(800);
        System.out.println("\nValor depositado: R$ 800,00" + "\nSaldo atual: R$ " + conta.saldo);

        System.out.println("\nRendimento: R$" + conta.calcularRendimento());

    }
    
}
