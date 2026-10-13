package com.techlab;

import com.techlab.gestion.GestorTienda;
import com.techlab.ordenes.LineaOrden;
import com.techlab.ordenes.Orden;
import com.techlab.productos.Producto;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
        Producto cafe = new Producto("Café", 100, 10);
        Producto te = new Producto("Té", 50, 8);

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

        System.out.println("Prueba linea orden...");
        LineaOrden lineaOrden = new LineaOrden(cafe, 3);
        System.out.println(lineaOrden.getPrecioUnitarioAcordado());
        System.out.println(lineaOrden.calcularSubTotal());

        System.out.println("Prueba 2 de linea orden");
        try {
            LineaOrden lineaOrden1 = new LineaOrden(cafe, 0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Prueba 3 de linea orden");
        try {
            LineaOrden lineaOrden1 = new LineaOrden(null, 5);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Creo una nueva orden....");
        Orden nuevaOrden = new Orden();

        System.out.println("Total orden: " + nuevaOrden.calcularTotal());

        System.out.println("Agrego dos lineas a la orden");
        nuevaOrden.agregarLineaOrden(new LineaOrden(cafe, 10));
        nuevaOrden.agregarLineaOrden(new LineaOrden(te, 6));

        System.out.println("Total orden: " + nuevaOrden.calcularTotal());

        System.out.println("Agrego una linea orden nula...");
        try {
            nuevaOrden.agregarLineaOrden(new LineaOrden(null, 3));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Total orden: " + nuevaOrden.calcularTotal());

        System.out.println("Intento agregar una linea orden nula..");
        try {
            nuevaOrden.agregarLineaOrden(null);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Total orden: " + nuevaOrden.calcularTotal());

        */

        Scanner ingresoTeclado = new Scanner(System.in);

        int opcion;

        do {
            mostrarMenu();

            try {
                opcion = leerEntero(ingresoTeclado, "Introduce una opcion: ");

                switch (opcion) {
                    case 1:
                        System.out.println("");
                        break;
                    case 2:
                        System.out.println("");
                        break;
                    case 3:
                        System.out.println("");
                        break;
                    case 4:
                        System.out.println("");
                        break;
                    case 5:
                        System.out.println("");
                        break;
                    case 6:
                        System.out.println("");
                        break;
                    case 7:
                        System.out.println("Saliendo....");
                        break;
                    default:
                        System.out.println("Opcion ingresada incorrecta, intente nuevamente.");
                        System.out.println();
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Opcion ingresada incorrecta, ingrese un numero entero.");
                System.out.println();
                opcion = 0;
            }

        } while (opcion != 7);


    }

    public static int leerEntero(Scanner teclado, String mensaje) {
        System.out.print(mensaje);
        int valor = Integer.parseInt(teclado.nextLine().trim());
        return valor;
    }

    public static void mostrarMenu() {
        System.out.println("========================================");
        System.out.println("===== SISTEMA DE GESTIÓN - TECHLAB =====");
        System.out.println("========================================");
        System.out.println("\n1) Agregar producto");
        System.out.println("2) Listar productos");
        System.out.println("3) Buscar/Actualizar producto");
        System.out.println("4) Eliminar producto");
        System.out.println("5) Crear una orden");
        System.out.println("6) Listar ordenes");
        System.out.println("7) Salir");
        System.out.println();
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
