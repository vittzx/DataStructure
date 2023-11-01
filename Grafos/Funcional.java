package Grafos;

public class Funcional {
    public static void main(String[] args) {
        
        Grafo<String> grafo = new Grafo<String>();
        grafo.adicionarVertice("Cráudio");
        grafo.adicionarVertice("João");
        grafo.adicionarVertice("Lorenzo");
        grafo.adicionarVertice("Creuza");
        grafo.adicionarVertice("Créber");

        
        grafo.adicionarAresta(2, "João", "Lorenzo");
        grafo.adicionarAresta(3, "Lorenzo", "Créber");
        grafo.adicionarAresta(1, "Créber", "Creuza");
        grafo.adicionarAresta(1, "João", "Creuza");
        grafo.adicionarAresta(3, "Cráudio", "João");
        grafo.adicionarAresta(2, "Cráudio", "Lorenzo");
        
        
        grafo.buscaEmLargura();
    }
}
