/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

import Armes.Arme;

/**
 *
 * @author ronan
 */
public class Baton extends Arme {

    int age;

    public Baton(String nom, int niveau, int age) {
        super(niveau, nom);
        this.age = age;
        if (age > 100) {
            age = 99;
        }
            
    }
    public int getage() {
        return age;
    }
}

