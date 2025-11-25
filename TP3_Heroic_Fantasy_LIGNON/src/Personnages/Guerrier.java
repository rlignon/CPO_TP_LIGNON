/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author ronan
 */
public class Guerrier extends Personnage {

    boolean cheval;
    public static int nbGuerriers = 0;

    public Guerrier(boolean cheval, int vieniv, String nom) {
        super(vieniv, nom);
        this.cheval = cheval;
        nbGuerriers += 1;
    }

    @Override
    public void finalize() throws Throwable {
        nbGuerriers -= 1;
        super.finalize();
    }

    public void setCheval(boolean cheval) {
        this.cheval = cheval;
    }

    public void attaquer(Personnage cible) {
        if (Arme_en_Main == null) {
            System.out.println(nom + " n'a pas d'arme en main !");
            return;
        }

        double degats = Arme_en_Main.getniveau();

        // Si c'est une épée, multiplier par sa finesse
        if (Arme_en_Main instanceof Armes.Epee epee) {
            degats *= epee.getFinesse();
            this.seFatiguer();
        }

        // Si guerrier à cheval, diviser les dégâts par 2
        if (cheval) {
            degats /= 2;
        }

        cible.estAttaque((int) degats);

    }

    @Override
    public String toString() {
        String r = super.toString();

        return r + "Guerrier{" + "cheval=" + cheval + '}';
    }

}
