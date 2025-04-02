import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite o número da Agência: ");
        int agencia = scanner.nextInt();

        System.out.println("Digite o número da conta: ");
        int conta = scanner.nextInt();

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite o seu saldo em reais (R$): ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá, " + nome + "! Obrigado por criar uma conta em nosso banco! Sua agência é " + agencia + " e o número de sua conta é " + conta + ". Seu saldo de R$" + saldo + " já está disponível para saque.");
    }
}