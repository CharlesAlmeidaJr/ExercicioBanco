import java.util.Locale;
import java.util.Scanner;

public class Correntista {

    public static void main(String[] args) {
        
        Conta conta = new Conta("José Charles", 1234, "111-1", 1500, "05/07/2023");

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite a agência: ");
        String agencia = scanner.next();
        
        System.out.println("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        if(agencia.equals(conta.agencia) && numeroConta == conta.numero){

            System.out.println("\nOlá " + conta.titular + ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.agencia + ", conta " + conta.numero + " e seu saldo " + conta.saldo + " já está disponível para saque.");

            int operacao = -1;

            while(operacao != 0){

                System.out.println("\nDigite a operação desejada:\n1 - Sacar\n2 - Depositar\n3 - Calcular rendimento\n0 - Encerrar");
                operacao = scanner.nextInt();

                switch(operacao){
                    case 1:
                        System.out.println("\nDigite o valor para sacar: ");
                        double valorSacar = scanner.nextDouble();

                        if(valorSacar <= conta.saldo){
                            conta.sacar(valorSacar);
                            System.out.println("\nValor sacado: R$ " + valorSacar + "\nSaldo atual: R$ " + conta.saldo);
                        }
                        else{
                            System.out.println("\nSaldo insuficiente.");
                        }
                    break;

                    case 2:
                        System.out.println("\nDigite o valor para depositar: ");
                        double valorDepositar = scanner.nextDouble();

                        conta.depositar(valorDepositar);
                        System.out.println("\nValor depositado: R$ " + valorDepositar + "\nSaldo atual: R$ " + conta.saldo);

                    break;

                    case 3:
                        System.out.println("\nDigite a porcentagem do rendimento: ");
                        double porcentagemRendimento = scanner.nextDouble();
                        System.out.println("\nRendimento: R$" + conta.calcularRendimento(porcentagemRendimento));
                    break;

                    case 0:
                    break;

                    default:
                        System.out.println("\nOperação inválida.");
                    break;

                }
        
            }

            System.out.println("\nPrograma encerrado.");
        }
        else{
            System.out.println("\nAgencia ou número da conta incorretos.");
        }

    }
    
}
