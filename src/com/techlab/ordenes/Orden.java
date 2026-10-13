package com.techlab.ordenes;

import com.techlab.util.Validador;

import java.util.ArrayList;
import java.util.List;

public class Orden {

    private static int siguienteId = 1;
    private final int id;
    private List<LineaOrden> lineasOrden;

    public Orden() {
        this.id = siguienteId++;
        this.lineasOrden = new ArrayList<LineaOrden>();
    }

    public int getId() {
        return id;
    }

    public List<LineaOrden> getLineasOrden() {
        return new ArrayList<LineaOrden>(lineasOrden);
    }

    public void agregarLineaOrden(LineaOrden lineaOrden) {
        Validador.validarObjeto(lineaOrden, "La Linea Orden");
        lineasOrden.add(lineaOrden);
    }

    public double calcularTotal() {
        double importeTotal = 0;
        for (LineaOrden lineaOrden : lineasOrden) {
            importeTotal += lineaOrden.calcularSubTotal();
        }
        return importeTotal;
    }

}
