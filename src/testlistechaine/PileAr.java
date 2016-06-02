/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testlistechaine;

import java.util.ArrayList;

/**
 *
 * @author flavo
 */
public class PileAr<E> extends ArrayList<E> {

    public PileAr() {
        super();
    }

    public E sommet() throws PileVide {
        if (isEmpty()) {
            throw new PileVide();
        }
        return get(size() - 1);
    }

    public void empiller(E element) {
        add(element);
    }

    public void depiller() throws PileVide {
        if (isEmpty()) {
            throw new PileVide();
        }
        remove(size() - 1);
    }
}
