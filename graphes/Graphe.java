package graphes;
import java.util.ArrayList;



public class Graphe{
    
    public static int ERR_NOEUD_INEXISTANT = -10;

    private ArrayList<Noeud> listeNoeuds;
    private ArrayList<Edge> listeArretes;
    private int nbNoeuds;
    private int nbArretes;
/*   private String liste_arretes ='\0';
    Hashmap liste_adjacences = {};*/


    public Graphe(){
        this.listeNoeuds = new ArrayList();
        this.listeArretes = new ArrayList();
        this.nbNoeuds = 0;
/*       this.liste_arretes = '\0';
        this.liste_adjacences = {};*/


    }

    /* On rajoute le noeud à la fin de la liste */
    public void ajoute_noeud(Noeud n){
        this.listeNoeuds.add(n);
        this.nbNoeuds++;


    }

    public void ajoute_Edge(Edge e){
        this.listeArretes.add(e);
        this.nbArretes++;
    }

    public String toString(){
        StringBuilder strNoeud = new StringBuilder("Sommet : [");
        for(int i = 0; i < this.listeNoeuds.size() ; i ++){
            strNoeud.append("\"");
            strNoeud.append(this.listeNoeuds.get(i).toString());
            strNoeud.append("\"");


            /* On n'ajoute pas de virgule au dernier élément */
            if (i < this.listeNoeuds.size() - 1) strNoeud.append(",");
        }
        strNoeud.append("]\n");

        StringBuilder strArretes = new StringBuilder("Arretes : [");
            for(int i = 0; i < this.listeArretes.size() ; i ++){
                strArretes.append("\"");
                strArretes.append(this.listeArretes.get(i).toString());
                strArretes.append("\"");


                /* On n'ajoute pas de virgule au dernier élément */
                if (i < this.listeArretes.size() - 1) strArretes.append(",");
            }
        strArretes.append("]\n");
        return strNoeud.append(strArretes).toString();

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