package ListasLinkadas.Pilha;

import ListasLinkadas.ListaLinkada.ListaLigada;

public class Pilha2<T> extends ListaLigada<T> {

    public Pilha2(){
        super(); 
    }


    public void remover(){
        getPrimeiro().getProximoElemento().setElementoAnterior(null);
        setPrimeiro(getPrimeiro().getProximoElemento());;
    }

    public T get(){
        return getPrimeiro().getConteudo();
    }
    
}
