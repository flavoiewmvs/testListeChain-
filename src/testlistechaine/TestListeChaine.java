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
        Pile<Double> Mapile = new <Double> Pile();
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
        System.err.println("Taille :" + Mapile.taille());

//        test avec linkedlist
        LinkedList<String> maListe = new LinkedList<String>();
        maListe.add("Items 1");
        maListe.add("Items 2");
        maListe.add("Items 3");
        maListe.add("Items 4");
        System.out.println(maListe);
//        System.out.println(maListe.get(2));
        maListe.push("Items 999");
        System.out.println(maListe);
        try {
            System.out.println("\n extration du contenu de la liste chaine maListe\n\n");
            while (maListe.size() > 0) {
                System.out.println(maListe);
                System.out.println("-----> "+maListe.pop());

            }
        } catch (Exception E) {
            System.out.println("Attention Liste chaine vide vide");
        }
//x==7.1,t==2;
    }

    public static void affiche(Pile Mapile, String msg) {
        try {
            System.out.println(msg + "Sommet : " + Mapile.sommet());

        } catch (PileVide E) {
            System.out.println("Attention Pile vide");
        }
    }
}
