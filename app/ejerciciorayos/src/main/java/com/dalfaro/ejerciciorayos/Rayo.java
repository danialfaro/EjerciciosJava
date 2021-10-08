package com.dalfaro.ejerciciorayos;

public class Rayo {

    static long[] TIEMPO = {2L, 4L, 5L, 6L, 9L, 12L, 14L, 16L};
    static String[] CIUDAD = {"Gandia", "Oliva", "Ibi", "Gandia", "Ibi", "Oliva", "Ibi", "Ibi"};
    static int[] INTENSIDAD = {1, 2, 2, 1, 2, 3, 1, 2};

    private long tiempo;
    private String ciudad;
    private int intensidad;

    public Rayo(long tiempo, String ciudad, int intensidad) {
        this.tiempo = tiempo;
        this.ciudad = ciudad;
        this.intensidad = intensidad;
    }

    public long getTiempo() {
        return tiempo;
    }

    public void setTiempo(long tiempo) {
        this.tiempo = tiempo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getIntensidad() {
        return intensidad;
    }

    public void setIntensidad(int intensidad) {
        this.intensidad = intensidad;
    }
}