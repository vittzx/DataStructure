package ListasLinkadas.Fila;

public class Fila2Funcional {

    public static void main(String[] args) {
    
        Fila2<String> fila2 = new Fila2<String>();

        fila2.adicionar("Jose");
        fila2.adicionar("Maria");
        fila2.adicionar("Roberto");
        fila2.adicionar("Cristo");

        System.out.println("Primeiro elemento: " + fila2.getPrimeiro());

        fila2.remover();
        System.out.println("Novo primerio: " + fila2.getPrimeiro() );
        
        fila2.remover();
        System.out.println("Novo primerio: " + fila2.getPrimeiro() );
        



    }



}
