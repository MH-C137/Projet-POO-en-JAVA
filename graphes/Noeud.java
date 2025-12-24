package graphes;

public class Noeud{

    private Noeud [] voisins;
    private Object label;
    private int degre;
    private static int nb_noeuds;


    public Noeud(Object label){
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
    
    public Noeud getVoisinbyindex(int indice){
        return this.voisins[indice];
    }

    public Noeud [] getAllVoisins(){
        return this.voisins;
    }

    public String toString(){
        return this.label.toString();
    }
}