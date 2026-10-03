import java.util.Scanner;

public class L6E3 {
    public static void main(String[] args) {

     double[] vetor = new double[4];
     double soma = 0;
     
     Scanner leia = new Scanner(System.in);
     
     System.out.println("Digite 4 notas:");
     
     for(int x = 0; x < vetor.length; x++) {
         vetor[x] = leia.nextDouble();
         soma = soma + vetor[x];
     }
     
     double media = soma / 4;
     
     System.out.println("As notas são: ");
     
     for(int x = 0; x < vetor.length; x++) {
         System.out.println(vetor[x]);
     }
     
     System.out.println("A média é: " + media);
        
     leia.close();  
   
    }
}

