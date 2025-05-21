package ar.edu.unq.po2.tp4.ingreso.trabajadorTest;


import ar.edu.unq.po2.tp4.ingreso.Ingreso;
import ar.edu.unq.po2.tp4.ingreso.ingresoPorHorasExtras.IngresoPorHorasExtras ;
import ar.edu.unq.po2.tp4.ingreso.trabajador.Trabajador;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TrabajadorTest {
    @Test
    public void testCalcularPrecio() {
        Trabajador t1 = new Trabajador();
        t1.agregarIngreso(new Ingreso("Enero", "xd", 1800));
        t1.agregarIngreso(new Ingreso("Febrero", "xd", 1800));
        t1.agregarIngreso(new Ingreso("Marzo", "xd", 1800));
        t1.agregarIngreso(new Ingreso("Abril", "xd", 1800));
        t1.agregarIngreso(new Ingreso("Mayo", "xd", 1800));
        t1.agregarIngreso(new Ingreso("Junio", "xd", 1800));
        t1.agregarIngreso(new Ingreso("Julio", "xd", 1800));
        t1.agregarIngreso(new Ingreso("Agosto", "xd", 1800));
        t1.agregarIngreso(new Ingreso("Septiembre", "xd", 1800));
        t1.agregarIngreso(new Ingreso("Octubre", "xd", 1800));
        t1.agregarIngreso(new Ingreso("Noviembre", "xd", 1800));
        t1.agregarIngreso(new Ingreso("Diciembre", "xd", 1800));
        assertEquals(21600, t1.getTotalPercibido());
        assertEquals(432, t1.getImpuestoAPagar());
    }

    @Test
    public void testCalcularPrecioConExtras() {
        Trabajador t1 = new Trabajador();
        t1.agregarIngreso(new IngresoPorHorasExtras("Enero", "xd", 8132, 5));
        t1.agregarIngreso(new Ingreso("Febrero", "xd", 1800));
        t1.agregarIngreso(new IngresoPorHorasExtras("Marzo", "xd", 2130.81, 5));
        t1.agregarIngreso(new Ingreso("Abril", "xd", 1800));
        t1.agregarIngreso(new Ingreso("Mayo", "xd", 1800));
        t1.agregarIngreso(new IngresoPorHorasExtras("Junio", "xd", 1900.4, 5));
        t1.agregarIngreso(new Ingreso("Julio", "xd", 1800));
        t1.agregarIngreso(new Ingreso("Agosto", "xd", 1800));
        t1.agregarIngreso(new IngresoPorHorasExtras("Septiembre", "xd", 6000, 5));
        t1.agregarIngreso(new Ingreso("Octubre", "xd", 1800));
        t1.agregarIngreso(new IngresoPorHorasExtras("Noviembre", "xd", 16200.1, 5));
        t1.agregarIngreso(new IngresoPorHorasExtras("Diciembre", "xd", 20000.5, 5));
        assertEquals(65163.81, t1.getTotalPercibido());
        assertEquals(10800, t1.getTotalImponible());
        assertEquals(216, t1.getImpuestoAPagar());
    }
}