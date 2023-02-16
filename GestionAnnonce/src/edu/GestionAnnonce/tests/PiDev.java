/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pidev;

import pidev.entities.Livreur;
import pidev.services.ServiceLivreur;

/**
 *
 * @author Ghazoua
 */
public class PiDev {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Livreur l1= new Livreur(11111111,"mourad","jerbi","mourad@gmail.com","mourad2121","homme","21-12-1989",97503700,"41 rue tanjer cite mostakbel","livreur","disponible");
       Livreur l2= new Livreur(22222222,"sami","ayari","sami@gmail.com","sami2323","homme","04-02-1999",98789545,"45 rue tanjer","livreur","disponible");
       Livreur l3= new Livreur(33333333,"sami","ayari","sami@gmail.com","sami2323","homme","04-02-1999",98789545,"45 rue tanjer","livreur","disponible");
       ServiceLivreur sp = new ServiceLivreur();
      // sp.ajouter(l1);
       //sp.supprimer(33333333);
      // System.out.println(sp.afficher());
       sp.modifier(l2);
    }
    
}
