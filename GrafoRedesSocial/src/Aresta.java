public class Aresta <TIPO>{

    private double peso;
    private Vertice<TIPO> incio;
    private Vertice<TIPO> Fim;

    public Aresta(double peso, Vertice<TIPO> incio, Vertice<TIPO> fim) {
        this.peso = peso;
        this.incio = incio;
        Fim = fim;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Vertice<TIPO> getIncio() {
        return incio;
    }

    public void setIncio(Vertice<TIPO> incio) {
        this.incio = incio;
    }

    public Vertice<TIPO> getFim() {
        return Fim;
    }

    public void setFim(Vertice<TIPO> fim) {
        Fim = fim;
    }
}
