/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_lignon;

/**
 *
 * @author ronan
 */
public abstract class Personnage {
    int vieniv;
    String nom;
    public Personnage(int vieniv, String nom) {
        this.vieniv = vieniv;
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Personnage{" + "vieniv=" + vieniv + ", nom=" + nom + '}';
    }
    

    
}
