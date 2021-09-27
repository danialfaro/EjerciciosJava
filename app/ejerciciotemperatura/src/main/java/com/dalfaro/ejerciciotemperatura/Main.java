package com.dalfaro.ejerciciotemperatura;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        List<Lectura> lecturas = new ArrayList<>();
        Set<String> habitaciones = new HashSet<>();

        Map<String, ArrayList<Integer>> temperaturasPorHabitacion = new HashMap<>();

        for (int i = 0; i < Lectura.FECHA.length; i++) {
            Lectura l = new Lectura(Lectura.FECHA[i], Lectura.HABITACION[i], Lectura.TEMPERATURA[i]);
            lecturas.add(l);

            if(habitaciones.add(l.getHabitacion())) {
                temperaturasPorHabitacion.put(l.getHabitacion(), new ArrayList<Integer>());
            }

            temperaturasPorHabitacion.get(l.getHabitacion()).add(l.getTemperatura());
        }

        System.out.println(habitaciones);
        System.out.println(temperaturasPorHabitacion);

        for (Map.Entry<String, ArrayList<Integer>> entry : temperaturasPorHabitacion.entrySet()) {

            double total = 0;
            for (int t: entry.getValue()) {
                total += t;
            }

            System.out.println("Media 1 " + entry.getKey() + " = " + total/entry.getValue().size());
        }





    }
}
