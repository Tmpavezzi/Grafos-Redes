package org.example;
import java.util.ArrayList;
import java.util.List;

public class RedeSocial {
    private List<Pessoa> pessoas;
    private List<Amizade> amizades;

    public RedeSocial() {
        this.pessoas = new ArrayList<>();
        this.amizades = new ArrayList<>();
    }

    public void adicionarPessoa(Pessoa pessoa) {
        this.pessoas.add(pessoa);
    }

    public void adicionarAmizade(Amizade amizade) {
        Pessoa pessoa1 = amizade.getPessoa1();
        Pessoa pessoa2 = amizade.getPessoa2();

        pessoa1.adicionarAmizade(amizade);
        pessoa2.adicionarAmizade(amizade);

        this.amizades.add(amizade);
    }

    public List<Amizade> getAmizades() {
        return amizades;
    }
}
