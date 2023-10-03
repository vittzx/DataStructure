package MetodosDeSort;

import java.util.Arrays;

/*
 * Bubble sort 
 * Time complexity: O(n2)
 * faz uma varredura linear de n * n-1 para deixar em ordem 
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

        for(int i=0; i < vetor.length; i++){
            for(int j= i+1; j<vetor.length;j++){
                if(vetor[j] > vetor[i]){
                    int temp = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(vetor));
    }
}
