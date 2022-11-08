package Klasy;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Klasa ob1 = new Klasa("Bartek", 22);
        // System.out.println(ob1.toString());
        //ob1.setImie("Karol");

        Prostokat prostokat1 = new Prostokat(3, 3);
        System.out.println(prostokat1.obliczPole());
        System.out.println(prostokat1.obliczPrzekatna());
        System.out.println(prostokat1.obliczObwod());

        Budynek budynek1 = new Budynek("Dwupiętrowy Apartament", LocalDate.of(2017, 6, 24), 2);
        budynek1.daneOBudynku();
        budynek1.ileOdBudowy();
        Budynek budynek2 = new Budynek("Słomianka", LocalDate.of(1896, 7, 14), 1);
        budynek2.daneOBudynku();
        budynek2.ileOdBudowy();

        Gatunek jaszczur = new Gatunek("Jaszczurka", "gad", 5, "Ale sie wije skubany");
        jaszczur.WypiszGatunek();
    }
}