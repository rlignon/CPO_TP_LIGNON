/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_lignon;

/**
 *
 * @author ronan
 */
public class Personne {

    String nom;
    String prenom;
    int nbVoitures;
    Voiture[] liste_voitures;

    public Personne(String LeNom, String LePrenom) {
        nom = LeNom;
        prenom = LePrenom;
        liste_voitures = new Voiture[3];
        nbVoitures = 0;
    }

    public boolean ajouter_voiture(Voiture voiture_a_ajouter) {
        if (voiture_a_ajouter.Proprietaire != null) {
            System.out.println("️ La voiture a déjà un propriétaire !");
            return false;
        }
        if (nbVoitures >= 3) {
            System.out.println(prenom + " " + nom + " a déjà 3 voitures !");
            return false;
        }
        liste_voitures[nbVoitures] = voiture_a_ajouter;
        nbVoitures++;
        voiture_a_ajouter.Proprietaire = this;
        return true;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        String chaine_a_retourner2;
        chaine_a_retourner2 = "nom : " + nom + "prenom :" + prenom;
        return chaine_a_retourner2;
    }
}
