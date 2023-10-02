package ListasLinkadas.ProgramaMainFuncional;

import ListasLinkadas.ListaLinkada.ListaLigada;

public class FuncionalNumerico {
    public static void main(String[] args) {
        ListaLigada<Integer> lista_numerica = new ListaLigada<Integer>();
        
        
        lista_numerica.adicionar(90);
        lista_numerica.adicionar(110);

        lista_numerica.verLista();
    }
}
