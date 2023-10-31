package Grafos;

import java.util.ArrayList;

public class Grafo<T> {
    private ArrayList<Vertice<T>> vertices;
    private ArrayList<Aresta<T>> aresta;

    public Grafo(){
        this.vertices = new ArrayList<Vertice<T>>();
        this.aresta = new ArrayList<Aresta<T>>();
    }

    public void adicionarVertice(T conteudo){
        Vertice<T> novoVertice = new Vertice<T>(conteudo);
        this.vertices.add(novoVertice);
    }

    public void adicionarAresta(Integer peso, T conteudoInicio, T conteudoFim){
        Vertice<T> inicio = this.getVertice(conteudoInicio);
        Vertice<T> fim = this.getVertice(conteudoFim);
        Aresta<T> aresta = new Aresta<T>(peso, inicio, fim);
        this.aresta.add(aresta);
        inicio.adicinarArestaSaindo(aresta);
        fim.adicionarArestaEntrada(aresta);


    }

    public Vertice<T> getVertice(T dado){
        Vertice<T> vertice = null;
        for(int i =0; i < this.vertices.size(); i++){
            if(this.vertices.get(i).getConteudo().equals(dado)){
                vertice = this.vertices.get(i);
                return vertice;
            }
        }
        return null;
    }
}
