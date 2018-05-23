package com.mcmacedo.hoteis.model;

import java.util.ArrayList;
import java.util.List;

public class Hotel implements Comparable<Hotel> {

    private String nomeHotel;
    private Integer estrelas;
    private Diaria diariaRegular;
    private Diaria diariaVip;

    public Hotel() {
    }

    public Hotel(String nomeHotel, Integer estrelas, Diaria diariaRegular, Diaria diariaVip) {
        this.nomeHotel = nomeHotel;
        this.estrelas = estrelas;
        this.diariaRegular = diariaRegular;
        this.diariaVip = diariaVip;
    }

    public String getNomeHotel() {
        return nomeHotel;
    }

    public void setNomeHotel(String nomeHotel) {
        this.nomeHotel = nomeHotel;
    }

    public Integer getEstrelas() {
        return estrelas;
    }

    public void setEstrelas(Integer estrelas) {
        this.estrelas = estrelas;
    }

    public Diaria getDiariaRegular() {
        return diariaRegular;
    }

    public void setDiariaRegular(Diaria diariaRegular) {
        this.diariaRegular = diariaRegular;
    }

    public Diaria getDiariaVip() {
        return diariaVip;
    }

    public void setDiariaVip(Diaria diariaVip) {
        this.diariaVip = diariaVip;
    }

    public static List<Hotel> criaListaDeHoteis() {
        List<Hotel> hoteis = new ArrayList<Hotel>();

        Hotel hotelOthon = new Hotel("Othon", 3, new Diaria(110.0, 90.0), new Diaria(80.0, 80.0));
        Hotel hotelSolaris = new Hotel("Solaris", 4, new Diaria(160.0, 60.0), new Diaria(110.0, 50.0));
        Hotel hotelRoyal = new Hotel("Royal Hotel", 5, new Diaria(220.0, 150.0), new Diaria(100.0, 40.0));

        hoteis.add(hotelRoyal);
        hoteis.add(hotelSolaris);
        hoteis.add(hotelOthon);

        return hoteis;
    }

    @Override
    public int compareTo(Hotel other) {
        if (this.getEstrelas() < other.getEstrelas())
            return 1;

        if (this.getEstrelas() == other.getEstrelas())
            return 0;

        else
            return -1;
    }
}
