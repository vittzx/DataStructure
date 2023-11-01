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

    public void buscaEmLargura(){
        ArrayList<Vertice<T>> marcados = new ArrayList<Vertice<T>>();
        ArrayList<Vertice<T>> fila = new ArrayList<Vertice<T>>();
        Vertice<T> atual = this.vertices.get(0);
        marcados.add(atual);
        System.out.println(atual.getConteudo());
        fila.add(atual);
        while(fila.size() > 0){
            Vertice<T> visitado  = fila.get(0);
            for(int i =0;  i < visitado.getArestasSaida().size();i++){
                Vertice<T> proximo = visitado.getArestasSaida().get(i).getFim(); // pega a aresta e pega o ponto final da aresta.
                if(!marcados.contains(proximo)){ // se o vertice nao contem em marcados
                    marcados.add(proximo);
                    System.out.println(proximo.getConteudo());
                    fila.add(proximo);
                }
            }
            fila.remove(0);
        }
        


    }
}
