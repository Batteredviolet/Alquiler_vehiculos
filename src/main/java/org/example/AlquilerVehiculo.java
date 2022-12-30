package org.example;
import java.time.*;
import java.time.format.*;
import java.util.concurrent.TimeUnit;

public class AlquilerVehiculo {
    public static void main(String[] args) {
        //Fechas
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fecha1 = LocalDate.parse("30/12/2021", dtf);
        LocalDate fecha2 = LocalDate.parse("30/08/2022", dtf);
        LocalDate fecha3 = LocalDate.parse("12/01/2021", dtf);
        LocalDate fecha4 = LocalDate.parse("30/01/2021", dtf);
        LocalDate fecha5 = LocalDate.parse("30/01/2022", dtf);
        LocalDate fecha6 = LocalDate.parse("15/08/2022", dtf);
        float precioDia1 = 30.8f;
        float precioDia2 = 80.8f;
        float precioDia3 = 51.8f;

        //Crear objetos y mostrarlos por terminal
        Coche coche = new Coche("3903DRF", "Peugeot", "206", 5, 5);
        Moto moto = new Moto("5465PTF", "Toyota", "vs5", 110);
        Camion camion = new Camion("6666QWE", "Seat", "v3", 350);
        Cliente cliente1 = new Cliente("J16660631", "Xu Pamela");
        Cliente cliente2 = new Cliente("G15245214", "Benito Camela");
        Cliente cliente3 = new Cliente("G15245333", "Paco Mer");
        ContratoAlquiler contrato1 = new ContratoAlquiler(fecha1, fecha2, precioDia1, coche, cliente1);
        ContratoAlquiler contrato2 = new ContratoAlquiler(fecha3, fecha4, precioDia2, moto, cliente2);
        ContratoAlquiler contrato3 = new ContratoAlquiler(fecha5, fecha6, precioDia3, camion, cliente3);

        System.out.println("Contrato 1 => " + contrato1);
        System.out.println("Contrato 2 => " + contrato2);
        System.out.println("Contrato 3 => " + contrato3);



        /*
            float daysBetween1 = Duration.between(fecha1, fecha2).toDays();
            float daysBetween2 = Duration.between(fecha3, fecha4).toDays();
            float daysBetween3 = Duration.between(fecha5, fecha6).toDays();
        **/


    }
}