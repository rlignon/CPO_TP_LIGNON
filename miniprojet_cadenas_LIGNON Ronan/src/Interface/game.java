/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author ronan
 */
public class game {

    int[] code = new int[4];
    int[] code_secret = new int[4];

    public game(int case1, int case2, int case3, int case4) {
        code[0] = case1;
        code[1] = case2;
        code[2] = case3;
        code[3] = case4;
        for (int i = 0; i < 4; i++) {
            code_secret[i] = (int) (Math.random() * 10); // chiffre entre 0 et 9
        }
    }

    

    public int getCase(int nb) {
        return code[nb];
    }

    public void up(int csup) {
        if (code[csup] == 9) {
            code[csup] = 9;
        } else {
            code[csup] += 1;
        }
    }

    public void down(int csdown) {
        if (code[csdown] == 0) {
            code[csdown] = 0;
        } else {
            code[csdown] -= 1;
        }
    }
    
    public int 
}
