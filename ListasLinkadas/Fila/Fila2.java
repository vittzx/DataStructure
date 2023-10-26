package ListasLinkadas.Fila;

import ListasLinkadas.ListaLinkada.Elemento;
import ListasLinkadas.ListaLinkada.ListaLigada;

public class Fila2<T> extends ListaLigada<T>{
    
    public Fila2(){
        
    }

    
    public void remover(){
        Elemento<T> segundo = getPrimeiro().getProximoElemento();
        getPrimeiro().setProximoElemento(null);
        setPrimeiro(segundo);
    }


}
