//LIGNON Ronan 05/11/2025 Coder une première relation entre deux objets

package tp2_relation_1_lignon;

/**
 *
 * @author ronan
 */
public class TP2_relation_1_LIGNON {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Voiture uneClio = new Voiture("Clio", "Renault", 5);
        Voiture uneAutreClio = new Voiture("Clio", "Renault", 5);
        Voiture une2008 = new Voiture("2008", "Peugeot", 6);
        Voiture uneMicra = new Voiture("Micra", "Nissan", 4);
        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");
        System.out.println("""
                           liste des voitures disponibles 
                           """ + uneClio
                + "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra);

        //bob.liste_voitures[0] = uneClio;
        //bob.nbVoitures = 1;
        //uneClio.Proprietaire = bob;
        //bob.liste_voitures[bob.nbVoitures] = une2008;
        //bob.nbVoitures = 2;
        //uneClio.Proprietaire = bob;
        //reno.liste_voitures[reno.nbVoitures] = uneMicra;
        //reno.nbVoitures = 1;
        //uneClio.Proprietaire = reno;
        //reno.liste_voitures[reno.nbVoitures] = une2008;
        //reno.nbVoitures = 2;
        //uneClio.Proprietaire = reno;
        bob.ajouter_voiture(uneClio);
        bob.ajouter_voiture(uneAutreClio);

        reno.ajouter_voiture(uneMicra);
        reno.ajouter_voiture(uneAutreClio);

        System.out.println(bob);
        System.out.println(reno);

        // essai d'ajouter une voiture déjà prise
        reno.ajouter_voiture(uneClio);
        
        //System.out.println("la premiere voiture de Bob est "        + bob.liste_voitures[0]);
        //System.out.println("la Deuxième voiture de Bob est "        + bob.liste_voitures[1]);
        //System.out.println("la premiere voiture de Reno est "+ reno.liste_voitures[0]);

    }

}
