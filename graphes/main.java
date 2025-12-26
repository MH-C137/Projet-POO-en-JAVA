package graphes;


public class main {



    public static void main(String[] args) {
            
            System.out.println("Hola waldo\n");
            Graphe graphe = new Graphe();


            Object label1 = new String("Pop");
            Object label2 = new String("Hello World");
            Object label3 = new String("\n*\n**\n***\n****");
            Object label4 = 193;
            Object label5 = 9.839;

            Noeud noeud1 = new Noeud(label1);
            Noeud noeud2 = new Noeud(label2);
            Noeud noeud3 = new Noeud(label3);
            Noeud noeud4 = new Noeud(label4);
            Noeud noeud5 = new Noeud(label5);



            Edge arrete1 = new Edge(noeud1 , noeud2);
            Edge arrete2 = new Edge(noeud4 , noeud3);
            Edge arreteBug = new Edge(noeud1, noeud1);
            Edge arreteDupli = new Edge(noeud1, noeud2);


            graphe.ajoute_noeud(noeud1);
            graphe.ajoute_noeud(noeud2);
            graphe.ajoute_noeud(noeud3);
            graphe.ajoute_noeud(noeud4);
            graphe.ajoute_noeud(noeud5);

            graphe.ajoute_Edge(arrete1);
            graphe.ajoute_Edge(arrete2);
            graphe.ajoute_Edge(arreteBug);
            graphe.ajoute_Edge(arreteDupli);


            System.out.println(graphe);

            System.out.println((arrete1 = arrete2 )+ arrete1.toString() + arrete2.toString());

    }


}




