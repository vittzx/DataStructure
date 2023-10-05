package MetodosDeSort;

import java.util.Arrays;

/*
 * Insertion sort 
 * [5,4,3,2,1]
 *  j i
 * verifica se o numero aux (vetor[i]) é menor. Se ele for menor, o indice da posicao j passa a ocupar j + 1, empurrando 
 * os numeros para frente
 * 
 */
public class InsertionSort {
    public static void main(String[] args) {
        
        int[] vetor = new int[10];

        for(int i = 0; i < vetor.length ; i++){
            vetor[i] = (int) (Math.random() * 10);
        }
        // antes do metodo insert sort 
        System.out.println(Arrays.toString(vetor));
        int aux,j;
        for(int i =1; i < vetor.length; i++){
            j = i-1;
            aux = vetor[i];
            while(j>=0 && aux < vetor[j]){

                vetor[j+1] = vetor[j];
                j--;
            }
            // j passa a valer -1;
            // entao para a posicao "0" -> ele precisa somar 1
            // ou 
            // para j passa a valer index de aux -1 
            // entao para realocar no lugar certo, precisa somar 1 no index de j para colocar o aux
            vetor[j+1] = aux;

        }
        // for(Integer num: vetor){
        //     System.out.println(num);
        // }
        // depois do metodo insert sort
        System.out.println(Arrays.toString(vetor));
    }
}
