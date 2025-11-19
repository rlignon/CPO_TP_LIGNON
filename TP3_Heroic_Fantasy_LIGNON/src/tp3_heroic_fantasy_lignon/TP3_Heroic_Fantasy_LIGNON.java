/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_lignon;

import Personnages.Magicien;
import Personnages.Personnage;
import Personnages.Guerrier;
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
        ArrayList<Arme> armes1 = new ArrayList<>();
        armes1.add(Epee1);
        armes1.add(Epee2);
        armes1.add(Baton1);
        armes1.add(Baton2);

        for (int i = 0; i < armes1.size(); i++) {
            System.out.println(armes1.get(i));
        }
        System.out.println(armes1.size());
        Magicien magicen1 = new Magicien(true, 65, "Gandalf");
        Magicien magicen2 = new Magicien(false, 44, "Garcimore");
        Guerrier guerrier1 = new Guerrier(false, 78, "Conan");
        Guerrier guerrier2 = new Guerrier(true, 45, "Lannister");
        ArrayList<Personnage> personnage1 = new ArrayList<>();
        personnage1.add(magicen1);
        personnage1.add(magicen2);
        personnage1.add(guerrier1);
        personnage1.add(guerrier2);
        System.out.println(personnage1);
// attribution arme guerrier
        guerrier1.arme(Baton1);
        guerrier1.arme(Epee1);
        guerrier1.arme(Epee2);
        guerrier1.arme_choose(Epee1);
        System.out.println(guerrier1);
// attribution arme magicien
        magicen2.arme(Baton1);
        magicen2.arme(Baton2);
        magicen2.arme(Epee2);

        
    }
    }


