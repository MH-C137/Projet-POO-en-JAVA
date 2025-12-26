package graphes;

public class Edge {


    /* On initialise un tableau de deux élements qu'on va utiliser comme un tuple */
    private Noeud noeudsArrete[] = new Noeud[2];

    /* An edge cannot exist without vertices */
    public Edge(Noeud A , Noeud B){
        
        this.noeudsArrete[0] = A;
        this.noeudsArrete[1] = B;
    }


    public Noeud[] getNoeudsArrete(){
        return this.noeudsArrete;
    }
        /*public void supprimerArrete(){
        
    }*/

   /*
    * Vérifie qu'une arrête existe entre les deux noeuds donnés en paramètre
    * On vérifie en faisant une comparaison simple 
    */


    public boolean arreteExiste(Noeud A, Noeud B){
        boolean aTrouve = (A == this.noeudsArrete[0] || A == this.noeudsArrete[1]);
        boolean bTrouve = (B == this.noeudsArrete[0] || B == this.noeudsArrete[2]);
        return aTrouve && bTrouve;
    }

    public String toString(){

        StringBuilder res = new StringBuilder('(');
        res.append(this.noeudsArrete[0].toString());
        res.append(',');
        res.append(this.noeudsArrete[1].toString());
        res.append(')');

        return res.toString();
    }
    
/* On va peut être écrire une fonction qui permettrait de rechercher si une arrête existe en provenance d'un sommet (optimisation?)
public boolean arreteExiste(Noeud n)*/

    /* Pour l'instant, je ne sais pas supprimer un objet en JAVA
    public void supprimerArrete(){
        this.noeudsArrete = 0;
    }*/


}