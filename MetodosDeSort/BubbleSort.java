package MetodosDeSort;

import java.util.Arrays;

/*
 * Bubble sort 
 * Time complexity: O(n2)
 * faz uma varredura linear de n * n-1 para deixar em ordem 
 * compara o vetor na posicao i com a da posicao i +1 (j). 
 * [1,4,5,2,3]
 * compara o 1 com todos da lista, e garante que o 1 é o menor. 
 * entao i+1 
 * 
 * [1,4,5,2,3]
 * compara o quatro com todos da lista
 * e garante que o 2 é o menor da lista i == 1 
 * entao i + 1
 * 
 * [1,2,5,4,3]
 * compara o 5 com todos da lista 
 * e garate que o 3 é o menor da lista i == 2
 * 
 * [1,2,3,5,4]
 * compara o 5 com o 4 
 * e garante que o 4 é o menor da lista i == 3
 * entao 
 * [1,2,3,4,5] 
 * 
 * 
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] vetor = new int[15];
        for(int i =0; i < vetor.length;i++){
            vetor[i] = (int) (Math.random() * 10);
            
        }
        System.out.println(Arrays.toString(vetor));

        for(int i=0; i < vetor.length -1; i++){
            for(int j= i+1; j<vetor.length;j++){
                if(vetor[j] < vetor[i]){
                    int temp = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(vetor));
    }
}
