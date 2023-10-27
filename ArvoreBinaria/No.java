package ArvoreBinaria;

public class No<T> {
    private T conteudo;
    private No<T> esquerda;
    private No<T> direita;


    // getters 
        
    public T getConteudo(){
        return this.conteudo;
    }
    
    public No<T> getEsquerda() {
        return esquerda;
    }
    
    public No<T> getDireita() {
        return direita;
    }
        

    
    // setters
    public void setConteudo(T novoElemento){
        this.conteudo = novoElemento;
    }

    public void setEsquerda(No<T> esquerda) {
        this.esquerda = esquerda;
    }
    
    public void setDireita(No<T> direita) {
        this.direita = direita;
    }
    

    // Construtores.
    public No(T conteudo){
        this.conteudo = conteudo;
        this.esquerda = null;
        this.direita = null;       
    }

}
