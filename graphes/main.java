package graphes;


public class main {



    public static void main(String[] args) {
            
            System.out.println("Hola waldo\n");
            Graphe graphe = new Graphe();


            Object label_1 = new String("Pop");
            Object label_2 = new String("Hello World");
            Object label_3 = new String("\n*\n**\n***\n****");
            Object label_4 = 193;
            Object label_5 = 9.839;

            Noeud noeud_1 = new Noeud(label_1);
            Noeud noeud_2 = new Noeud(label_2);
            Noeud noeud_3 = new Noeud(label_3);
            Noeud noeud_4 = new Noeud(label_4);
            Noeud noeud_5 = new Noeud(label_5);

            graphe.ajoute_noeud(noeud_1);
            graphe.ajoute_noeud(noeud_2);
            graphe.ajoute_noeud(noeud_3);
            graphe.ajoute_noeud(noeud_4);
            graphe.ajoute_noeud(noeud_5);

            System.out.println(graphe);

    }


}




