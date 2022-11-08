package Klasy;

import java.time.LocalDate;
import java.time.Period;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.temporal.ChronoUnit;

public class Budynek {
    String nazwa;
    LocalDate rokBudowy;
    int liczbaPieter;

    public Budynek(String nazwa, LocalDate rokBudowy, int liczbaPieter) {
        this.nazwa = nazwa;
        this.rokBudowy = rokBudowy;
        this.liczbaPieter = liczbaPieter;
    }

    public void daneOBudynku() {
        System.out.println("Nazwa budynku: " + nazwa);
        System.out.println("Rok budowy: " + rokBudowy);
        System.out.println("Liczba pięter: " + liczbaPieter);
    }

    public void ileOdBudowy() {
        LocalDate dzis;
        dzis = LocalDate.now();
        System.out.println("Od budowy budynku minęło: " + Period.between(rokBudowy,(LocalDate)dzis));
    }
}

