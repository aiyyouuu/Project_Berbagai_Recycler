package com.example.user.tugasrecycler.Model;

public class TempatModel {
    String namaTempat;
    int fotoTempat;

    public TempatModel(String namaTempat, int fotoTempat){
        this.namaTempat = namaTempat;
        this.fotoTempat = fotoTempat;
    }
    public String getNamaTempat() {
        return namaTempat;
    }

    public int getFotoTempat() {
        return fotoTempat;
    }

}
