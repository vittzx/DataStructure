package MetodosDeSort;

import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        // criando o vetor e sorteando ele 
        int[] arr  = new int[8];
        for(int i =0; i < arr.length ; i++){
            arr[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(arr));

        // -------

        int h =1;

        while(h < arr.length){
            h = h * 3 + 1;
        }
        h = (int)Math.floor(h /3);

        int elemento, j;

        while(h> 0){
            for(int i =h; i < arr.length; i++){
                j = i; // j == index
                elemento = arr[j]; // c = elemento que vamos comparar
                while(j >= h && arr[j- h] > elemento){
                    arr[j] = arr[j-h]; 
                    j -= h;
                }
                arr[j] = elemento;
            }
            h /=2;
        }
        
        System.out.println(Arrays.toString(arr));

    }
}
