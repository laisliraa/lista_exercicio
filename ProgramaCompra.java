import java.util.Scanner;

public class ProgramaCompra {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //variáveis utilizadas
        int pagamento;
        int parcelas;
        float valor; 
        float taxa;
        float juros;

        valor = 1000; 

        //comandos de entrada

        System.out.println("O valor do seu produto é de R$ 1.000,00");

        System.out.println("Digite o número referente a opção de pagamento escolhida: ");
        System.out.println("1. À vista");
        System.out.println("2. Via pix");
        System.out.println("3. Débito");
        System.out.println("4. Crédito a vista");
        System.out.println("5. Crédito parcelado");
        pagamento = input.nextInt();

        // f colocado por que a variável é float

        //comandos de saída
        if ( pagamento == 1 || pagamento == 2 || pagamento == 3){
            valor = valor - (valor*0.1f);
            System.out.println("O valor do seu produto ficou de R$"+valor + " reais.");

        } else if ( pagamento == 4){
            System.out.println("O valor do seu produto ficou de R$"+valor + " reais.");

        } else if ( pagamento == 5){
            valor = valor + (valor*0.1f);
            System.out.println("Informe a quantidade de parcelas desejadas:");
            parcelas = input.nextInt();
            taxa = 0.01f;
            juros = valor * taxa * parcelas;
            valor = valor + juros;
            System.out.println("O valor final do seu produto parcelado em " + parcelas + " vezes, foi de " + valor + " reais.");

        } else {
            System.out.println("Forma de pagamento não encontrada");
        }

        input.close();
    }
}
