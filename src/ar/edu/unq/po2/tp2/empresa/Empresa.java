package ar.edu.unq.po2.tp2.empresa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.po2.tp2.empleado.Empleado;

public class Empresa {
   private String nombreDeEmpresa;
   private String cuit;
   private List<Empleado> empleados;

   public Empresa(String var1, String var2) {
      this.nombreDeEmpresa = var1;
      this.cuit = var2;
      this.empleados = new ArrayList<Empleado>();
   }

   public void agregarEmpleado(Empleado var1) {
      this.empleados.add(var1);
   }

   public double calcularTotalSueldosNetos() {
      return this.empleados.stream().mapToDouble(Empleado::sueldoNeto).sum();
   }

   public double calcularTotalSueldosBrutos() {
      return this.empleados.stream().mapToDouble(Empleado::sueldoBruto).sum();
   }

   public double calcularTotalRetenciones() {
      return this.empleados.stream().mapToDouble(Empleado::retenciones).sum();
   }

   public void liquidarSueldos() {
      this.empleados.forEach((var0) -> {
         System.out.println("Recibo De Haberes");
         System.out.println("----------------------");
         System.out.println("Fecha De Emision: " + String.valueOf(LocalDate.now()));
         System.out.println("Nombre del Empleado: " + var0.getNombre());
         System.out.println("Direccion: " + var0.getDireccion());
         System.out.println("Sueldo Bruto: " + var0.sueldoBruto());
         System.out.println("Sueldo Neto: " + var0.sueldoNeto());
      });
   }
}