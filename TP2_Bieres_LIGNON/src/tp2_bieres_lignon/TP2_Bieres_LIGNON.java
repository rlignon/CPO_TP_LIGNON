//LIGNON Ronan 03/11/2025 Création d’une première classe et de quelques objets associés

package tp2_bieres_lignon;

/**
 *
 * @author ronan
 */
public class TP2_Bieres_LIGNON {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", (float) 7.0, "Dubuisson");
        BouteilleBiere uneBiere2 = new BouteilleBiere("Leffe", (float) 6.6, "Abbaye de Leffe");
        BouteilleBiere uneBiere3 = new BouteilleBiere("Kronenbourg 1664", (float) 5.5, "Brasseries Kronenbourg");
        BouteilleBiere uneBiere4 = new BouteilleBiere("Chimay Bleue", (float) 9.0, "Abbaye de Scourmont");
        BouteilleBiere uneBiere5 = new BouteilleBiere("Desperados", (float) 5.9, "Brasserie Fischer");

        //uneBiere.lireEtiquette();
        uneBiere.Décapsuler();
        System.out.println(uneBiere) ;
        uneBiere2.Décapsuler();
        System.out.println(uneBiere2) ;
        uneBiere3.Décapsuler();
        System.out.println(uneBiere3) ;
        uneBiere4.Décapsuler();
        System.out.println(uneBiere4) ;
        System.out.println(uneBiere5) ;
    }

}
