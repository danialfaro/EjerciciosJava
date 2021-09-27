package com.dalfaro.ejerciciopunto;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Punto> poligono = new ArrayList<Punto>();
        poligono.add(new Punto(0,1));
        poligono.add(new Punto(2,0));
        poligono.add(new Punto(4,3));
        poligono.add(new Punto(1,4));
        poligono.add(new Punto(1,2));

        double perimetro = 0;
        for (int i = 0; i < poligono.size(); i++) {
            if(i == poligono.size() - 1) {
                perimetro += poligono.get(i).distancia(poligono.get(0));
                break;
            }
            perimetro += poligono.get(i).distancia(poligono.get(i + 1));
        }

        System.out.println("perimetro: " + perimetro);
        System.out.println("lado medio: " + perimetro/poligono.size());

    }

}
