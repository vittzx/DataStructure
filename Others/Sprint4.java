package Others;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Sprint4 {
    public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Quantas equipes participarão da competição ?");
		int numEquipes = teclado.nextInt();
		System.out.println("Quantos integrantes tem por equipe ? ");
		int numIntegrantes = teclado.nextInt();
  
		// equipes[x][y] | [x] -> equipe, [y] -> qntd de pessoas no grupo, nota design, pontuacao das vitoras 
        
		int[][] equipes = new int [numEquipes][4];


        // Preencher o TotalEquipes com valor 0, para que no futuro consiga somar os pontos.
        for(int i =0; i < equipes.length; i++){
            equipes[i][1] =0;

            System.out.println("Qual a nota do design do robô? Equipe " + (i+1)+ " :");
			int notaDesign = teclado.nextInt();
			
			equipes[i][2] = notaDesign;
            equipes[i][3] = i + 1;
		
        }

		for(int i=0; i< numEquipes -1; i++) {
        System.out.println("----------- !! BATALHA !! -------------- ");    

			
			equipes[i][0] = numIntegrantes;
			for(int j =i + 1; j < numEquipes; j++) {

                System.out.println("Equipe " + (equipes[i][3]) + " vs Equipe " + (equipes[j][3]));
                int valorEquipeCasa = (int) (Math.random() * 10); // valor equipe casa == equipe[i]
                int valorEquipeFora = (int) (Math.random() * 10); // valor equipe fora == equipe[j]
                System.out.println("Equipe: " +  (equipes[i][3]) + " Valor gerado: " + valorEquipeCasa );
                System.out.println("Equipe: " +  (equipes[j][3]) + " Valor gerado: " + valorEquipeFora );
                if(valorEquipeCasa > valorEquipeFora) {
                    // vitoria para a equipe i e derrota para a equipe j
                    equipes[i][1] +=5;
                }
                else if(valorEquipeCasa == valorEquipeFora){
                    // empate para ambas equipes (i && j)
                    equipes[i][1] +=3;
                    equipes[j][1] +=3;
                }
                else{
                    // derrota para equipe fora 
                    equipes[j][1] +=5;
                }
                System.out.println();
			}	
		}

		Arrays.sort(equipes, Comparator.comparingInt(o -> o[1]));
		System.out.println("------------ Tabela ------------");
		for(int i =numEquipes-1; i >= numEquipes-3;i-- ) {
			System.out.println( "Equipe: " + equipes[i][3] + ": \nTotal de Pontos: "+ equipes[i][1] + "\nNota de Design: " + equipes[i][2] +"\n");
		}
		

        int[][] finalistas = new int [3][3];
        
        for(int i =numEquipes-1, j =0; i >= numEquipes-3;i--, j++){
            finalistas[j][0] = 0;
            finalistas[j][1] = equipes[i][2]; // nota de Design
            finalistas[j][2] = equipes[i][3];  // id da equipe 
        }

        
		for(int i=0; i < finalistas.length -1 ; i++) {
        System.out.println("----------- !! BATALHAS FINAIS !! -------------- ");    

		
			for(int j =i + 1; j < finalistas.length; j++) {
                System.out.println("Equipe " + (finalistas[i][2]) + " vs Equipe " + (finalistas[j][2] ));
                int valorEquipeCasa = (int) (Math.random() * 10); // valor equipe casa == equipe[i]
                int valorEquipeFora = (int) (Math.random() * 10); // valor equipe fora == equipe[j]
                System.out.println("Equipe: " +  (finalistas[i][2] ) + " Valor gerado: " + valorEquipeCasa );
                System.out.println("Equipe: " +  (finalistas[j][2] ) + " Valor gerado: " + valorEquipeFora );

                if(valorEquipeCasa > valorEquipeFora) {
                    // vitoria para a equipe i e derrota para a equipe j
                    finalistas[i][0] +=2;
                }
                else if(valorEquipeCasa == valorEquipeFora){
                    // empate para ambas equipes (i && j)
                    finalistas[i][0] +=1;
                    finalistas[j][0] +=1;
                }
                else{
                    // derrota para equipe fora 
                    finalistas[j][0] +=2;
                }
                System.out.println();
			}
            
            
        }


        // Fazendo Seleciton Sort | Complexidade de tempo: O(n2)
        for(int i =0; i < finalistas.length -1; i++){
            int totalPtsMaior = finalistas[i][0];
            int index =i;
            for(int j = i +1; j< finalistas.length; j++){
                if(finalistas[j][0] > totalPtsMaior){
                    totalPtsMaior = finalistas[j][0];
                    index = j;
                }else if(finalistas[j][0] == totalPtsMaior ){
                    // Conferindo se a Nota Design eh maior
                    if(finalistas[j][1] > finalistas[index][1]){
                        // aqui nao precisa mudar o valor pq ele eh igual
                        index = j;
                    }
                }                
            }

            int aux = finalistas[i][0];
            finalistas[i][0] = finalistas[index][0];
            finalistas[index][0] = aux;
                    
            aux = finalistas[i][1];
            finalistas[i][1] = finalistas[index][1];
            finalistas[index][1] = aux;

            aux = finalistas[i][2];
            finalistas[i][2] = finalistas[index][2];
            finalistas[index][2] = aux;
        }

        int k =1;
        System.out.println("------------ Tabela FINAL TOP 3 ------------");
        for(int i =finalistas.length - 1; i >=0 ; i--){
            System.out.println("Posicao: " + k);
            System.out.println( "Equipe " + finalistas[i][2] + ": \nTotal de Pontos: "+ finalistas[i][0] + "\nNota de Design: " + finalistas[i][1] +"\n");
            k++;

        }

        teclado.close();
        
	}


}
