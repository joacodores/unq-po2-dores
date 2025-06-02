package ar.edu.unq.po2.tp8.state.videojuego;

public class EstadoConDosFichas extends Estado {
	private MaquinaDeVideoJuegos maquinaDeVideoJuegos;
	
	public EstadoConDosFichas(MaquinaDeVideoJuegos maquinaDeVideoJuegos) {
		this.maquinaDeVideoJuegos = maquinaDeVideoJuegos;
	}
	@Override
	public void presionarBotonInicio() {
		getMaquinaDeVideoJuegos().iniciarJuegoDosJugadores();;
		getMaquinaDeVideoJuegos().setState(new EstadoSinFichas(getMaquinaDeVideoJuegos()));
	}
	public MaquinaDeVideoJuegos getMaquinaDeVideoJuegos() {
		return maquinaDeVideoJuegos;
	}
	public void setMaquinaDeVideoJuegos(MaquinaDeVideoJuegos maquinaDeVideoJuegos) {
		this.maquinaDeVideoJuegos = maquinaDeVideoJuegos;
	}
}
