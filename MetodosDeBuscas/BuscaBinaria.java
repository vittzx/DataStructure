/*
 * int[] arr = new arr[10] {1,2,3 ,4,5,6,7,8,9,10};
 * NUMEROS DESEJADOS 7 ou 3 ;
 * meio = 4 -> indice 
 * inicio = 0
 * fim = 9 
 * ----------------------------
 * se for maior (7 > 4){
 *      inicio = meio + 1;
 *      fim = fim; -> nao altera 
 *      meio = (int) ((inicio + fim ) /2);
 *  }
 * 
 * ------------------------------
 * se for menor (3 < 4){
 *      fim = meio -1;
 *      inicio = inicio;
 *      meio = (int) ((inicio + fim)/2);
 *  }
 * procurar o n7
 * separa na metade e busca na metade q esta 
 * {6,7,8,9,10};
 * separa na metade e busca na metade q esta 
 * {6,7,8}
 * é o meio entao achou
 * 
 * ATENCAO: PARA REALIZAR A BUSCA BINARIA O VETOR OU ARRAY PRECISA ESTAR ORDENADO.
 */

import java.util.Scanner;

public class BuscaBinaria{
    public static void main(String[] args) {
        int[] arr = new int[1000000];
        for(int i =0; i < arr.length ;i++){
            arr[i] = i *10;
            System.out.println(arr[i]);
        }
        Scanner input = new Scanner(System.in);
        int count =0; // contar o numero de vezes que fez a busca ou se dividiu ao meio

        boolean achou = false;
        int inicio =0;
        int fim = arr.length-1;
        int meio;

        System.out.println("Qual numero vc deseja buscar? ");
        int numeroDesejado = input.nextInt();
        System.out.println(numeroDesejado);

        while(fim >= inicio){
            meio = (int) ((inicio + fim) /2);
            count++;
            if(arr[meio] == numeroDesejado){
                achou = true;
                break;
            }
            else if(numeroDesejado > arr[meio] ){
                inicio = meio + 1;
                // fim nao se alteral, ou seja | fim = fim;
                // o meio se reajusta conforme o loop vai indo.
            }else{
                // numeroDesejado < arr[meio]
                fim = meio - 1;
                // inicio nao se altera, ou seja | inicio = inicio;
                //o meio tambem se reajusta.
            }
        }

        if(achou){
            System.out.println("Numero desejado encontrado: " + numeroDesejado);
        }
        else {
           System.out.println("Numero nao encontrado"); 
        }

        System.out.println("Numero de vezes que realizou a busca: " + count);
        input.close();

    }
}

