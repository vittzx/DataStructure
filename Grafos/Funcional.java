package Grafos;

public class Funcional {
    public static void main(String[] args) {
        
        Grafo<String> grafo = new Grafo<>();
        grafo.adicionarVertice("ze");
        grafo.adicionarVertice("Vitor");
        grafo.adicionarVertice("roberto");
        grafo.adicionarVertice("cleber");
        grafo.adicionarVertice("niuza");


        grafo.adicionarAresta(2, "ze", "Vitor");
        grafo.adicionarAresta(3, "roberto", "Vitor");
        grafo.adicionarAresta(4, "cleber", "niuza");
        grafo.adicionarAresta(1, "Vitor", "cleber");
        grafo.adicionarAresta(2, "Vitor", "ze");

    }
}
