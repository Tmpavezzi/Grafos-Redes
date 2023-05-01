public class Main {
    public static void main(String[] args) {

   Grafo<String>grafo= new Grafo<String>();
   grafo.adicionarVertice("Joao");
   grafo.adicionarVertice("Guilherme ");
   grafo.adicionarVertice("creuza");
   grafo.adicionarVertice("Claudio");

//fazer as ligações
   grafo.adicionarAresta(2,"João","Guilherme");
   grafo.adicionarAresta(2.1,"Creuza","Claudio");



    }
}