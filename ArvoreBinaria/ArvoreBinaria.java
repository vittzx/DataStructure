package ArvoreBinaria;
/*
 * Se for -1, significa que o valor eh menor do que o comparado
 * Se for 0 , significa que os valores sao iguais.
 * Se for 1, significa que o valor eh maior doq comparado.
 */
/*
 * Em ordem: Esquerda cima direita.
 * Pre ordem: Cima esquerda direita.
 * Pos Ordem: esquerda direita cima
 */
public class ArvoreBinaria<T extends Comparable<T>> {
    // atributos
    private No<T> raiz;

    // getters 
    public No<T> getRaiz() {
        return this.raiz;
    }


    // setters
    public void setRaiz(No<T> raiz) {
        this.raiz = raiz;
    }


    // metodos.
    public void adicionar(T conteudo){
        No<T> novoElemento = new No<T>(conteudo);
        if(this.raiz == null){ // raiz nao existe
            this.raiz = novoElemento;
        }
        else{
            No<T> atual = this.raiz;
            // if(novoElemento.getConteudo < atual.getConteudo()) e atual === raiz.
            while(true){
                if(novoElemento.getConteudo().compareTo(atual.getConteudo()) == -1 ){
                    if(atual.getEsquerda() != null){
                        atual = atual.getEsquerda();
                    }else{
                        atual.setEsquerda(novoElemento);
                        break;
                    }
                }else{
                    if(atual.getDireita() != null){
                        atual = atual.getDireita();
                    }else{
                        atual.setDireita(novoElemento);
                        break;
                    }
                }
            }

        }

    }

    // metodos de ordenacao 

    public void emOrdem(No<T> atual){
        if(atual != null){
            emOrdem(atual.getEsquerda()); // vai ficar entrando na funcao ate dar nulo
            System.out.println(atual.getConteudo()); // quando der nulo imprime o valor
            emOrdem(atual.getDireita()); // ai ele pega o da direita e faz a mesma verificacao tudo denovo
        }
    }
    public void preOrdem(No<T> atual){
        if(atual != null){
            System.out.println(atual.getConteudo()); // entra e imprime o valor
            emOrdem(atual.getEsquerda());
            emOrdem(atual.getDireita()); 
        }
    }
    public void posOrdem(No<T> atual){
        if(atual != null){
            emOrdem(atual.getEsquerda()); 
            emOrdem(atual.getDireita()); 
            System.out.println(atual.getConteudo()); // depois de tudo imprime o valor.
        }
    }


    // Construtor.
    public ArvoreBinaria(){
        this.raiz = null;
    }
}
