/*
 * int[] arr = new arr[10] {1,2,3 ,4,5,6,7,8,9,10};
 * procurar o n7
 * separa na metade e busca na metade q esta 
 * {6,7,8,9,10};
 * separa na metade e busca na metade q esta 
 * {6,7,8}
 * é o meio entao achou
 * 
 * ATENCAO: PARA REALIZAR A BUSCA BINARIA O VETOR OU ARRAY PRECISA ESTAR ORDENADO.
 */


public class BuscaBinaria{
    public static void main(String[] args) {
        int[] arr = new int[8];
        for(int i =0; i < arr.length ;i++){
            arr[i] = i *10 + 10;
        }


    }
}

