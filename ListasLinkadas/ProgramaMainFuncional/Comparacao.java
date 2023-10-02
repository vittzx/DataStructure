package ListasLinkadas.ProgramaMainFuncional;

import java.util.ArrayList;

import ListasLinkadas.ListaLinkada.IteratorListaLigada;
import ListasLinkadas.ListaLinkada.ListaLigada;

public class Comparacao {
    public static void main(String[] args) {
        
        ListaLigada<Integer> listaLigada = new ListaLigada<Integer>();
        
        ArrayList<Integer> vetor = new ArrayList<Integer>();

        // adicionando elementos;

        int limite = 10000000;
        long tempoInicial = System.currentTimeMillis();
        long tempoFinal;
        for(int i =0; i< limite; i++){
            vetor.add(i);
        }
        tempoFinal = System.currentTimeMillis();

        System.out.println("Adicionou " + limite + " numreos no vetor");
        System.out.println("Tempo em ms  segundo " + (tempoFinal - tempoInicial));


        tempoInicial = System.currentTimeMillis();
        for(int i =0; i< limite; i++){
            listaLigada.adicionar(i);
        }
        tempoFinal = System.currentTimeMillis();

        System.out.println("Adicionou " + limite + " numreos na lista ligada");
        System.out.println("Tempo em ms segundo " + (tempoFinal - tempoInicial));

        // ler valores 
        tempoInicial = System.currentTimeMillis();
        for(int i =0; i<vetor.size(); i++){
            // so pegando os valores para comparar o tempo.
            vetor.get(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("\n\nTempo de leitura do vetor " );
        System.out.println(tempoFinal - tempoInicial);

        tempoInicial = System.currentTimeMillis();
        IteratorListaLigada<Integer> iterator  = listaLigada.getIterator();   
        while(iterator.temProximo()){
            iterator.proximoElemento();
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("\n\nTempo de leitura na lista  " );
        System.out.println(tempoFinal - tempoInicial);


    }
}
