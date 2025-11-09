package com.s4m.poo.basics;


import java.util.Scanner;

public class TestEtudiant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Veuillez entrer le nom de l'étudiant : ");
        String nom = sc.nextLine();
        Etudiant etudiant = new Etudiant(nom);

        System.out.println("Combien de matiére voulez-vous calculer la moyenne?");
        int nbMatiere = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < nbMatiere; i++) {
            System.out.println("\n Matière " + (i + 1) + ":");
            System.out.println("Nom de la matiére :");
            String matiere = sc.nextLine();

            int coef;
            do {
                System.out.println("Coefficient : ");
                coef = sc.nextInt();
                if (coef <= 0) {
                    System.out.println("Erreur : le coefficient doit etre supérieur à 0");
                }
            } while (coef <= 0);

            float note;
            do {
                System.out.println("Note :");
                note = sc.nextFloat();
                if (note < 0 || note > 20) {
                    System.out.println("Erreur : la note doit etre entre 0 et 20");
                }
            } while (note < 0 || note > 20);
            sc.nextLine();
            etudiant.ajouterNotation(new Notation(matiere, coef, note));
        }

        etudiant.calculerMoyenne();
        etudiant.genereAvis();
        etudiant.afficher();

        sc.close();
    }
}