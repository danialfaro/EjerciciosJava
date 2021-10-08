package com.dalfaro.ejerciciorayos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        List<Rayo> rayos = new ArrayList<>();
        Set<String> ciudades = new HashSet<>();

        Map<String, Double> mediaPeriodoPorCiudad = new HashMap<>();

        for (int i = 0; i < Rayo.TIEMPO.length; i++) {
            Rayo l = new Rayo(Rayo.TIEMPO[i], Rayo.CIUDAD[i], Rayo.INTENSIDAD[i]);
            rayos.add(l);

            ciudades.add(l.getCiudad());
        }

        System.out.println(ciudades);

        for (String ciudad: ciudades) {

            double suma = 0;
            int count = 0;

            Rayo rayoAnterior = null;
            for (Rayo rayo: rayos) {

                if(rayo.getCiudad().equals(ciudad)) {
                    if(rayoAnterior == null) suma += rayo.getTiempo();
                    else suma += rayo.getTiempo() - rayoAnterior.getTiempo();

                    rayoAnterior = rayo;
                    count++;
                }
            }

            double media = suma / count;
            mediaPeriodoPorCiudad.put(ciudad, media);
            
        }

        System.out.println(mediaPeriodoPorCiudad);

    }

}
