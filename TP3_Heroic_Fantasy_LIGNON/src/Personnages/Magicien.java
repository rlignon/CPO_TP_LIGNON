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

    public Magicien(boolean confirmé, int vieniv, String nom) {
        super(vieniv, nom);
        this.confirmé = confirmé;
    }

    public void setConfirmé(boolean confirmé) {
        this.confirmé = confirmé;
    }


}
