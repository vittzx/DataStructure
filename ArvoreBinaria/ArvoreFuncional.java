package ArvoreBinaria;

public class ArvoreFuncional {
    public static void main(String[] args) {
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<Integer>();

        arvore.adicionar(10);
        arvore.adicionar(8);
        arvore.adicionar(5);
        arvore.adicionar(9);
        arvore.adicionar(7);
        arvore.adicionar(18);
        arvore.adicionar(13);
        arvore.adicionar(20);

        System.out.println("Em ordem: ");
        arvore.emOrdem(arvore.getRaiz());
        System.out.println();
        System.out.println("Pre ordem: ");
        arvore.preOrdem(arvore.getRaiz());
        System.out.println();
        System.out.println("Pos ordem: ");
        arvore.posOrdem(arvore.getRaiz());



    }
}
