package ListasLinkadas.ListaLinkada;

public class Elemento<TYPE>{
    private TYPE conteudo;
    private Elemento<TYPE> proximo;


    public Elemento(TYPE novoConteudo) {
        this.conteudo = novoConteudo;
        
    }

    public TYPE getConteudo(){
        return this.conteudo;
    }

    public Elemento<TYPE> getProximoElemento(){
        return this.proximo;
    }

    public void setConteudo(TYPE novoConteudo){
        this.conteudo = novoConteudo;
    }

    public void setProximoElemento(Elemento<TYPE> novoProximo){
        // OBS: ESSE TEXTO AQUI EH SOMENTE A MINHA LINHA DE RACIOCINIO
        /*
         * Por exemplo:
         *  Caso tenhamos uma lista com 4 elemento, A B C D 
         *  Se o elemento atual é o A, ele vai setar o proximo como o elemento B.
         *  Que ai o elemento B, vai ser tornar o ultimo que antes de repassar o ultimo vai setar o proximo como o elemento C.
         *  E assim vai indo. E eh aqui que guarda o elemento. 
         * 
         */
        this.proximo = novoProximo;
    }

    public String toString(){
        return (String) this.conteudo;
    }
}