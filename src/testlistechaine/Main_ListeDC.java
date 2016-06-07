/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testlistechaine;

import java.util.Iterator;

/**
 *
 * @author flavo
 */
public class Main_ListeDC {
    public static void main(String[] args) {
    ListeDC<Integer> LI = new ListeDC<>();
    
    LI.ajouter_debut (new Integer(7));
    LI.ajouter_debut (new Integer(5));
    LI.ajouter_debut (new Integer(3));
	Iterator<Integer> IT = LI.iterator();
    //   -----> peu entrer ici tous ce qui esiterable

    while (IT.hasNext () 
        ){
		Integer x = IT.next();
        System.out.println(x);
    }
    }
    static public Integer somme(Iterable<Integer> it) {
        Integer S = new Integer(0);
        for (Iterator<Integer> I = it.iterator(); I.hasNext();) {
            S += I.next();
        }
        return S;

    }
}
