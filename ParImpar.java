import java.util.Scanner;

public class ParImpar {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //variáveis utilizadas
        int numero;

        //comando de entrada para o usuário inserir informações

        System.out.println("Digite um número:");
        numero = input.nextInt();

        //comando de saída para o usuário

        if (numero%2 == 0){
            System.out.println("O número " + numero + " é par!");
        } else {
            System.out.println("O número " + numero + " é impar!");
        }

        input.close();
    }
}
