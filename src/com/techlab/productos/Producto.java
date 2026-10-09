package com.techlab.productos;

public class Producto {

    private static int siguienteId = 1;
    private final int id;
    private String nombre;
    private double precio;
    private int cantidadStock;

    public Producto(String nombre, double precio, int cantidadStock) {
        this.id = siguienteId++;

        this.nombre = nombre;
        this.precio = precio;
        this.cantidadStock = cantidadStock;
    }

    @Override
    public String toString() {
        return String.format("ID: %d | Nombre: %s | Precio: %.2f | Stock: %d",
                id, nombre, precio, cantidadStock);
    }

}
