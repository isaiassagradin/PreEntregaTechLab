package com.techlab.ordenes;

import com.techlab.productos.Producto;
import com.techlab.util.Validador;

public class LineaOrden {
    private Producto producto;
    private int cantidad;
    private double precioUnitarioAcordado;

    public LineaOrden(Producto producto, int cantidad) {
        Validador.validarObjeto(producto, "El producto");
        Validador.validarCantidad(cantidad);

        this.producto = producto;
        this.cantidad = cantidad;
        precioUnitarioAcordado = producto.getPrecio();
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioUnitarioAcordado() {
        return precioUnitarioAcordado;
    }

    public double calcularSubTotal() {
        return precioUnitarioAcordado * cantidad;
    }

}
