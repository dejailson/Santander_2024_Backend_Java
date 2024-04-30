import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        System.out.println("Sistema Controle Bancário: abertura de conta");

        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da conta:");
        int numero = input.nextInt();
        System.out.println("Digite o número da agência:");
        String agencia = input.next();
        System.out.println("Digite o nome do cliente:");
        String nome = input.next();
        System.out.println("Digite o valor do primeiro depósito:");
        double saldo = input.nextDouble();
        
        String mensagem = "Olá, ".concat(nome)
                        .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                        .concat(agencia)
                        .concat(", Conta ")
                        .concat(String.valueOf(numero))
                        .concat(" e seu saldo ")
                        .concat(String.valueOf(saldo))
                        .concat(" já está disponível para saque");

        System.out.println(mensagem);

    }   
}