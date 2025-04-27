package ar.edu.unq.po2.tp2.empleado.empleadoPermanente;
import ar.edu.unq.po2.tp2.empleado.Empleado;
import java.time.LocalDate;

public class EmpleadoPermanente extends Empleado {
   private int cantidadDeHijos;
   private int antigüedad;

   public EmpleadoPermanente(String var1, String var2, String var3, LocalDate var4, double var5, int var7, int var8) {
      super(var1, var2, var3, var4, var5);
      this.cantidadDeHijos = var7;
      this.antigüedad = var8;
   }

   public boolean tieneConyuge() {
      return this.estadoCivil.equals("Casado");
   }

   public double salarioFamiliar() {
      int var1 = this.cantidadDeHijos * 150;
      int var2 = this.tieneConyuge() ? 100 : 0;
      return (double)(var1 + var2);
   }

   public double sueldoBruto() {
      return this.sueldoBasico + this.salarioFamiliar() + (double)(50 * this.antigüedad);
   }

   public double retencionPorObraSocial() {
      return this.sueldoBruto() * 0.1 + (double)(this.cantidadDeHijos * 20);
   }

   public double retencionPorAportes() {
      return this.sueldoBruto() * 0.15;
   }
}