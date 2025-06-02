package ar.edu.unq.po2.tp8.state.videojuego;

public class MaquinaDeVideoJuegos {
	private int fichas;
	private Estado state;
	public MaquinaDeVideoJuegos() {
		super();
		this.state = new EstadoSinFichas(this);
		this.fichas = 0;
	}

	public void ingresarFicha() {
		fichas++;
		if (fichas == 1) {
			state = new EstadoConUnaFicha(this);
		}else if(fichas == 2) {
			state = new EstadoConDosFichas(this);
		}
	}
	public int getFichas() {
		return fichas;
	}

	public void setFichas(int fichas) {
		this.fichas = fichas;
	}

	public void presionarBotonInicio() {
		state.presionarBotonInicio();
	}
	public void mostrarCartel() {
		System.out.println("Por favor ingrese fichas para comenzar.");
	}
	public void iniciarJuegoIndividual() {
        System.out.println("Juego para un jugador iniciado.");
        this.fichas = 0;
	}
	public void iniciarJuegoDosJugadores() {
        System.out.println("Juego para dos jugadores iniciado.");
        this.fichas = 0;
	}
    public void setState(Estado nuevoEstado) {
        this.state = nuevoEstado;
    }
	
	
}
