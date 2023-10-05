package MetodosDeSort;

import java.util.Arrays;

/*
 * Insertion sort 
 * [1,5,3,4,2]  
 * comparou o 1 ao demais
 * [1,5,3,4,2]
 * comparou p 1 com 5 e 5 com 3 
 * como 3 é menor q o 5 e maior q o 1, entao vai no meio 
 * [1,3,5,4,2]
 * ----------------------------
 * aux = 4
 * j para no indice 1 que é equivalente ao elemento 3
 * [1,3,5,5,2]
 *  0 1 2 3 4
 * 
 * 
 * aux entra no indice j + 1 ==> 1 + 1 ==> 2
 * [1,3,4,5]
 * 
 * --------------------------
 * [1,3,4,5,2]
 * aux = 2
 * seg
 * pq sempre o i é substituido pelo j que o i é equivalente de J + 1 SOMENTE NO PRIMEIRO CASO.
 * 1 passo : [1,3,4,5,5] entra o 5 pelo 2 
 * 2 passo : [1,3,4,4,5] entra o 4 no lugar do 5
 * 3 passo : [1,3,3,4,5] entra o 3 no lugar do 5 
 * 4 passo (break) : [1, 2 , 3 , 4 ,5 ] 
 *  
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
