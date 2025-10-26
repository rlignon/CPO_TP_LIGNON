// LIGNON Ronan 24/10/2025 Statistiques

package tp1_stats_lignon;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ronan
 */
public class TP1_stats_LIGNON {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random generateurAleat = new Random();
        double tab [] = new double[6];
        int nb;
        int m;
        System.out.println("choicir un nombre");
        m=sc.nextInt();
        for (int i =0 ; i<m ; i++){
            nb = generateurAleat.nextInt(5);
            tab [nb]+=1;
        }
        for (int j =0 ; j<6 ; j++){
            tab[j]=(tab[j]/m)*100;
        }
        for (int i =0 ; i<6 ; i++){
             System.out.println(tab[i]+" %");
        }
    }
    
}
