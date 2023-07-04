public class Conta {
    String titular;
    int numero;
    String agencia;
    double saldo;
    String dataAbertura;

    public Conta(String titular, int numero, String agencia, double saldo, String dataAbertura){
        this.titular = titular;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.dataAbertura = dataAbertura;
    }

    public void sacar(double valor) {
        saldo = saldo - valor;
    }

    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    public double calcularRendimento(double porcentagemRendimento) {
        return saldo*(porcentagemRendimento/100);
    }
}
