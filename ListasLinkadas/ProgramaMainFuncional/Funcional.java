package ListasLinkadas.ProgramaMainFuncional;

import ListasLinkadas.ListaLinkada.ListaLigada;

public class Funcional {
    public static void main(String[] args) {
        ListaLigada<String> lista = new ListaLigada<String>();

        lista.adicionar("ACRE");
        lista.adicionar("BAHIA");
        lista.adicionar("DISTRITO FEDERAL");
        lista.adicionar("CEARA");
        lista.adicionar("RJ");
        // System.out.println("Tamanho da linked list: "+ lista.getTamanho());
        // System.out.println("Primeiro elemento: "+ lista.getPrimeiro().getConteudo());
        // System.out.println("Ultimo elemento: "+ lista.getUltimo().getConteudo());

        // System.out.println("O segundo elemento da linked list: " + lista.getElementoByPosicao(2));
        // System.out.println(lista.getElementoByPosicao(1));

        // lista.remover("ACRE");
        // lista.remover("BAHIA");
        // lista.remover("distrito federal");
        // lista.remover("ceara");
        // lista.remover("rj");
        // System.out.println("Tamanho da linked list: "+ lista.getTamanho());
        for(int i =0; i < lista.getTamanho() +1; i++){
            System.out.println(lista.getElementoByPosicao(i));
        }

        System.out.println("Proximo elemento do ultimo elemento: " + lista.getElementoByPosicao(lista.getTamanho()).getProximoElemento());
    }    
}
