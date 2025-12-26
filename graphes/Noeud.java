package graphes;

import java.util.ArrayList;
import java.util.Set;

public class Noeud{
    
    private Set<Noeud> voisins;
    private Object label;
    private int degre;
    private static int nb_noeuds;


    public Noeud(Object label){
        this.voisins = new Set();
        this.label = label;
        this.degre = 0;
        nb_noeuds++;
    }

    public Object getLabel(){
        return this.label;
    }

    public int getDegre(){
        return this.degre;
    }
    
    /*public Noeud getVoisinByIndex(int indice){
        return this.voisins[indice];
    }*/

    public ArrayList getAllVoisins(){
        return this.voisins;
    }

    public void ajouterVoisin(Noeud v){
        this.voisins.add(v);
    }

    public String toString(){
        return this.label.toString();
    }
}