package edu.umg.model;


public class Taller {
    private String nombre;
    private Vehiculo vehiculos[];
    int indice;

    public Taller(String nombre) {
        this.nombre = nombre;
        vehiculos = new Vehiculo[5];
        indice=0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarVehiculoTaller(Vehiculo vehAgregar){
        vehiculos[indice]=vehAgregar;
        System.out.println( "Se agrego el vehiculo al taller: " + vehiculos[indice].getMarca() );
        indice++;

    }

    public void eliminarVehiculo(int indice){
        vehiculos[indice] = new Vehiculo("","",0);
    }

    public void mostrarVehiculos(){
        System.out.println(vehiculos.length);
        for (int i = 0; i < vehiculos.length; i++) {
            System.out.println( "Vehiculo " + i + ": " +vehiculos[i].getMarca() + " " + vehiculos[i].getModelo() + " " + vehiculos[i].getAno() );
        }
    }
}
