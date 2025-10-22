//LIGNON Ronan 20/10/2025 Affichage d’un message 
package tp0_.helloworld;

import java.util.Scanner;

/**
 *
 * @author ronan
 */
public class TP0_HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println( " Bonjour " ) ; 
        System.out.println("Au Revoir");
        int i = 20;
        String prenom;
        Scanner sc ;
        sc = new Scanner (System.in) ;
        System.out.println("Quel est votre prénom ?");
        prenom = sc.nextLine();
    }
    
}
