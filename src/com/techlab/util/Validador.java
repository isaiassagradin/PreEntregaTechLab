package com.techlab.util;

/*
* Clase con métodos de validacion reutilizables
* Todos los métodos son estáticos: no necesitamos crear una instancia de validador
* para usarlos. Se invocan directamente.
* */

import com.techlab.productos.Producto;

public class Validador {
    /*
    * Validaciones de datos del producto.
    * Estos métodos lanzan una excepción si el dato es invalido.
    * No retornan nada: si terminan sin lanzar la excepción el dato es valido.
    * */
    public static void validarNombre(String nombre) {
        // Un nombre nulo o vacío no representa un producto valido
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "El nombre no puede estar vacio."
            );
        }
    }

    public static void validarPrecio(double precio) {
        // Un precio inferior a 0 no representa un producto valido. Aceptamos 0.
        if (precio < 0) {
            throw new IllegalArgumentException(
                    "El precio no puede ser negativo."
            );
        }
    }

    public static void validarCantidad(int cantidad) {
        if (cantidad < 1) {
            throw new IllegalArgumentException(
                    "La cantidad ingresada debe ser mayor a 0."
            );
        }
    }

    public static void validarCantidadStock(int stock) {
        // Un stock negativo no representa a un producto valido.
        if (stock < 0) {
            throw new IllegalArgumentException(
                    "El stock no puede ser negativo."
            );
        }
    }

    public static void validarObjeto(Object objeto, String nombreObjeto) {
        if (objeto == null) {
            throw new IllegalArgumentException(
                    nombreObjeto.trim() + " no puede ser nulo."
            );
        }
    }

}
