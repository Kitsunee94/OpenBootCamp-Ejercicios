package com.ejercicio;

public class Precio {

    public static void main(String[] args) {

        double precioOriginal = 100.99d;
        double iva = 5.50d;
        calcularPrecioConIva(precioOriginal,iva);
    }

    static void calcularPrecioConIva(double precioOriginal, double iva) {
        System.out.println(precioOriginal+iva);
    }

}