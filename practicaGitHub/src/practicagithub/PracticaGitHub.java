/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicagithub;

import java.util.*;

/**
 *
 * @author Marco Caza
 */
public class PracticaGitHub {

    /**
     * @param args the command line arguments
     */
    
        public static void main(String[] args) {
        String cadena; 
        char caracter;        
        int cont=0;
        Scanner sc=new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        System.out.println("anota cadena");
        cadena=sc.nextLine();
        System.out.println("anota caracter");
        caracter=sc.nextLine().charAt(0);
        
        
        for(int i=0;i<cadena.length();i++){
            char letra=cadena.charAt(i);
            //letra=Character.toUpperCase(letra);
            if(letra==caracter){
                cont++; 
            }
               
            
        }
        System.out.println("se tiene: "+cont);
        
        // TODO code application logic here
    
       
    }
    
}
