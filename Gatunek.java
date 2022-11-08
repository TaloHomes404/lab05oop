package Klasy;

public class Gatunek {
    String nazwaGatunku;
    String rodzaj;
    int podstawowaLiczbaChromosomow;

    String Opis;

    public Gatunek(String nazwaGatunku,String rodzaj, int podstawowaLiczbaChromosomow, String opis) {
        this.nazwaGatunku = nazwaGatunku;
        this.podstawowaLiczbaChromosomow = podstawowaLiczbaChromosomow;
        Opis = opis;
        this.rodzaj = rodzaj;
    }

    public void WypiszGatunek() {
        System.out.println("Nazwa gatunku: " + nazwaGatunku);
        System.out.println("Typ: " + rodzaj);
        System.out.println("Informacja: " + Opis);
        System.out.println("Liczba chromosomów to: " + podstawowaLiczbaChromosomow);
        System.out.println("Haploidalna liczba chromosomów: " + (2 * podstawowaLiczbaChromosomow));
    }
}
