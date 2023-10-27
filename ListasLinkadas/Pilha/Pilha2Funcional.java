package ListasLinkadas.Pilha;


public class Pilha2Funcional {
    public static void main(String[] args) {
        Pilha2<String> pilha2 = new Pilha2<String>();

        pilha2.adicionarComeco("A");
        pilha2.adicionarComeco("B");
        pilha2.adicionarComeco("C");
        pilha2.adicionarComeco("D");
        pilha2.adicionarComeco("E");

        System.out.println("TOPO : " + pilha2.get());

        pilha2.remover();

        System.out.println("Novo TOPO: " + pilha2.get());

    }
}
