public class TestaListaLigada {
    
    public static void main(String[] args){
        ListaLigada lista = new ListaLigada();

        System.out.println(lista);
        lista.adicionanoComeco("mauricio");
        System.out.println(lista);
        lista.adicionanoComeco("paulo");
        System.out.println(lista);
        lista.adicionanoComeco("guilherme");
        System.out.println(lista);
        lista.adiciona("Marcelo");
        System.out.println(lista);
    }
}
