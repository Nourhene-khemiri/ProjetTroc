/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pidev.test;

import edu.pidev.entities.MoyenT;
import edu.pidev.services.ServiceMoyenT;
import edu.pidev.utils.Connexion;
/**
 *
 * @author Admin
 */
public class MainClass {
       public static void main(String[] args) {
    
        MoyenT mT1 = new MoyenT ("124tunis","scooter","suzuki","disponible");
        MoyenT mT2 = new MoyenT ("199tunis233","partner","peugeot","indisponible");
      ServiceMoyenT sm = new ServiceMoyenT();
        
     //sm.ajouter(mT2);
     //sm.supprimer(2);
    //sm.modifier(mT1);
       sm.getAll();
    }
}
