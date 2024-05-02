import java.util.Locale;
import java.util.Scanner;

import exception.ParametrosInvalidosException;

public class Contador {
    public static void main(String[] args) {
        //Executa o desafio sem exception
        executarDesafio();
        //Executa o desafio com exception
        //executarDesafioComErro();
    }

    public static void executarDesafio(){
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o valor do parâmetro um:");
        int parametroUm = input.nextInt();
        System.out.println("Digite o valor do parâmetro dois:");
        int parametroDois= input.nextInt();
        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void executarDesafioComErro(){
        int parametroUm = 40;
        int parametroDois= 10;
        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if (parametroUm >= parametroDois)
            throw new ParametrosInvalidosException("Parâmetro um deve ser menor que o parâmetro dois");
        
        int contador = parametroDois - parametroUm;
        
        for (int i = 0; i < contador; i++) {
            System.out.println("Imprimindo número ".concat(String.valueOf(i+1)));
        }
    }
}
