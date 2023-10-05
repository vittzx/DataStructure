package Recursividade;

import java.util.Arrays;

public class Recursividade {
    /* 
     * Recursividade, loop entre funcoes 
     */

     public static void main(String[] args) {
        int[] arr = new int[10];
        for(int i =0; i < arr.length ; i++){
            arr[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(arr));
    
        System.out.println("Resultado da soma: " + somar(0,0,arr));


     }

     public static int somar(int resultado, int posicao, int[] vetor){
        if(posicao < vetor.length){
            resultado += vetor[posicao];
            return somar(resultado,(posicao + 1),vetor);
        }
        else return resultado;  
     }

}
