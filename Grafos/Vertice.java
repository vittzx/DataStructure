package Grafos;

import java.util.ArrayList;

public class Vertice<T>{

    // atributos de classe 
    private T conteudo;
    private ArrayList<Aresta<T>> arestasEntrada;
    private ArrayList<Aresta<T>> arestasSaida;

    // construtor 
    public Vertice(T conteudo){
        this.conteudo = conteudo;
        this.arestasEntrada = new ArrayList<Aresta<T>>();
        this.arestasSaida = new ArrayList<Aresta<T>>();

    }


    // getters e setters 
    public T getConteudo(){
        return this.conteudo;
    }

    public void setConteudo(T conteudo){
        this.conteudo = conteudo;
    }

    public ArrayList<Aresta<T>> getArestasEntrada() {
        return arestasEntrada;
    }

    public void setArestasEntrada(ArrayList<Aresta<T>> arestasEntrada) {
        this.arestasEntrada = arestasEntrada;
    }

    
    public ArrayList<Aresta<T>> getArestasSaida() {
        return arestasSaida;
    }

    public void setArestasSaida(ArrayList<Aresta<T>> arestasSaida) {
        this.arestasSaida = arestasSaida;
    }



    public void adicionarArestaEntrada(Aresta<T> aresta){
        this.arestasEntrada.add(aresta);

    }

    public void adicinarArestaSaindo(Aresta<T> aresta){
        this.arestasSaida.add(aresta);                                                                   
        
    }
}
