package org.example;

import java.util.ArrayList;

public class Flota {
    private String nombreZona;
    private ArrayList<Vehiculo> vehiculos;

    public Flota(String nombreZona) {
        this.nombreZona = nombreZona;
        this.vehiculos = new ArrayList<>();
    }

    public String getNombreZona() {
        return nombreZona;
    }

    public void setNombreZona(String nombreZona) {
        this.nombreZona = nombreZona;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public boolean addVehiculo(Vehiculo vehiculo){
        //return vehiculos.contains(vehiculo), y habría que modificar con un @override el metodo equals porque es con el que trabaja el contains por debajo
        //Si no encuentra un vehiculo con la misma matrícula, sale del bucle
        for(Vehiculo veh : this.vehiculos){
            //para comparar objetos se ha de usar equals, si fuesen valores literales se usa ==
            if(veh.getMatricula().equals(vehiculo.getMatricula())){
                return false;
            }else{
                break;
            }
        }
        this.vehiculos.add(vehiculo);
        return true;
    }

    public boolean removeVehiculo(String matricula){
        for(Vehiculo veh : this.vehiculos){
            if(veh.getMatricula().equals(matricula)){
                vehiculos.remove(veh);
                return true;
            }
        }
        return false;
    }

    public String listVehiculos(){

        String str = "Flota de " + this.nombreZona;
        if(vehiculos.isEmpty()){
            str += " no tiene vehiculos.";
        }else{
            str += " tiene los siguientes vehiculos: \n";
            for(Vehiculo veh : this.vehiculos){
                str += veh.getMarca() + " " + "\n";
            }
        }
        return str;

    }
    @Override //Si hiciéramos esto, vehiculos nos estaría enseñando la posición de memoria y no la lista en si.
    public String toString() {
        return "Flota{" +
                "nombreZona='" + nombreZona + '\'' +
                //", vehiculos=" + vehiculos +
                '}';
    }
}
