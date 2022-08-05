package edu.umg.model;

public class Vehiculo {

    private String marca;
    private String modelo;
    private Number ano;

    public Vehiculo(String marca, String modelo, Number ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Number getAno() {
        return ano;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(Number ano) {
        this.ano = ano;
    }
}
