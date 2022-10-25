import java.util.Scanner;

public class ProgramaDobroTriplo {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //variáveis utilizadas
        int numero;
        int resultado;

        //comandos de entrada para o usuário inserir informações
        System.out.println("Digite um número: ");
        numero = input.nextInt();

        //calculando as variáveis
        if (numero>0){
            resultado = numero*2;
        }else {
            resultado = numero*3;
        }

        System.out.println("O resultado final é: " + resultado);

        input.close();
    }
}
