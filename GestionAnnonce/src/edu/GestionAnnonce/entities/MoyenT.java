/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pidev.entities;

import java.util.Objects;

/**
 *
 * @author Admin
 */
public class MoyenT {
    private int id;
    private String modéle ;
    private String marque;
   private String matricule;
   private String dispo;

    public MoyenT() {
    }

    public MoyenT( String matricule,String modéle, String marque,String dispo) {
  
         this.matricule = matricule;
        this.modéle = modéle;
        this.marque = marque;
          this.dispo = dispo;
       
    }

    public MoyenT(int id,String matricule,String modéle, String marque,String dispo) {
        this.id = id;
           this.matricule = matricule;
        this.modéle = modéle;
        this.marque = marque;
         this.dispo = dispo;
    }

    public int getId() {
        return id;
    }

    public String getMatricule() {
        return matricule;
    }

    public String getModéle() {
        return modéle;
    }

    public String getMarque() {
        return marque;
    }

    public String getDispo() {
        return dispo;
    }

    

    public void setId(int id) {
        this.id = id;
    }

 

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }
   public void setModéle(String modéle) {
        this.modéle = modéle;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setDispo(String dispo) {
        this.dispo = dispo;
    }
    
    
    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MoyenT other = (MoyenT) obj;
        return Objects.equals(this.matricule, other.matricule);
    }

    //@Override
    /*public String toString() {
        return "MoyenT{" + "mod\u00e9le=" + modéle + ", marque=" + marque + ", matricule=" + matricule + '}';
   */ }

   
   

