import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ContaTerminal {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo! Vamos criar uma conta nova.\n");

        System.out.println("Digite o numero da sua conta:\n");
        int conta =  scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite a agencia:\n");
        String agencia = scanner.nextLine();


        System.out.println("Digite o saldo:\n");
        double saldo = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Digite o nome do cliente:\n");
        String nome = scanner.nextLine();


        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " sua conta é: " + conta + " e seu saldo de: R$" + saldo + " já está disponível para saque");
        scanner.close();
    }
}