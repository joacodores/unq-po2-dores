package ar.edu.unq.po2.tp2.empleado.empleadoTemporario;
import ar.edu.unq.po2.tp2.empleado.Empleado;
import java.time.LocalDate;

public class EmpleadoTemporario extends Empleado {
   private LocalDate fechaDeDesignacionAPlantaTemporaria;
   private int cantidadDeHorasExtras;

   public EmpleadoTemporario(String var1, String var2, String var3, LocalDate var4, double var5, LocalDate var7, int var8) {
      super(var1, var2, var3, var4, var5);
      this.fechaDeDesignacionAPlantaTemporaria = var7;
      this.cantidadDeHorasExtras = var8;
   }

   public double sueldoBruto() {
      return this.sueldoBasico + (double)(this.cantidadDeHorasExtras * 40);
   }

   public double extraPorSerMayorDe50() {
      return this.edad() > 50 ? 25.0 : 0.0;
   }

   public double retencionPorObraSocial() {
      return this.sueldoBruto() * 0.1 + this.extraPorSerMayorDe50();
   }

   public double retencionPorAportes() {
      return this.sueldoBruto() * 0.1 + (double)(this.cantidadDeHorasExtras * 5);
   }
}