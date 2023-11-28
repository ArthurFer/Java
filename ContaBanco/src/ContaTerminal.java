import java.util.Scanner;

// Programa para exercitar conhecimentos de sintaxe Java. É solicitado ao usuário dados de cadastro de uma conta bancária e ao final é exibido uma saída no terminal validando a criação da conta
public class ContaTerminal {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numero = 0;
        String agencia = "";
        String nome = "";
        double saldo = 0.0;

        System.out.println("Digite o número da Agência:");
        agencia = input.next();
        System.out.println("Digite o número da conta:");
        numero = input.nextInt();
        System.out.println("Digite o nome do titular:");
        nome = input.next();
        System.out.println("Digite o valor para depósito:");
        saldo = input.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + numero + " e o seu saldo " + saldo + " já está disponível para saque.");

    }
}
