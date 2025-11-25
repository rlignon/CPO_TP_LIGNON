/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author ronan
 */

public class Magicien extends Personnage {

    boolean confirmé;
    public static int nbMagiciens = 0;

    public Magicien(boolean confirmé, int vieniv, String nom) {
        super(vieniv, nom);
        this.confirmé = confirmé;
        nbMagiciens += 1;
    }

    public void attaquer(Personnage cible) {
        if (Arme_en_Main == null) {
            System.out.println(nom + " n'a pas d'arme en main !");
            return;
        }

        double degats = Arme_en_Main.getniveau();

        // Si c'est un bâton, multiplier par son âge
        if (Arme_en_Main instanceof Armes.Baton baton) {
            degats *= baton.getage();
            this.seFatiguer();
        }

        // Si magicien confirmé, diviser par 2
        if (confirmé) {
            degats /= 2;
        }

        cible.estAttaque((int) degats);
    }

    @Override
    public void finalize() throws Throwable {
        nbMagiciens -= 1;     // on enlève 1 guerrier
        super.finalize();
    }

    public void setConfirmé(boolean confirmé) {
        this.confirmé = confirmé;
    }

    @Override
    public String toString() {
        String r = super.toString();

        return r + "magicien{" + "confirmé=" + confirmé + '}';
    }
}
