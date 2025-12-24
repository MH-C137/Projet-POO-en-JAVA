package graphes;
import java.util.ArrayList;



public class Graphe{
    
    public static int ERR_NOEUD_INEXISTANT = -10;

    private ArrayList<Noeud> liste_noeuds;
    private ArrayList<Edge> liste_arretes;
    private int nb_noeuds;
/*   private String liste_arretes ='\0';
    Hashmap liste_adjacences = {};*/


    public Graphe(){
        this.liste_noeuds = new ArrayList();
        this.liste_arretes = new ArrayList();
        this.nb_noeuds = 0;
/*       this.liste_arretes = '\0';
        this.liste_adjacences = {};*/


    }

    /* On rajoute le noeud à la fin de la liste */
    public void ajoute_noeud(Noeud n){
        this.liste_noeuds.add(n);
        nb_noeuds++;


    }

    public String toString(){
        StringBuilder res = new StringBuilder("[");
        for(int i = 0; i < this.liste_noeuds.size() ; i ++){
            res.append("\"");
            res.append(this.liste_noeuds.get(i).toString());
            res.append("\"");


            /* On n'ajoute pas de virgule au dernier élément */
            if (i < this.liste_noeuds.size() - 1) res.append(",");
        }
        res.append("]");
        return res.toString();

    }

/*   public void supprimer_noeud(Noeud n){
        
        if(!noeud_existe(n)){
            System.err.println("Erreur : le noeud n'existe pas.")
            exit(ERR_NOEUD_INEXISTANT);
        }
        Edge arrete_temp;
        for(int i = 0 ; i < n.getDegre() ; i++){

            if(arrete_temp = trouverArrete(n)){
                arrete_temp.supprimerArrete()
                this.liste_arretes.get(i).delete;
            }
            
            
        }

    }*/
}