package com.dalfaro.ejercicioprogramacion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        List<Long> horas = new ArrayList<>(Arrays.asList(Programa.PROGRAMACION));
        List<String> tipos = new ArrayList<>(Arrays.asList(Programa.TIPO));
        Set<String> tiposUnicos = new HashSet<>(tipos);

        List<Programa> programas = creaProgramacion(horas, tipos);
        Map<String, Integer> programasPorTipo = new HashMap<>();

        for (String tipo: tiposUnicos) {
            int count = 0;
            for (Programa programa: programas) {
                if(programa.getTipo().equals(tipo)) count++;
            }
            programasPorTipo.put(tipo, count);
        }

        System.out.println(tiposUnicos);
        System.out.println(programas);
        System.out.println(programasPorTipo);

        Programa programaMasLargo = getProgramaMasLargo(programas);
        System.out.println(programaMasLargo);

    }

    private static List<Programa> creaProgramacion(List<Long> horas, List<String> tipos) {

        List<Programa> programacion = new ArrayList<>();

        for (int i = 0; i < tipos.size(); i++) {
            if(i == tipos.size() - 1) {
                Programa programa = new Programa(horas.get(i), horas.get(0), tipos.get(i));
                programacion.add(programa);
                break;
            }
            Programa programa = new Programa(horas.get(i), horas.get(i+1), tipos.get(i));
            programacion.add(programa);

        }

        return programacion;
    }

    public static Programa getProgramaMasLargo(List<Programa> programas) {
        Programa programaMasLargo = null;
        for (Programa programa: programas) {
            if(programaMasLargo == null) {
                programaMasLargo = programa;
                continue;
            }
            long duracion = Math.abs(programa.getHoraFinal() - programa.getHoraInicio());
            long duracionMasLargo = Math.abs(programaMasLargo.getHoraFinal() - programaMasLargo.getHoraInicio());
            if(duracion > duracionMasLargo) {
                programaMasLargo = programa;
            }
        }
        return programaMasLargo;
    }





}
