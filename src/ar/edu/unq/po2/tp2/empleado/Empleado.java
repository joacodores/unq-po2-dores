package ar.edu.unq.po2.tp2.empleado;

import java.time.LocalDate;
import java.time.Period;

public abstract class Empleado {
   protected String nombre;
   protected String direccion;
   protected String estadoCivil;
   protected LocalDate fechaDeNacimiento;
   protected double sueldoBasico;
   
   public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getDireccion() {
	return direccion;
}

public void setDireccion(String direccion) {
	this.direccion = direccion;
}

public String getEstadoCivil() {
	return estadoCivil;
}

public void setEstadoCivil(String estadoCivil) {
	this.estadoCivil = estadoCivil;
}

public LocalDate getFechaDeNacimiento() {
	return fechaDeNacimiento;
}

public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
	this.fechaDeNacimiento = fechaDeNacimiento;
}

public double getSueldoBasico() {
	return sueldoBasico;
}

public void setSueldoBasico(double sueldoBasico) {
	this.sueldoBasico = sueldoBasico;
}

public Empleado(String var1, String var2, String var3, LocalDate var4, double var5) {
      this.nombre = var1;
      this.direccion = var2;
      this.estadoCivil = var3;
      this.fechaDeNacimiento = var4;
      this.sueldoBasico = var5;
   }

   public int edad() {
      return Period.between(this.fechaDeNacimiento, LocalDate.now()).getYears();
   }

   public abstract double sueldoBruto();

   public abstract double retencionPorObraSocial();

   public abstract double retencionPorAportes();

   public double retenciones() {
      return this.retencionPorAportes() + this.retencionPorObraSocial();
   }

   public double sueldoNeto() {
      return this.sueldoBruto() - this.retenciones();
   }
}
