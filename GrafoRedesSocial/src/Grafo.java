import java.util.ArrayList;

public class Grafo <TIPO> {

    private ArrayList<Vertice<TIPO>> vertice;
    private ArrayList<Aresta<TIPO>> Aresta;

    public Grafo() {
        this.vertice = new ArrayList<Vertice<TIPO>>();
        this.Aresta = new ArrayList<Aresta<TIPO>>();

    }

    public void adicionarVertice(TIPO dado) {
        Vertice<TIPO> novoVertice = new Vertice<TIPO>(dado);
        this.vertice.add(novoVertice);

    }

    public void adicionarAresta(double peso, TIPO dadoinicio, TIPO dadofim) {
             Vertice<TIPO>inicio = this.getVeticer(dadoinicio);
          Vertice<TIPO>fim = this.getVeticer(dadofim);
          Aresta<TIPO>aresta=  new Aresta<TIPO>(peso,inicio,fim);
          inicio.adicionarArestaSaida(aresta);
          fim.adicionarArestaEntrada(aresta);
         this.Aresta.add(aresta);
    }

    public Vertice<TIPO> getVeticer(TIPO dado) {
        Vertice<TIPO> vertice = null;
        for (int i = 0; i < this.vertice.size(); i++) {
            if(this.vertice.get(i).getDado().equals(dado)){
                vertice = this.vertice.get(i);
                break;
            }

        }
        return  vertice;
    }
}
