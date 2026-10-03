import java.util.Scanner;

public class L6E2 {
    public static void main(String[] args) {

     double[] vetor = new double[10];
     String ordem = "";
     
     Scanner leia = new Scanner(System.in);
     
     System.out.println("Digite 10 números reais:");
     
     for(int x = 0; x < vetor.length; x++) {
         vetor[x] = leia.nextDouble();
         ordem = vetor[x] + " " + ordem;
     }
     
     System.out.println("A ordem inversa é: " + ordem);
        
     leia.close();  
   
    }
}

