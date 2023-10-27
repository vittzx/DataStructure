package ArvoreBinaria;
/*
 * Se for -1, significa que o valor eh menor do que o comparado
 * Se for 0 , significa que os valores sao iguais.
 * Se for 1, significa que o valor eh maior doq comparado.
 */
public class ArvoreBinaria<T extends Comparable<T>> {
    // atributos
    private No<T> raiz;

    // getters 
    public No<T> getRaiz() {
        return raiz;
    }


    // setters
    public void setRaiz(No<T> raiz) {
        this.raiz = raiz;
    }


    // metodos.
    public void adicionar(T conteudo){
        No<T> novoElemento = new No<T>(conteudo);
        if(raiz == null){ // raiz nao existe
            raiz = novoElemento;
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
                        atual = atual.getEsquerda();
                    }else{
                        atual.setDireita(novoElemento);
                        break;
                    }
                }
            }

        }

    }


    // Construtor.
    public ArvoreBinaria(){
        this.raiz = null;
    }
}
