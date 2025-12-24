package graphes;

public class Edge {


    /* On initialise un tableau de deux élements qu'on va utiliser comme un tuple */
    private Noeud noeudsArretes[] = new Noeud[2];

    public Edge(Noeud A , Noeud B){
        
        this.noeudsArretes[0] = A;
        this.noeudsArretes[1] = B;
    }


    public Noeud[] getNoeudsArrete(){
        return this.noeudsArretes;
    }

    /*public void supprimerArrete(){
        
    }*/
    
}