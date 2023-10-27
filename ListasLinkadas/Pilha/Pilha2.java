package ListasLinkadas.Pilha;

/*
 * CODIGO COM LOGICA ERRADA, MAS FUNCIONANDO COMO FOSSE UMA PILHA:
 * 
 * MINHA LOGICA: PEGAR O ULTIMO ELEMENTO E DEFINI-LO COMO TOPO, E APENAS REMOVER O ULTIMO ELEMENTO.
 * 
 * O PRIMEIRO ELEMENTO EH O TOPO, OU SEJA, PARA COLOCAR NO TOPO O PRIMEIRO ELEMENTO MUDA PARA O SEGUNDO E O SEGUNDO MUDA PARA O TERCEIRO E ASSIM VAI.
 * 
 * LOGO O CODIGO CORRETO EH COLOCAR 
 * O PRIMEIRO ELEMENTO EH O TOPO, OU SEJA, PARA COLOCAR NO TOPO O PRIMEIRO ELEMENTO MUDA PARA O SEGUNDO E O SEGUNDO MUDA PARA O TERCEIRO E ASSIM VAI.
 * 
 */
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
