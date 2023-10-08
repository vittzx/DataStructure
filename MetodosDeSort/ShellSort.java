package MetodosDeSort;

import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        // criando o vetor e ordenando ele 
        int[] arr  = new int[10];
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

        
    }
}
