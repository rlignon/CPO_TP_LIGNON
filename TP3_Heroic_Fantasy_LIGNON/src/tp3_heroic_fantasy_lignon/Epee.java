/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_lignon;

/**
 *
 * @author ronan
 */
public class Epee extends Arme{
    int finesse;
    public Epee(String nom,int niveau, int finesse) {
        super(niveau, nom);
        this.finesse = finesse;
        if (finesse>100){
            finesse=99;
        }
    }
    
}
