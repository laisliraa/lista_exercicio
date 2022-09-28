import java.util.Scanner;

public class HelloWorld {
    
    public static void main(String[] args) {
        
        System.out.println("Olá!");
        
        Scanner input = new Scanner(System.in);

        //variáveis utilizadas
        String nome_completo;
        int idade;

        //comando de entrada para o usuário inserir informações

        System.out.println("Informe seu nome completo:");
        nome_completo = input.nextLine();

        System.out.println("Informe sua idade:");
        idade = input.nextInt();

        //comando de saída para o usuário
        
        System.out.println("Olá " + nome_completo + ", seja bem-vindo(a)! Você tem " + idade + " anos.");

        input.close();

    }
}
