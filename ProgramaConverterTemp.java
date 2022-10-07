import java.util.Scanner;

public class ProgramaConverterTemp {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);

        //variáveis
         float tempC5;
         float tempF;
         float tempK;
         float tempC;
         int conversão;
         float temp;
         
        //comandos de saída para o usuário inserir informações
         System.out.println("Informe qual a forma de conversão desejada:");
         System.out.println("1 - Celsius para Fahrenheit");
         System.out.println("2 - Celsius para Kelvin");
         System.out.println("3 - Fahrenheit para Celsius");
         System.out.println("4 - Kelvin para Celsius");
         conversão = input.nextInt();
         
         System.out.println("Informe qual valor da temperatura inicial escolhida para a conversão:");
         temp = input.nextFloat();

        //fórmula da conversão

         tempC5 = temp - 329;
         tempF = temp + 329;

         tempK = temp + 273;
         tempC = temp - 273;

        //comandos de saída para o usuário

         if (conversão == 1){
            System.out.println("O valor da conversão é: " +tempC5+ " Farenheit.");
         } else if (conversão == 2){
            System.out.println("O valor da conversão é: " +tempK+ " Kelvin.");
         } else if (conversão == 3){
            System.out.println("O valor da conversão é: " +tempF+ " Celsius.");
         } else if (conversão == 4){
            System.out.println("O valor da conversão é: " +tempC+ " Celsius.");
         }

        input.close();
    }
}
