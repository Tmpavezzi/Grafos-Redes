package org.example;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private int id;
    private List<Amizade> amizades;

    public Pessoa(int id) {
        this.id = id;
        this.amizades = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public List<Amizade> getAmizades() {
        return amizades;
    }

    public void adicionarAmizade(Amizade amizade) {
        this.amizades.add(amizade);
    }
}
