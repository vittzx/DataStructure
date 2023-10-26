package ListasLinkadas.Fila;

public class FilaFuncional {
    public static void main(String[] args) {
        Fila<String> fila = new Fila<>();

        fila.adicionar("Jose");
        fila.adicionar("Eduardo");
        fila.adicionar("Maria ");
        fila.adicionar("Carlos");
        fila.adicionar("Roberto");

        System.out.println("Primeiro: " + fila.getPrimeiro());
        fila.remover();
        System.out.println("Novo primeiro: " + fila.getPrimeiro());
        System.out.println(fila);
    }
}
