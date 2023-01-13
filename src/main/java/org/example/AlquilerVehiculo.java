package org.example;
import java.time.*;
import java.time.format.*;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class AlquilerVehiculo {

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
    public static void main(String[] args) {
        init();



    }

    public static void init(){
        VehiculosRent central = new VehiculosRent("J16660631", "PacosRent");
        //Lista para añadir vehiculo
        //Eliminar vehiculo
        //Listar vehiculo
        //Mostrar agencias
        //Cargar datos
        //Salir
        int opcion;

        do{
            opcion = menu();
            switch(opcion){
                case 0: {
                    System.out.println("Se ha escogido la opción de salir.");
                    break;
                }
                case 1: {
                    addVehiculoFlota();
                    break;
                }
                case 2: {
                    removeVehiculoFlota();
                    break;
                }
                case 3: {
                    listVehiculosFlota();
                    break;
                }
                case 4: {
                    listAgencias(central);
                    break;
                }
                case 5: {
                    cargarDatos(central);
                    break;
                }
                default:
                    System.out.println("Escoge una opción correcta.");

        }
        }while(opcion != 0);
    }

    private static void listAgencias(VehiculosRent central) {
        //TODO Listar todas las agencias
        //System.out.println(central.getAgencias());
        for(Agencia ag : central.getAgencias()){
            System.out.println(ag.getNombre());
            System.out.println(ag.getFlota().getNombreZona());
            System.out.println(ag.getFlota().getVehiculos());

        }
    }

    private static void listVehiculosFlota() {

    }

    private static void removeVehiculoFlota() {

    }

    private static void addVehiculoFlota() {
    }

    public static int menu(){
        System.out.println("1. Añadir vehiculo");
        System.out.println("2. Eliminar vehiculo");
        System.out.println("3. Listar vehiculos");
        System.out.println("4. Mostrar agencias");
        System.out.println("5. Cargar datos");
        System.out.println("0. Salir");
        System.out.println("Opcion: ");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public static void cargarDatos(VehiculosRent central){
        cargarFlotas(central);
        cargarVehiculos(central);
        cargarAgencias(central);
    }


    /*
    public void cargarClientes(){
        Cliente cliente1 = new Cliente("J16660631", "Xu Pamela");
        Cliente cliente2 = new Cliente("G15245214", "Benito Camela");
        Cliente cliente3 = new Cliente("G15245333", "Paco Mer");
    }
    */

    public static void cargarFlotas(VehiculosRent central){
        Flota flotaRoja = new Flota("Zona Roja");
        Flota flotaAzul = new Flota("Zona Azul");
        Flota flotaVerde = new Flota("Zona Verde");
        central.addFlota(flotaRoja);
        central.addFlota(flotaAzul);
        central.addFlota(flotaVerde);
    }
    public static void cargarVehiculos(VehiculosRent central){
        //Crear objetos y mostrarlos por terminal
        Coche coche = new Coche("3903DRF", "Peugeot", "206", 5, 5);
        Moto moto = new Moto("5465PTF", "Toyota", "vs5", 110);
        Camion camion = new Camion("6666QWE", "Seat", "v3", 350);
        central.getFlotas().get(0).addVehiculo(coche);
        central.getFlotas().get(1).addVehiculo(camion);
        central.getFlotas().get(2).addVehiculo(moto);
    }
    private static void cargarAgencias(VehiculosRent central) {
        //Reciclamos un objeto, para trabajar solo en un espacio de memoria en concreto
        //ESTUDIAR ESTA PARTE CON DETENIMIENTO
        Agencia ag;
        ag = new Agencia("A1", central.getFlotas().get(0));
        central.addAgencia(ag);
        ag = new Agencia("A2", central.getFlotas().get(1));
        central.addAgencia(ag);
        ag = new Agencia("A3", central.getFlotas().get(2));
        central.addAgencia(ag);
    }

}