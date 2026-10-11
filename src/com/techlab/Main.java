package com.techlab;

import com.techlab.gestion.GestorTienda;
import com.techlab.productos.Producto;

public class Main {

    public static void main(String[] args) {


        Producto cafe = new Producto("Café", 2500.50, 10);
        Producto te = new Producto("Té", 1800.00, 8);

        System.out.println(cafe);
        System.out.println(te);

        try {
            Producto invalido = new Producto("Café", 0, 0);
            System.out.println(invalido);
        } catch (IllegalArgumentException e) {
            System.out.println(String.format("No se pudo crear el producto: %s", e.getMessage()));
        }

        System.out.printf("El programa continúa...");

        // Muestro el precio de un producto por consola
        double precioCafe = cafe.getPrecio();
        System.out.println(String.format("Precio consultado: %.2f", precioCafe));

        // Creo una tienda
        GestorTienda tienda = new GestorTienda();

        // Verifico la cantidad de productos que contiene el catalogo
        System.out.println("Cantidad de productos: " + tienda.getCatalogo().size());


        System.out.println("A continuacion muestro el catalogo...");
        mostrarCatalogo(tienda);

        System.out.println("Agrego un producto.");
        tienda.agregarProducto(cafe);

        System.out.println("Cantidad de productos: " + tienda.getCatalogo().size());

        try {
            tienda.agregarProducto(null);
        } catch (IllegalArgumentException e) {
            System.out.println("No se pudo agregar el producto: " + e.getMessage());
        }

        System.out.println("Cantidad de productos: " + tienda.getCatalogo().size());

        System.out.println("El catalogo esta vacio: " + tienda.catalogoVacio());

        tienda.agregarProducto(te);
        mostrarCatalogo(tienda);

        mostrarProducto(tienda, 1);

        System.out.println("El tamaño inicial del catalogo es: " + tienda.getCatalogo().size());

        eliminarProducto(tienda, 2);

        System.out.println("El tamaño inicial del catalogo luego de eliminar el id 2 es: "
                + tienda.getCatalogo().size());

        eliminarProducto(tienda, 2);


    }

    public static void mostrarCatalogo(GestorTienda tienda) {
        if (tienda.catalogoVacio()) {
            System.out.println("El catalogo esta vacio.");
        } else {
            for (Producto producto : tienda.getCatalogo()) {
                System.out.println(producto);
            }
        }
    }

    public static void mostrarProducto(GestorTienda tienda, int id) {
        Producto productoEncontrado = tienda.buscarProductoPorId(id);
        if (productoEncontrado == null) {
            System.out.println("Producto no encontrado.");
        } else {
            System.out.println(productoEncontrado);
        }
    }

    public static void eliminarProducto(GestorTienda tienda, int id) {
        if (tienda.eliminarProductoPorId(id)) {
            System.out.println("Producto Eliminado.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }
}
