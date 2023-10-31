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


 /*
    OBS: METODO REMOVER E REMOVER2 POSSUEM ALGUNS BUGS, SERA CORRIGIDO NO FUTURO.
    MAIS CONFIAVEL PARA UTILIZAR EH O REMOVER2.
    31/10/2023

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

    public boolean remover (T valor){
        // buscando elemento na arvore 
        No<T> atual = this.raiz;
        No<T> paiAtual = null;
        while(atual != null){
            if(atual.getConteudo().equals(valor)){
                // valor encontrado. removendo elemento na arvore
                break;
            
            }else if((valor.compareTo(atual.getConteudo())) == -1 ){// atual é menor que o elemento procurado
                paiAtual = atual;
                atual = atual.getEsquerda();
            }else{ // se o atual é maior que o atual 
                paiAtual = atual;
                atual = atual.getDireita();
            }
        }

        if(atual!= null){
            // elemento tem 2 filhos ou tem somenet filho a direita
            if(atual.getDireita() != null){

                No<T> substituto = atual.getDireita();
                No<T> paiSubstituto = atual;
                while(substituto.getEsquerda() != null){
                    paiSubstituto = substituto;
                    substituto = substituto.getEsquerda();
                }
                substituto.setEsquerda(atual.getEsquerda());
                if(paiAtual != null){ // se nao for a raiz.
                    // remove o elemento da arvore
                    if(atual.getConteudo().compareTo(paiAtual.getConteudo()) == -1){ // substituto eh menor ao paiSubstituto
                        paiAtual.setEsquerda(substituto);
                    }else{
                        paiAtual.setDireita(substituto); 
                    }   
                }else{ // se nao tem paiAtual, e se for a raiz 
                    this.raiz = substituto;
                    paiSubstituto.setEsquerda(null);
                    this.raiz.setDireita(paiSubstituto);
                    this.raiz.setEsquerda(atual.getEsquerda());
                }

                //removeu o elemento da árvore
                if (substituto.getConteudo().compareTo(paiSubstituto.getConteudo()) == -1){ //substituto < paiSubstituto
                    paiSubstituto.setEsquerda(null);
                }else{
                    paiSubstituto.setDireita(null);
                }

            }else if(atual.getEsquerda() != null){ // tem filho so a esquerda
                No<T> substituto = atual.getEsquerda();
                No<T> paiSubstituto = atual;
                while(substituto.getDireita() != null){
                    paiSubstituto = substituto;
                    substituto = substituto.getDireita();
                }
                substituto.setDireita(atual.getDireita());
                if(paiAtual != null){// se nao for a raiz
                    // coloca o elemento na arvore no lugar certo
                    if(atual.getConteudo().compareTo(paiAtual.getConteudo()) == -1){ // substituto eh menor ao paiSubstituto
                        paiAtual.setEsquerda(substituto);
                    }else{
                        paiAtual.setDireita(substituto); 
                    }
                }else{
                    this.raiz = substituto;
                }

                        //removeu o elemento da árvore
                if (substituto.getConteudo().compareTo(paiSubstituto.getConteudo()) == -1){ //substituto < paiSubstituto
                    paiSubstituto.setEsquerda(null);
                }else{
                    paiSubstituto.setDireita(null);
                }
                
            }else{ // nao tem filho
                if(paiAtual != null){ // se for a raiz 
                    if(atual.getConteudo().compareTo(paiAtual.getConteudo()) == -1){ // atual eh menor ao pai
                        paiAtual.setEsquerda(null);
                    }else{
                        paiAtual.setDireita(null); 
                    }
                }else{ // se for a raiz E e nao tiver filhos
                    this.raiz = null;
                    
                }
                
            }

             
            return true;
        }else{
            return false;
        }        
    }

    public boolean remover2(T valor){
        //buscar o elemento na árvore
        No<T> atual = this.raiz;
        No<T> paiAtual = null;
        while(atual != null){
            if (atual.getConteudo().equals(valor)){
                break;                
            }else if (valor.compareTo(atual.getConteudo()) == -1){ //valor procurado é menor que o atual 
                paiAtual = atual;
                atual = atual.getEsquerda();
            }else{
                paiAtual = atual;
                atual = atual.getDireita();
            }
        }
        //verifica se existe o elemento
        if (atual != null){
            
            //elemento tem 2 filhos ou elemento tem somente filho à direita
            if (atual.getDireita() != null){
                
                No<T> substituto = atual.getDireita();
                No<T> paiSubstituto = atual;
                while(substituto.getEsquerda() != null){
                    paiSubstituto = substituto;
                    substituto = substituto.getEsquerda();
                }
                substituto.setEsquerda(atual.getEsquerda());
                if (paiAtual != null){
                    if (atual.getConteudo().compareTo(paiAtual.getConteudo()) == -1){ //atual < paiAtual
                        paiAtual.setEsquerda(substituto);
                    }else{
                        paiAtual.setDireita(substituto);
                    }
                }else{ //se não tem paiAtual, então é a raiz
                    this.raiz = substituto;
                    paiSubstituto.setEsquerda(null);
                    this.raiz.setDireita(paiSubstituto);
                    this.raiz.setEsquerda(atual.getEsquerda());
                }
                
                //removeu o elemento da árvore
                if (substituto.getConteudo().compareTo(paiSubstituto.getConteudo()) == -1){ //substituto < paiSubstituto
                    paiSubstituto.setEsquerda(null);
                }else{
                    paiSubstituto.setDireita(null);
                }
                
            }else if (atual.getEsquerda() != null){ //tem filho só à esquerda
                No<T> substituto = atual.getEsquerda();
                No<T> paiSubstituto = atual;
                while(substituto.getDireita() != null){
                    paiSubstituto = substituto;
                    substituto = substituto.getDireita();
                }
                substituto.setDireita(atual.getDireita());
                if (paiAtual != null){
                    if (atual.getConteudo().compareTo(paiAtual.getConteudo()) == -1){ //atual < paiAtual
                        paiAtual.setEsquerda(substituto);
                    }else{
                        paiAtual.setDireita(substituto);
                    }
                }else{ //se for a raiz
                    this.raiz = substituto;
                }
                
                //removeu o elemento da árvore
                if (substituto.getConteudo().compareTo(paiSubstituto.getConteudo()) == -1){ //substituto < paiSubstituto
                    paiSubstituto.setEsquerda(null);
                }else{
                    paiSubstituto.setDireita(null);
                }
            }else{ //não tem filho
                if (paiAtual != null){
                    if (atual.getConteudo().compareTo(paiAtual.getConteudo()) == -1){ //atual < paiAtual
                        paiAtual.setEsquerda(null);
                    }else{
                        paiAtual.setDireita(null);
                    }
                }else{ //é a raiz
                    this.raiz = null;
                }
            }
            
            return true;
        }else{
            return false;
        }        
    }
}

