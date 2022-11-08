package Klasy;

import java.util.*;

public class Prostokat {
    float dlugosc;
    float szerokosc;

    public Prostokat(float dlugosc, float szerokosc) {
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
    }

    public float obliczPole() {
        return dlugosc * szerokosc;
    }

    public float obliczObwod() {
        return (2 * dlugosc)*(2 * szerokosc);
    }

    public float obliczPrzekatna(){
        return (float)(Math.sqrt((float)(Math.pow(dlugosc,2)*Math.pow(szerokosc,2))));
    }
}

