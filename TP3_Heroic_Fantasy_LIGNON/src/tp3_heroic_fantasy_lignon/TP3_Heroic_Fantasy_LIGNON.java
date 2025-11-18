/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_lignon;

import Armes.Baton;
import Armes.Epee;
import Armes.Arme;
import java.util.ArrayList;


/**
 *
 * @author ronan
 */
public class TP3_Heroic_Fantasy_LIGNON {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Epee Epee1 = new Epee("Excalibur", 7, 5);
        Epee Epee2 = new Epee("Durandal", 4, 7);
        Baton Baton1 = new Baton("Chêne", 4, 5);
        Baton Baton2 = new Baton("Charme", 5, 6);
        ArrayList<Arme> armes1= new ArrayList<Arme>();
        armes1.add(Epee1);
        armes1.add(Epee2);
        armes1.add(Baton1);
        armes1.add(Baton2);
        
        for (int i=0;i<armes1.size();i++ ){
            System.out.println(armes1.get(i));
        }
        System.out.println(armes1.size());
         Magicien magicen1 = new Magicien(true,65,"Gandalf");

    }
    

}
