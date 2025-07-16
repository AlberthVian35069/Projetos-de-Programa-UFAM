package br.edu.ufam.icomp.lab_encapsulamento;

import java.util.Random;

public class Celular implements Localizavel {
    private int codPais;
    private int codArea;
    private int numero;

    public Celular(int codPais, int codArea, int numero) {
        setCodPais(codPais);
        setCodArea(codArea);
        setNumero(numero);
    }

    public int getCodPais() {
        return codPais;
    }

    public final void setCodPais(int codPais) {
        this.codPais = (codPais >= 1 && codPais <= 1999) ? codPais : -1;
    }

    public int getCodArea() {
        return codArea;
    }

    public final void setCodArea(int codArea) {
        this.codArea = (codArea >= 10 && codArea <= 99) ? codArea : -1;
    }

    public int getNumero() {
        return numero;
    }

    public final void setNumero(int numero) {
        this.numero = (numero >= 10000000 && numero <= 999999999) ? numero : -1;
    }

    @Override
    public Posicao getPosicao() {
        Random r = new Random();
        double latitude = -3.100000 + (-2.900000 - (-3.100000)) * r.nextDouble();
        double longitude = -60.120000 + (-59.820000 - (-60.120000)) * r.nextDouble();
        double altitude = 15.0 + (100.0 - 15.0) * r.nextDouble();
        
        return new Posicao(latitude, longitude, altitude);
    }

    @Override
    public double getErroLocalizacao() {
        return 50.0;
    }
}