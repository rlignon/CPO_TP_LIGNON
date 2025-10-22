// LIGNON Ronan 20/10/2025 Calculette
package tp0_calculette;

import java.util.Scanner;

/**
 *
 * @author ronan
 */
public class TP0_calculette {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int operateur;
        Double operande1;
        Double operande2;
        Double result = null;
        Scanner sc = new Scanner(System.in); 
        System.out.println("""
                           Please enter the operator:
                           1) add
                           2) substract
                           3) multiply
                           4) divide
                           5) modulo""");
        operateur=sc.nextInt();
        if (operateur<1 || operateur>5){
            System.out.println("Error");
            return;
        }
       
        System.out.println("Choisir la première valeur");
        operande1 = sc.nextDouble();
        System.out.println("Choisir la Deuxième valeur");
        operande2 = sc.nextDouble();

        if (operateur == 1) {
            result= operande1 + operande2;
        }
        if (operateur == 2) {
            result= operande1 - operande2;
        }
        if (operateur == 3) {
            result= operande1 * operande2;
        }
        if (operateur == 4) {
            result= operande1 / operande2;
            if (operande2==0){
                System.out.println("Error");
                return;
            }
        }
        if (operateur == 5) {
            result= operande1 % operande2;
        }
        System.out.println(result);


        
        
    }
    
}
