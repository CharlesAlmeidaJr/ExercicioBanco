public class Conta {
    String titular = "José Charles";
    int numero = 1234;
    String agencia = "Banco do Brasil";
    double saldo = 1500d;
    String dataAbertura = "04/07/2023";

    public void sacar(double valor) {
        saldo = saldo - valor;
    }

    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    public double calcularRendimento() {
        return saldo*0.1;
    }
}
