package MetodosDeSort;

import java.util.Arrays;
/*
 * Objetivo que seus filhos sempre sejam menores ou iguais a ele 
 * 
 * 
 */
public class HeapSort {
    public static void main(String[] args) {
        // criando o vetor e ordenando ele 
        int[] vetor  = new int[8];
        for(int i =0; i < vetor.length ; i++){
            vetor[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(vetor));

        // heap sort 
        // 2*i + 1 
        // 2+i + 2
        int n = vetor.length;
        for(int i = n/2 -1; i >=0; i--){
            aplicarHeap(vetor, n, i);
        }

        System.out.println("vetor quase ordenado");
        System.out.println(Arrays.toString(vetor));
        System.out.println();

        for(int i =n-1; i>=0 ;i--){
            int aux = vetor[0];
            vetor[0] = vetor[i];
            vetor[i] = aux;

            // Por que o zero?
            // pois toda vez que trocamos o zero com o ultimo, mudamos a ordem a arvore, entao tem que reordenar novamentoe.
            // porque o i de tamanho?
            // pois estamos "eliminando" um elemento colocando ele por ultimo
            aplicarHeap(vetor,i, 0); 
        }

        
        System.out.println("vetor  ordenado");
        System.out.println(Arrays.toString(vetor));

    }

    static void aplicarHeap(int[] vetor, int tamanho, int index){
        int raiz = index;
        int direita = 2 * index + 2;
        int esquerda = 2 * index + 1;

        if(direita < tamanho && vetor[direita] > vetor[raiz]){
            raiz = direita;
        }

        if(esquerda < tamanho && vetor[esquerda] > vetor[raiz]){
            raiz = esquerda;
        }

        if(raiz != index){
            int aux = vetor[raiz];
        // ou seja, a raiz muda pois o I eh diferente da raiz
        // e aqui ocorre a troca, o vetor na nova raiz, seja a antiga esquerda ou direita passa a ser a velha raiz, e a nova raiz passa a ser o index que era a antiga direita ou esquerda
        // o que importa que o valor novo, que esta no vetor[raiz] esta mudando pois aqui jogamos os maiores valores para a esquerda e depois reodernamos ele.
        // essa raiz passa a ser o novo indice para u, novo heap
            vetor[raiz] = vetor[index];
            vetor[index] = aux;
            aplicarHeap(vetor, tamanho, raiz);

        }
    }
}
