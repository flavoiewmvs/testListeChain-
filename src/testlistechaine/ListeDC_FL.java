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
public class ListeDC_FL<E> implements Iterable<E> {

    public Nœud getDebut() {
        return _debut;
    }

    public Nœud getFin() {
        return _fin;
    }

    public int getTaille() {
        return _taille;
    }

    private class Nœud<E> {

        Nœud<E> _precedant = null;
        Nœud<E> _suivant = null;

        E _element = null;

        public Nœud(E element) {
            _element = element;
        }
    }
    private Nœud _debut = null;
    private Nœud _fin = null;
    private int _taille = 0;

    public void listeDC() {
    } //   ; test ;   entre accolade

    public void ajouter_debut(E element) {
        Nœud<E> N = new Nœud<>(element);
        N._suivant = _debut;
        _debut = N;
        if (_fin == null) {
            _fin = N;
        } else {
            N._suivant._precedant = N;
        }
        ++_taille;
    }

    public void enlever_debut() { // throws -- -- >     throw listevide    ? 
        _debut = _debut._suivant;
        if (_debut == null) {
            _fin = null;
        } else {
            _debut._precedant = null;
        }
        --_taille;
    }

    public class iterListeDC<S> implements Iterator<S> {

        private Nœud<S> _courant = null;

        public iterListeDC(ListeDC_FL<E> a_liste) {
            _courant = (ListeDC<E>.Nœud<S>) a_liste._debut;
        }

        public S next() {
            S element = _courant._element;
            _courant = _courant._suivant;
            return element;
        }

        public boolean hasNext() {
            return _courant != null;
        }

    }

    public Iterator<E> iterator() {
        return new iterListeDC(this);
    }
}
