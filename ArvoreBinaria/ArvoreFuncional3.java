package ArvoreBinaria;

public class ArvoreFuncional3 {
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

        System.out.println(arvore.remover2(5));
        System.out.println("Em ordem: ");
        arvore.emOrdem(arvore.getRaiz());


        System.out.println(arvore.remover2(8));
        System.out.println("Em ordem: ");
        arvore.emOrdem(arvore.getRaiz());

        System.out.println(arvore.remover2(10));
        System.out.println("Em ordem: ");
        arvore.emOrdem(arvore.getRaiz());

        System.out.println(arvore.remover2(20));
        System.out.println("Em ordem: ");
        arvore.emOrdem(arvore.getRaiz());

        System.out.println(arvore.remover2(9));
        System.out.println("Em ordem: ");
        arvore.emOrdem(arvore.getRaiz());

        System.out.println(arvore.remover2(7));
        System.out.println("Em ordem: ");
        arvore.emOrdem(arvore.getRaiz());

        System.out.println(arvore.remover2(13));
        System.out.println("Em ordem: ");
        arvore.emOrdem(arvore.getRaiz());


    }
}
