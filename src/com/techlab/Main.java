package com.techlab;

import com.techlab.productos.Producto;

public class Main {

    public static void main(String[] args) {

        Producto cafe = new Producto("Café", 2500.50, 10);
        Producto te = new Producto("Té", 1800.00, 8);

        System.out.println(cafe);
        System.out.println(te);

    }
}
