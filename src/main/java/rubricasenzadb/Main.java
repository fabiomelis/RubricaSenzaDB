package rubricasenzadb;


public class Main {
    public static void main(String[] args) {

        ListaPersone listaPersone = FileInformazioni.caricaRubrica();

        new Rubrica(listaPersone);


    }
}