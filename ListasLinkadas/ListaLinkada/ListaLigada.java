package ListasLinkadas.ListaLinkada;

/*
 * Elemento == no
 * 
 */

public class ListaLigada<TYPE> {
// Atributos
    private int tamanho;
    private Elemento<TYPE> primeiro;
    private Elemento<TYPE> ultimo;
// construtor 

public ListaLigada(){
    this.tamanho = 0;   
}

// getters e Setters 
    public int getTamanho() {
        return tamanho;
    }
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    
    public Elemento<TYPE> getPrimeiro() {
        return this.primeiro;
    }
    public void setPrimeiro(Elemento<TYPE> primeiro) {
        this.primeiro = primeiro;
    }

    public Elemento<TYPE> getUltimo() {
        return ultimo;
    }
    public void setUltimo(Elemento<TYPE> ultimo) {
        this.ultimo = ultimo;
    }



// metodos 


    /**
     * @param novoConteudo
     * Adiciona um novo conteudo 
     */
    public void adicionar(TYPE novoConteudo){
        Elemento<TYPE> elemento = new Elemento<TYPE>(novoConteudo);
        if(this.primeiro == null && this.ultimo == null){
            this.primeiro = elemento;
            this.ultimo = elemento;
        }
        else{
            elemento.setElementoAnterior(this.ultimo);
            this.ultimo.setProximoElemento(elemento);
            this.ultimo = elemento;  
        }
        
        this.tamanho++;

    }


    public void remover(TYPE conteudo){
        Elemento<TYPE> atual = this.primeiro;
        Elemento<TYPE> anterior = null;

        for(int i =0; i < getTamanho(); i++){
            if(atual.getConteudo().equals(conteudo)){
                if( 1 == this.tamanho){
                    this.primeiro = null;
                    this.ultimo = null;
                }
                else if(atual == this.primeiro){
                    this.primeiro = atual.getProximoElemento();
                    atual.setProximoElemento(null);
                    atual.setElementoAnterior(null);
                }else if(atual == this.ultimo){
                    this.ultimo = anterior;
                    anterior.setProximoElemento(null);
                }else{
                    anterior.setProximoElemento(atual.getProximoElemento());
                    atual = null;
                }
                tamanho--;
                break;
            }   
            anterior = atual;
            atual = atual.getProximoElemento();
        }
    }

    public Elemento<TYPE> getElementoByPosicao(int posicao){
        Elemento<TYPE> atual = this.primeiro;
        for(int i =0 ; i< posicao; i++){
            if(atual.getProximoElemento() != null){
                atual = atual.getProximoElemento();
            }
        }
        return atual;
    }


    public void verLista(){
        Elemento<TYPE> atual = this.primeiro;
        for(int i=0; i< this.tamanho; i++){
            if(atual.getProximoElemento() != null || i == this.tamanho-1){
                System.out.println(atual.getConteudo());
                atual = atual.getProximoElemento();
            }else{
                break;
            }
        }
    }

    public IteratorListaLigada<TYPE> getIterator(){
        return new IteratorListaLigada<TYPE>(this.primeiro);
    }

}
