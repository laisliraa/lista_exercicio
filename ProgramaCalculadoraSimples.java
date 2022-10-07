import java.util.Scanner;

//Este é um programa de calculadora simples capaz de fazer as quatro operações entre dois números inteiros.

public class ProgramaCalculadoraSimples {
    public static void main(String[] args) {
        
         Scanner input = new Scanner (System.in);

        //variáveis
         int num1;
         int num2;
         int operação;
         int soma;
         int subtração;
         int multiplicação;
         int divisão; 

        //comandos de saída
        //usuário informar qual é a operação
         System.out.println("Qual tipo de operação deseja realizar?");
         System.out.println("1 - Soma");
         System.out.println("2 - Subtração");
         System.out.println("3 - Multiplicação");
         System.out.println("4 - Divisão");
         operação = input.nextInt();
        //usuário informar os números
         System.out.println("Informe o primeiro número:");
         num1 = input.nextInt();
         System.out.println("Informe o segundo número:");
         num2 = input.nextInt();

        //calculando as variáveis
         if (operação == 1){
            soma = (num1 + num2);
            System.out.println("A soma entre os números " + num1 + " e " + num2 + " é: " +soma);
         } else if (operação == 2){
            subtração = (num1 - num2);
            System.out.println("A subtração entre os números " + num1 + " e " + num2 + " é: " +subtração);
         } else if (operação == 3){
            multiplicação = (num1 * num2);
            System.out.println("A multiplicação entre os números " + num1 + " e " + num2 + " é: " +multiplicação);
         } else if (operação == 4){
            divisão = (num1 / num2);
            System.out.println("A divisão entre os números " + num1 + " e " + num2 + " é: " +divisão);
         } 

         input.close();
    }
}
