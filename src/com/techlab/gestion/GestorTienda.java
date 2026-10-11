package com.techlab.gestion;

import com.techlab.productos.Producto;
import com.techlab.util.Validador;

import java.util.ArrayList;
import java.util.List;

public class GestorTienda {

    private List<Producto> catalogo;

    public GestorTienda() {
        this.catalogo = new ArrayList<Producto>();
    }

    public List<Producto> getCatalogo() {
        return new ArrayList<Producto>(catalogo);
    }

    public void agregarProducto(Producto producto) {
        Validador.validarProducto(producto);
        catalogo.add(producto);
    }

    public boolean catalogoVacio() {
        return catalogo.isEmpty();
    }

    public Producto buscarProductoPorId(int id) {
        for (Producto producto : catalogo) {
            if (producto.getId() == id) {
                return producto;
            }
        }
        return null;
    }

    public boolean eliminarProductoPorId(int id) {
        Producto productoEncontrado = buscarProductoPorId(id);
        if (productoEncontrado == null) {
            return false;
        }
        return catalogo.remove(productoEncontrado);
    }

}
