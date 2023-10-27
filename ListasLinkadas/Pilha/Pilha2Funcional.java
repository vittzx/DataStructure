package ListasLinkadas.Pilha;

public class Pilha2Funcional {
    public static void main(String[] args) {
        Pilha2<String> pilha = new Pilha2<String>();

        pilha.adicionar("A");
        pilha.adicionar("B");
        pilha.adicionar("C");
        pilha.adicionar("D");
        pilha.adicionar("E");

        System.out.println("Primeiro elemento da pilha: " + pilha.getPrimeiro().getConteudo());
        System.out.println("Ultimo elemento da pilha: " + pilha.getUltimo().getConteudo());
        System.out.println();
        pilha.remover();

        System.out.println("Primeiro elemento da pilha: " + pilha.getPrimeiro().getConteudo());
        System.out.println("Novo ultimo elemento da pilha: " + pilha.getUltimo().getConteudo());
        System.out.println();
        pilha.remover();
        
    }
}
