package ListasLinkadas.Fila;

import ListasLinkadas.ListaLinkada.ListaLigada;

// Fila é tipo abstrato de Dados
// Por que nao se encaixa em Estrutura de Dados? Pois nao Ha nada de novo nela
// Podemos fazer uma fila com uma lista ligada ou com vetor.

public class Fila<T>{
    // Atributos
    private ListaLigada<T> listaLigada = new ListaLigada<T>();
     


    // Getter e Setter
    public ListaLigada<T> getListaLigada() {
        return listaLigada;
    }

    public void setListaLigada(ListaLigada<T> listaLigada) {
        this.listaLigada = listaLigada;
    }


    // Metodos 
    public void adicionar(T conteudo){
        getListaLigada().adicionar(conteudo);
    }

    public void remover(){
        getListaLigada().remover(getPrimeiro());
    }

    public T getPrimeiro(){
        return getListaLigada().getPrimeiro().getConteudo();
    }
    
    
}
