package ListasLinkadas.Pilha;

import ListasLinkadas.ListaLinkada.ListaLigada;

public class Pilha<T> {
    ListaLigada<T> lista;

    public Pilha(){
        this.lista = new ListaLigada<T>();
    }

    public void adicionar(T novoValor){
        this.lista.adicionarComeco(novoValor);
    }

    public void remover(){
        this.lista.remover(get());
    }

    public T get(){
        return this.lista.getPrimeiro().getConteudo();
    }
}
