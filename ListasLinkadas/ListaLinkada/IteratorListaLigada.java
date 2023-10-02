package ListasLinkadas.ListaLinkada;

public class IteratorListaLigada<TYPE> {
    private Elemento<TYPE> elemento;


    public IteratorListaLigada(Elemento<TYPE> atual ){
        this.elemento = atual;
    }

    public boolean temProximo(){
        if(elemento.getProximoElemento() == null){
            return false;
        }
        return true;
    }

    public Elemento<TYPE> proximoElemento(){
        elemento = elemento.getProximoElemento();
        return elemento;
    }
    
}
