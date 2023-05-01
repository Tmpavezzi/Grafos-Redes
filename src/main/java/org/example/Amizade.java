package org.example;

public class Amizade {
    private Pessoa pessoa1;
    private Pessoa pessoa2;

    public Amizade(Pessoa pessoa1, Pessoa pessoa2) {
        this.pessoa1 = pessoa1;
        this.pessoa2 = pessoa2;
    }

    public Pessoa getPessoa1() {
        return pessoa1;
    }

    public Pessoa getPessoa2() {
        return pessoa2;
    }
}
