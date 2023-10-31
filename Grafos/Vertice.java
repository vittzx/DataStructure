package Grafos;

import java.util.ArrayList;

public class Vertice<T>{
    private T conteudo;
    private ArrayList<Aresta<T>> arestasEntrada;
    private ArrayList<Aresta<T>> arestasSaida;

    public Vertice(T conteudo){
        this.conteudo = conteudo;
        this.arestasEntrada = new ArrayList<Aresta<T>>();
        this.arestasSaida = new ArrayList<Aresta<T>>();

    }

    public T getConteudo(){
        return this.conteudo;
    }

    public void setConteudo(T conteudo){
        this.conteudo = conteudo;
    }


    public void adicionarArestaEntrada(Aresta<T> aresta){
        this.arestasEntrada.add(aresta);

    }

    public void adicinarArestaSaindo(Aresta<T> aresta){
        this.arestasSaida.add(aresta);                                                                   
        
    }


}
