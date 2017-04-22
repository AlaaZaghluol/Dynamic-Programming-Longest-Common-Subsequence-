/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lcs;

/**
 *
 * @author AlaaSaad
 */
public class LCS {

    public static void main(String[] args) {
        String a = "ALAASAAD";
        String b = "AHMEDZAGHLUOL";
        int i,j;
        
        int dynamic[][] = new int[a.length() + 1][b.length() + 1];
        
        for (i = 0; i <= a.length(); i++){
            
            for ( j = 0; j <= b.length(); j++)
                if (i == 0 || j == 0)
                    dynamic[i][j] = 0;
                
                else if (a.charAt(i - 1) == b.charAt(j - 1))
                    dynamic[i][j] = dynamic[i - 1][j - 1] + 1;
                else{
                   dynamic[i][j] = Math.max(dynamic[i - 1][j], dynamic[i][j - 1]);
                }
                
        }
             
          
        for (i = 0; i < b.length(); i++)
            System.out.print(" " + b.charAt(i));
        
        for (i = 1; i <= a.length(); i++)
            for ( j = 1; j <= b.length(); j++)
                System.out.print(((j == 1) ? "\n" + a.charAt(i - 1) + " " : " ") + dynamic[i][j]);

        System.out.println("\nresult: " + dynamic[a.length()][b.length()]);

    }

}
    
