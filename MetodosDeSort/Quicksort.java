package MetodosDeSort;

import java.util.Arrays;

public class Quicksort {
    public static void main(String[] args) {
        int[] vetor = new int[10];

        for(int i =0; i < vetor.length ; i++){
            vetor[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(vetor));

        quicksort(vetor, 0, vetor.length -1);
        System.out.println(Arrays.toString(vetor));

    }

    public static void quicksort(int[] vetor, int esquerda, int direita){
        if(esquerda < direita){
            int p = particao(vetor, esquerda, direita);
            quicksort(vetor, esquerda, p);
            quicksort(vetor, p+ 1, direita);
            
        }
    } 

    public static int particao(int[] vetor, int esquerda, int direita){
        int meio = (int) ((esquerda + direita)/2);
        int pivot = vetor[meio];
        int i = esquerda -1 ; // menos 1, pois vamos incrementar com o do while
        int j = direita + 1;  // mais 1, pois vamos incrementar com o do while

        while(true){
            do{
                i++;
            }while(pivot > vetor[i]);

            do{
                j--;
            }while(pivot < vetor[j]);

            if(i >=j){
                return j;
            }

            int aux = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = aux;
        }

    }
        

}
