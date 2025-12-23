package Graphe;


public static class Noeud{
    int x;
}
public static class Graphe{
    private Noeud liste_noeuds[] = {NULL};
    private Edge liste_arretes[] = {NULL};
/*   private String liste_arretes ='\0';
    Hashmap liste_adjacences = {};*/


    public Graphe(){
        this.liste_noeuds[] = {NULL};
        this.liste_arretes[] = {NULL};
/*       this.liste_arretes = '\0';
        this.liste_adjacences = {};*/


    }

    /* On rajoute le noeud à la fin de la liste */
    public void ajoute_noeud(Noeud n){
        this.liste_noeuds[nb_noeuds] = n;


    }

    public void supprimer_noeud(Noeud n){
        foreach (Edge arretes : n.liste_arretes)){


        }

    }
}