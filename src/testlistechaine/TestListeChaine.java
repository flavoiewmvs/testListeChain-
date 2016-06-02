/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testlistechaine;

import java.util.*;

/**
 *
 * @author flavo
 */
public class TestListeChaine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Pile<Double> Mapile = new <Double> Pile();
        PileAr<Double> Mapile = new <Double> PileAr();
        Mapile.empiller(new Double(3.12));
        affiche(Mapile, "Apres empiller -3.12 -> ");
        Mapile.empiller(new Double(7.1));
        affiche(Mapile, "Apres empiller -7.1 -> ");
        Mapile.empiller(new Double(-4.0));
        affiche(Mapile, "Apres empiller -4.0 -> ");
        try {
            Mapile.depiller();
        } catch (PileVide E) {
            System.out.println("Attention Pile vide");
        }
        affiche(Mapile, "Apres depiller -> ");
        System.err.println("Taille :" + Mapile.size());

        ListeDC<Integer> LI = new ListeDC<>();
        LI.ajouter_debut(new Integer(7));
        LI.ajouter_debut(new Integer(5));
        LI.ajouter_debut(new Integer(3));
        for (int i = 0; i < LI.getTaille() - 1; ++i) {
            System.out.println("item Li" + LI.getDebut());
        }
    }

    public static void affiche(PileAr Mapile, String msg) {
        try {
            System.out.println(msg + "Sommet : " + Mapile.sommet());

        } catch (PileVide E) {
            System.out.println("Attention Pile vide");
        }
    }
}
