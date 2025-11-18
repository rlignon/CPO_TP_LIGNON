/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_lignon;

/**
 *
 * @author ronan
 */
public class Guerrier extends Personnage {

    boolean cheval;

    public Guerrier(boolean cheval, int vieniv, String nom) {
        super(vieniv, nom);
        this.cheval = cheval;
    }

    public void setCheval(boolean cheval) {
        this.cheval = cheval;
    }
    

}
