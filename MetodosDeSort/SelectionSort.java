package MetodosDeSort;

import java.util.Arrays;

public class SelectionSort {
    /*
     * Selection sort é um bubble sort mais inteligente.
     * 
     * Pois ele compara todos e nao realiza a troca
     * Na comparacao ele guarda o menor e depois faz a troca com o i.
     * entao garante assim que o i seja o menor. e realiza i +1 para o avanco.
     * 
     * 
     */

     public static void main(String[] args) {
        int[] arr  = new int[10];
        for(int i =0; i < arr.length ; i++){
            arr[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(arr));

        int aux, menor_posicao;
        for(int i =0; i< arr.length ; i++){
            menor_posicao=i;
            for(int j = i+1; j< arr.length ;j++){
                // se o arr[posicao menor] for MAIOR que o arr[j], significa que tem que trocar a posicao
                if(arr[j] < arr[menor_posicao] ){
                    menor_posicao = j;
                }

                aux = arr[i];
                arr[i] = arr[menor_posicao];
                arr[menor_posicao] = aux;

            }
        }

        System.out.println(Arrays.toString(arr));
     }
}
