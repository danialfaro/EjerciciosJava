package com.dalfaro.ejerciciotemperatura;

public class Lectura {

    static long[] FECHA = {1288122023000L, 1288122023000L, 1288122223000L, 1288122223000L, 1288122223000L, 1288122623000L, 1288122623000L, 1288122623000L};
    static String[] HABITACION = {"cocina", "baño", "cocina", "baño", "comedor", "cocina", "baño", "comedor"};
    static int[] TEMPERATURA = {18, 19, 17, 19, 17, 19, 22, 22};

    private long tiempo;
    private String habitacion;
    private int temperatura;

    public Lectura(long tiempo, String habitacion, int temperatura) {
        this.tiempo = tiempo;
        this.habitacion = habitacion;
        this.temperatura = temperatura;
    }

    public long getTiempo() {
        return tiempo;
    }

    public void setTiempo(long tiempo) {
        this.tiempo = tiempo;
    }

    public String getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(String habitacion) {
        this.habitacion = habitacion;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }
}