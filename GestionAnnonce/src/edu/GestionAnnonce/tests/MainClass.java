/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.GestionAnnonce.tests;

import edu.GestionAnnonce.entities.Annonce;
import edu.GestionAnnonce.services.ServiceAnnonce;

/**
 *
 * @author NOURHENE
 */
public class MainClass {
     public static void main(String[] args) {
         Annonce m1 = new Annonce("troc","vehicule","voiture","en bon etat",55,"fr","fghjk","ghjk",78);
            Annonce m2= new Annonce("echange","electro","vbn","bien",58,"fr","fghjvk","ghsjk",85);
           
        
          ServiceAnnonce sp = new ServiceAnnonce();
          
       //  sp.supprimer(4);
       sp.modifier(m1);
     }
     }
    

