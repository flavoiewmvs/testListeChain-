package testlistechaine;

/**
 *
 * @author flavo Fabien Lavoie Lavf27046702
 * @param <E>
 */
public class Pile<E> {

    private class Noeud<E> {

        @Override
        public String toString() {
            return "Noeud{" + "element=" + element + '}';
        }

        private E element;
        private Noeud<E> precedant;

        public Noeud(E a_element, Noeud<E> a_noeud) {
            element = a_element;
            precedant = a_noeud;
        }
     }
    private int _taille = 0;
    private Noeud<E> _sommet = null;

    public Pile() {
    }

    public int taille() {
        return _taille;
    }

    public Boolean estvide() {
        return _sommet == null;
    }

    public E sommet() throws PileVide {
        if (estvide()) {
            throw new PileVide();
        }
        return _sommet.element;
    }
 
    public void empiller(E a_element) {
//        Noeud<E> N = new Noeud<>(a_element, _sommet); //  ici pourris se mettre dans une seule ligne
        _sommet = new Noeud<>(a_element, _sommet);
        ++_taille;
    }

    public void depiller() throws PileVide {
        if (estvide()) {
            throw new PileVide();
        }
        _sommet = _sommet.precedant;
         --_taille;
    }
 }
