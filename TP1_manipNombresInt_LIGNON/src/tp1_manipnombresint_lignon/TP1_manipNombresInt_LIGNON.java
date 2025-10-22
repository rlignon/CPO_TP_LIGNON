// LIGNON Ronan 22/10/2025 Saisie et manipulation de nombres 
package tp1_manipnombresint_lignon;

import java.util.Scanner;

/**
 *
 * @author ronan
 */
public class TP1_manipNombresInt_LIGNON {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nb1;
        int nb2;
        Scanner sc = new Scanner(System.in); 
        System.out.println("Choisir un premier nombre");
        nb1 = sc.nextInt();
        System.out.println("Choisir un deuxieme nombre");
        nb2 = sc.nextInt();
        System.out.println("La somme est : "+(nb1+nb2)+"\nLa soustraction est : "+(nb1-nb2)+"\nLe produiet est : "+(nb1*nb2));
        System.out.println("La division entiere est : "+(nb1/nb2)+"\nLe reste est : "+(nb1%nb2));

    }
    
}
