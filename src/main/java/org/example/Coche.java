package org.example;

public class Coche extends Vehiculo {
    private int puertas;
    private int plazas;

    public Coche(String matricula, String marca, String modelo, int puertas, int plazas) {
        super(matricula, marca, modelo); //Super es una referencia al padre, como lo es this al objeto
        this.puertas = puertas;
        this.plazas = plazas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "puertas=" + puertas +
                ", plazas=" + plazas +
                ", matricula='" + matricula + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
