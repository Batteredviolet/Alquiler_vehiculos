package org.example;

public class Camion extends Vehiculo {
    private int kg;

    public Camion(String matricula, String marca, String modelo, int kg) {
        super(matricula, marca, modelo);
        this.kg = kg;
    }

    public int getKg() {
        return kg;
    }

    public void setKg(int kg) {
        this.kg = kg;
    }

    @Override
    public String toString() {
        return "Camion{" +
                "kg=" + kg +
                ", matricula='" + matricula + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
