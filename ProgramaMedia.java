import java.util.Scanner;

public class ProgramaMedia {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);

        //variáveis 
        
         float nota1;
         float nota2; 
         float nota3;
         float media;
         String nome_aluno;

        //comandos de entrada para o usuário 
         System.out.println("Olá, informe seu nome:");
         nome_aluno = input.nextLine();
         System.out.println("Informe sua primeira nota:");
         nota1 = input.nextFloat();
         System.out.println("Informe sua segunda nota:");
         nota2 = input.nextFloat();
         System.out.println("Informe sua terceira nota:");
         nota3 = input.nextFloat();

         //calculando média
         media = (nota1+nota2+nota3)/3;

        //if e else 
         if (media >= 10){
            System.out.println("O(a) aluno(a) " + nome_aluno +  "tem uma média A. Aprovado(a).");
         } else if (media >= 7 && media < 9){
            System.out.println("O(a) aluno(a) " + nome_aluno + " tem uma média B. Aprovado(a).");
         } else if (media >= 6 && media < 7){
            System.out.println("O(a) aluno(a) " + nome_aluno + " tem uma média C. Aprovado(a).");
         } else if (media >= 4 && media < 6){
            System.out.println("O(a) aluno(a) " + nome_aluno + " tem uma média D. Reprovado(a).");
         } else if (media < 4){
            System.out.println("O(a) aluno(a)" + nome_aluno + " tem uma média E. Reprovado(a).");
         }

        input.close();
    }
}
