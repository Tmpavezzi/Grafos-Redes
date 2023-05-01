package org.example;

public class Main {
    public static void main(String[] args) {
        RedeSocial grafo = new RedeSocial();

        Pessoa alice = new Pessoa(1);
        Pessoa bob = new Pessoa(2);
        Pessoa carol = new Pessoa(3);
        Pessoa david = new Pessoa(4);
        Pessoa eve = new Pessoa(5);

        Amizade amizade1 = new Amizade(alice, bob);
        Amizade amizade2 = new Amizade(bob, carol);
        Amizade amizade3 = new Amizade(carol, david);
        Amizade amizade4 = new Amizade(alice, eve);

        grafo.adicionarPessoa(alice);
        grafo.adicionarPessoa(bob);
        grafo.adicionarPessoa(carol);
        grafo.adicionarPessoa(david);
        grafo.adicionarPessoa(eve);

        grafo.adicionarAmizade(amizade1);
        grafo.adicionarAmizade(amizade2);
        grafo.adicionarAmizade(amizade3);
        grafo.adicionarAmizade(amizade4);

        System.out.println("Amizades registradas no grafo:");
        for (Amizade amizade : grafo.getAmizades()) {
            Pessoa pessoa1 = amizade.getPessoa1();
            Pessoa pessoa2 = amizade.getPessoa2();
            System.out.println(pessoa1.getId() + " é amigo de " + pessoa2.getId());
        }

        // Teste adicional: adicionar nova amizade entre pessoas já existentes
        Amizade amizade5 = new Amizade(david, eve);
        grafo.adicionarAmizade(amizade5);

        System.out.println("\nNova amizade registrada no grafo:");
        for (Amizade amizade : grafo.getAmizades()) {
            Pessoa pessoa1 = amizade.getPessoa1();
            Pessoa pessoa2 = amizade.getPessoa2();
            System.out.println(pessoa1.getId() + " é amigo de " + pessoa2.getId());
        }
    }
}