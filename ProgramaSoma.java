import java.util.Scanner;

public class ProgramaSoma {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //variáveis utilizadas
        int a;
        int b;
        int c;

        //comandos de entrada para o usuário inserir informações
        System.out.println("Digite um número:");
        a = input.nextInt();

        System.out.println("Digite um número novamente:");
        b = input.nextInt();

        //calculando as variáveis
        if (a>b){
            c = a + b;
            System.out.println("A soma entre os números " + a + " e " + b + " é: " + c);
        } else if (a<b) {
            c = a * b;
            System.out.println("A multiplicação entre os números " + a + " e " + b + " é: " + c);
        }

        //se os números forem iguais : else System.out.println("Error: Os nomes são iguais.");

        input.close();
    }
}
