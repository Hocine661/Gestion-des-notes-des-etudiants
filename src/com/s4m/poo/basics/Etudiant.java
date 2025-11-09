package com.s4m.poo.basics;

import java.util.ArrayList;

public class Etudiant {

    private String nom, avis;
    private float moyenne;
    private ArrayList<Notation> notations;

    public Etudiant(String nom) {
        this.nom = nom;
        this.notations = new ArrayList<>();
        this.moyenne = 0;
    }


    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getAvis() {
        return avis;
    }
    public void setAvis(String avis) {
        this.avis = avis;
    }
    public float getMoyenne() {
        return moyenne;
    }
    public void setMoyenne(float moyenne) {
        this.moyenne = moyenne;
    }
    public ArrayList<Notation> getNotations() {
        return notations;
    }
    public void setNotations(ArrayList<Notation> notations) {
        this.notations = notations;
    }


    public void calculerMoyenne() {
        var sumCoef = 0;
        var sumCoefxNote = 0;
        for (Notation n : this.notations) {
            sumCoef += n.getCoef();
            sumCoefxNote += n.getCoef() * n.getNote();
        }
        this.moyenne = sumCoefxNote/ sumCoef ;
    }


    public void genereAvis() {
        this.avis = this.moyenne >= 10 ? "Passe en classe supérieur" : "Autorisé à redoublé";
    }


    public void ajouterNotation(Notation n) {
        notations.add(n);
    }


    public void afficher() {
        System.out.println("\n Information de l'étudiant :");
        System.out.println("Nom :" + this.nom);
        for (Notation n : this.notations) {
            n.afficher();
        }
        System.out.println("Moyenne :" + this.moyenne);
        System.out.println("Avis :" + this.avis);
    }
}
