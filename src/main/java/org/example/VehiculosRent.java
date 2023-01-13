package org.example;

import java.util.ArrayList;

public class VehiculosRent {
    private String nif;
    private String nombre;
    private ArrayList<Agencia> agencias;
    private ArrayList<Cliente> clientes;
    private ArrayList<Flota> flotas;

    public VehiculosRent(String nif, String nombre) {
        this.nif = nif;
        this.nombre = nombre;
        this.agencias = new ArrayList();
        this.clientes = new ArrayList();
        this.flotas = new ArrayList();
    }
    
    public boolean addFlota(Flota flota){
        for(Flota fl : flotas){
            if(fl.getNombreZona().equals(flota.getNombreZona()))
                return false;
        }
        this.flotas.add(flota);
        return true;
    }

    public boolean addAgencia(Agencia agencia){
        for(Agencia ag : agencias){
            if(ag.getNombre().equals(agencia.getNombre()))
                return false;
        }
        this.agencias.add(agencia);
        return true;
    }

    public boolean addCliente(Cliente cliente){
        for(Cliente cl : clientes){
            if(cl.getNombre().equals(cliente.getNombre()))
                return false;
        }
        this.clientes.add(cliente);
        return true;
    }
    
    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Agencia> getAgencias() {
        return agencias;
    }

    public void setAgencias(ArrayList<Agencia> agencias) {
        this.agencias = agencias;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Flota> getFlotas() {
        return flotas;
    }

    public void setFlotas(ArrayList<Flota> flotas) {
        this.flotas = flotas;
    }

    @Override
    public String toString() {
        return "VehiculosRent{" +
                "nif='" + nif + '\'' +
                ", nombre='" + nombre + '\'' +
                ", agencias=" + agencias +
                ", clientes=" + clientes +
                ", flotas=" + flotas +
                '}';
    }
}
