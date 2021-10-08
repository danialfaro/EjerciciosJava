package com.dalfaro.ejercicioprogramacion;

public class Programa {

    static Long[] PROGRAMACION = {6L, 10L, 12L, 15L, 17L, 20L, 22L, 24L};
    static String[] TIPO = {"NOTICIAS", "MAGAZINE", "MUSICA", "NOTICIAS", "MAGAZINE", "NOTICIAS", "MAGAZINE", "MUSICA"};

    private Long horaInicio;
    private Long horaFinal;
    private String tipo;

    public Programa(Long horaInicio, Long horaFinal, String tipo) {
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
        this.tipo = tipo;
    }

    public Long getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Long horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Long getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(Long horaFinal) {
        this.horaFinal = horaFinal;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Programa{" +
                "horaInicio=" + horaInicio +
                ", horaFinal=" + horaFinal +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}