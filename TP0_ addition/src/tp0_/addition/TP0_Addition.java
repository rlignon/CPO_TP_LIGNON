// LIGNON Ronan 20/10/2025 Addition d’entiers
package tp0_.addition;

import java.util.Scanner;

/**
 *
 * @author ronan
 */
public class TP0_Addition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nb; // nombre d'entiers à additionner
        int result; // resultat
        int ind; //indice
        // initialisation
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer le nombre :");
        nb=sc.nextInt();
        result=0;
        // addition des nb premiers entiers
        ind=1;
        while (ind< nb) {
            result=result+ind;
            ind++;
           }
        // affichage du resultat
        System.out.println("la somme des "+ nb + " entiers est : "+result); 
    }
    
}
