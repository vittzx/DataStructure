package ArvoreBinaria;

public class ArvoreFuncional2 {
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

        System.out.println(arvore.remover(20));


        System.out.println("\nEm ordem: ");
        arvore.emOrdem(arvore.getRaiz());

        System.out.println(arvore.remover(7));


        System.out.println("\nEm ordem: ");
        arvore.emOrdem(arvore.getRaiz());


        System.out.println(arvore.remover(8));
        System.out.println("\nEm ordem: ");
        arvore.emOrdem(arvore.getRaiz());


        System.out.println(arvore.remover(10));
        System.out.println("\nEm ordem: ");
        arvore.emOrdem(arvore.getRaiz());
        System.out.println(arvore.remover(10));
        System.out.println("\nEm ordem: ");
        arvore.emOrdem(arvore.getRaiz());
        System.out.println(arvore.remover(5));
        System.out.println("\nEm ordem: ");
        arvore.emOrdem(arvore.getRaiz());
        
        System.out.println(arvore.remover(13));
        System.out.println("\nEm ordem: ");
        arvore.emOrdem(arvore.getRaiz());

        
        System.out.println("\nEm ordem: ");
        arvore.emOrdem(arvore.getRaiz());
        
        
                
        



    }
}
