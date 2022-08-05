package edu.umg;

import edu.umg.model.Taller;
import edu.umg.model.Vehiculo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Ingrese la marca del Vehiculo 1: ");
//        String marcaVehiculo = scanner.nextLine();
//        System.out.println("Ingrese la modelo del Vehiculo 1: ");
//        String modeloVehiculo = scanner.nextLine();
//        System.out.println("Ingrese el año del Vehiculo 1: ");
//        Number anoVehiculo = scanner.nextInt();

//        Vehiculo vehiculo1 = new Vehiculo(marcaVehiculo,modeloVehiculo, anoVehiculo);
        Vehiculo vehiculo1 = new Vehiculo("Kia","Rio", 2009);
        Vehiculo vehiculo2 = new Vehiculo("Nissan","Sentra", 1990);
        Vehiculo vehiculo3 = new Vehiculo("Toyota","Hillux", 2002);
        Vehiculo vehiculo4 = new Vehiculo("Lamborghini","Murcielago", 2020);
        Vehiculo vehiculo5 = new Vehiculo("Hyundai","Elantra", 2018);

        Taller tallerNombre = new Taller("Taller UMG, El Naranjo");
        tallerNombre.agregarVehiculoTaller(vehiculo1);
        tallerNombre.agregarVehiculoTaller(vehiculo2);
        tallerNombre.agregarVehiculoTaller(vehiculo3);
        tallerNombre.agregarVehiculoTaller(vehiculo4);
        tallerNombre.agregarVehiculoTaller(vehiculo5);

        tallerNombre.eliminarVehiculo(2);
        tallerNombre.eliminarVehiculo(1);

        tallerNombre.mostrarVehiculos();

//        tallerNombre.agregarPeliculaAcartelera(pelicula2);

//        carteleraPortales.modificarRatingDeUnaPelicula(1,"P16");



    }
}
