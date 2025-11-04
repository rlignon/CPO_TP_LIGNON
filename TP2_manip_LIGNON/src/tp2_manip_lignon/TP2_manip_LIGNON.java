//LIGNON Ronan 04/11/2025 Manipulation des objets (par leur référence)

package tp2_manip_lignon;

/**
 *
 * @author ronan
 */
public class TP2_manip_LIGNON {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tartiflette assiette1 = new Tartiflette(500);
        Tartiflette assiette2 = new Tartiflette(600);
        Tartiflette assiette3 = assiette2;
        assiette2 = assiette1;
        assiette1 = assiette3;
        System.out.println("nb de calories de Assiette 3 : "
                + assiette3.nbCalories);
        System.out.println("nb de calories de Assiette 2 : "
                + assiette2.nbCalories);
        System.out.println("nb de calories de Assiette 1 : "
                + assiette1.nbCalories);
        Moussaka[] tabMoussaka = new Moussaka[10]; 
        for (int i = 0; i < tabMoussaka.length; i++) {
            tabMoussaka[i] = new Moussaka(i*100); 
        }

    }

}
