package ListasLinkadas.Pilha;

public class PilhaFuncional {
    public static void main(String[] args) {
        Pilha<String> pilha = new Pilha<String>();

        pilha.adicionar("A");
        pilha.adicionar("B");
        pilha.adicionar("C");
        pilha.adicionar("D");
        pilha.adicionar("E");

        System.out.println("TOPO: " + pilha.get());
        pilha.remover();
        System.out.println("Novo topo: " + pilha.get());
        

    }
}
