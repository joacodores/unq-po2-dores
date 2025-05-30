package ar.edu.unq.po2.tp6.solid.tdd;

public class Cliente {
	private String nombre;
	private String apellido;
	private String direccion;
	private int edad;
	private double efectivo;
	private double sueldoNetoMensual;
	private GestorSolicitudes banco;
	private Propiedad propiedad;
	
	public Cliente(String nombre, String apellido, String direccion, int edad, double sueldoNetoMensual, Propiedad p) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.edad = edad;
		this.sueldoNetoMensual = sueldoNetoMensual;
		this.efectivo = 0;
		this.banco = null ;
		this.propiedad = p;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getEfectivo() {
		return efectivo;
	}

	public void setEfectivo(double efectivo) {
		this.efectivo = efectivo;
	}

	public double getSueldoNetoMensual() {
		return sueldoNetoMensual;
	}

	public void setSueldoNetoMensual(double sueldoNetoMensual) {
		this.sueldoNetoMensual = sueldoNetoMensual;
	}

	public double getSueldoNetoAnual() {
		return sueldoNetoMensual * 12;
	}

	public void solicitarCreditoPersonal(double dinero, int plazoEnMeses) {
		SolicitudDeCreditoPersonal s = new SolicitudDeCreditoPersonal(this, dinero, plazoEnMeses);
		getBanco().registrarSolicitud(s);
		
	}
	
	public GestorSolicitudes getBanco() {
		return banco;
	}

	
	public Propiedad getPropiedad() {
		return propiedad;
	}

	public void setPropiedad(Propiedad propiedad) {
		this.propiedad = propiedad;
	}

	public void setBanco(GestorSolicitudes banco) {
		this.banco = banco;
	}
	
	
	
	
	
	
}
