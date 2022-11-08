package Klasy;

public class Klasa {
    String imie;
    int wiek;

    public Klasa(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }
    public Klasa(){}

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    @Override
    public String toString() {
        return "Klasy.Klasa{" +
                "imie='" + imie + '\'' +
                ", wiek=" + wiek +
                '}';
    }
}
