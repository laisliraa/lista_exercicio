import java.util.Scanner;

public class SomaSimples {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Olá, iremos realizar a soma de dois números inteiros.");

        // variáveis utilizadas

        int num1;
        int num2;
        int soma;

        // comando de entrada de informações digitadas pelo usuário

        System.out.println("Digite o primeiro número:");
        num1 = input.nextInt();

        System.out.println("Digite o segundo número:");
        num2 = input.nextInt();

        // calculando as variáveis
        soma = num1 + num2;

        // comando de saída com o resultado

        System.out.println("A soma entre os números " +  num1 + " e " +  num2 + " 4é igual a: " + soma);

        input.close();
    }
}
