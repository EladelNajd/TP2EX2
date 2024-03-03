/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp2ex2;

/**
 *
 * @author LENOVO
 */
public class Livre {
    private String titre;
    private String auteur;
    public int annee;
    public int isbn ;

    public Livre() {
        this.titre="vagabond";
        this.auteur="Takehiko Inoue";
        this.annee=1998;
        this.isbn=5;
        
    }

    public Livre(String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;
        this.annee=2008;
        this.isbn=0;
       
    }

    public Livre(String titre, String auteur, int annee) {
        this.titre = titre;
        this.auteur = auteur;
        this.annee = annee;
        this.isbn=10;
    }

    public Livre(String titre, String auteur, int annee, int isbn) {
        this.titre = titre;
        this.auteur = auteur;
        this.annee = annee;
        this.isbn = isbn;
    }
    

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public int getAnnee() {
        return annee;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
    public void Tostring(){
        System.out.println("titre= "+this.titre+" , auteur="+this.auteur+" , annee de publication"+this.annee+" , isbn ="+this.isbn);
    }
    
    
    
    
    
}
