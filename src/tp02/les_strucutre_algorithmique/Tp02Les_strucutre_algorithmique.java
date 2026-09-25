/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp02.les_strucutre_algorithmique;

import java.util.Scanner;

/**
 *
 * @author pandre4
 */
public class Tp02Les_strucutre_algorithmique {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                
        //Ex 6 Opérations arithmétiques sur entiers
        
        Scanner sc = new Scanner(System.in);
        
       /* System.out.println("Quel est le mot de passe: ");
        String motdepasse = sc.nextLine();

        while(!motdepasse.equals("admin123")){
            System.out.println("Mot de passe incorrect, veuillez réessayer:");
            motdepasse = sc.nextLine();
        }
        System.out.println("Utilisateur valide");*/
       
       System.out.println("1");
       System.out.println("2");
       System.out.println("0");
       System.out.println("Que choisissez-vous entre 0 a 2?: ");
       int choix = sc.nextInt();
       
       switch(choix){
           case 1:
               System.out.println("Bonjour");
               break;
           case 2:
               System.out.println("Au revoir");
               break;
           case 0:
               break;
       }
    }
    
}
