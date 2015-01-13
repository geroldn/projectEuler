/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg9_specialpythagoriantriplet;

/**
 *
 * @author gerold
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean found = false ;
        for (int c=1; c<1000 && ! found; c++) {
            int c2 = (int) Math.pow(c, 2) ;
            for (int a = 1; a < c && ! found; a++) {
                int a2 = (int) Math.pow(a, 2) ;                
                    int b2 = (int) Math.pow(1000 - a - c, 2) ;
                    if (a2 + b2 == c2) {
                        found = true ;
                        System.out.println(">>> " + (long)(a * (1000 - c - a) * c) + " " + a + " " + (1000 - c - a) + " " + c) ;
                }
            }
            
        }
    }
    
}
