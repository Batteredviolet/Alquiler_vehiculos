package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ContratoAlquiler {
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private float precioDia;
    private Vehiculo vehiculo;
    private Cliente cliente;

    public ContratoAlquiler(LocalDate fechaInicio, LocalDate fechaFin, float precioDia, Vehiculo vehiculo, Cliente cliente) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.precioDia = precioDia;
        this.vehiculo = vehiculo;
        this.cliente = cliente;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public float getPrecioDia() {
        return precioDia;
    }

    public void setPrecioDia(float precioDia) {
        this.precioDia = precioDia;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int nDias(){
        return (int)ChronoUnit.DAYS.between(this.fechaInicio, this.fechaFin);
    }

    public float costeTotal(){
        return this.precioDia * this.nDias();
    }

    @Override
    public String toString() {
        return "ContratoAlquiler{" +
                "fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                ", precioDia=" + precioDia +
                ", días alquiler=" + nDias() +
                ", coste total=" + costeTotal() +
                ", vehiculo=" + vehiculo +
                ", cliente=" + cliente +
                '}';
    }
}
