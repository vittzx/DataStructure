package ComplexidadeDeTempo;

public class ProgramaTempo {

    // O -> Pior caso
    /*
     * Melhores complexidades de tempo:
     * logaritimo -> O(log n) 
     * linear ->  O(n)
     * linear * logaritimo -> O(n log n)
     */
    public static void main(String[] args) {
        // busca linear -> verificar um por 1 

        int[] vetor = new int[10];
        for(int i =0; i < vetor.length ;i++){
            vetor[i] = (int) Math.round(Math.random() * 100);
            System.out.println();
        }



    }
}
