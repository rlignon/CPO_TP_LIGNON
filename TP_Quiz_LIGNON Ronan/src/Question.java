
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ronan
 */
public class Question {

    private String intitule;
    private String proposition1;
    private String proposition2;
    private String proposition3;
    private String proposition4;
    private int indexBonneReponse;


    public Question(String intitule, String proposition1, String proposition2, String proposition3, String proposition4, int indexBonneReponse) {
        this.intitule = intitule;
        this.proposition1 = proposition1;
        this.proposition2 = proposition2;
        this.proposition3 = proposition3;
        this.proposition4 = proposition4;
        this.indexBonneReponse = indexBonneReponse;

    }

    public String Get_intitule() {
        return intitule;
    }

    public String Get_proposition1() {
        return proposition1;
    }

    public String Get_proposition2() {
        return proposition2;
    }

    public String Get_proposition3() {
        return proposition3;
    }

    public String Get_proposition4() {
        return proposition4;
    }

    public int Get_index() {
        return indexBonneReponse;
    }

}
