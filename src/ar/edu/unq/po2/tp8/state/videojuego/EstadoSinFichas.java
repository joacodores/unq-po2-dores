package ar.edu.unq.po2.tp8.state.videojuego;

public class EstadoSinFichas extends Estado {
	private MaquinaDeVideoJuegos maquinaDeVideoJuegos;
	
	public EstadoSinFichas(MaquinaDeVideoJuegos maquinaDeVideoJuegos) {
		this.maquinaDeVideoJuegos = maquinaDeVideoJuegos;
	}
	@Override
	public void presionarBotonInicio() {
		getMaquinaDeVideoJuegos().mostrarCartel();
	}
	public MaquinaDeVideoJuegos getMaquinaDeVideoJuegos() {
		return maquinaDeVideoJuegos;
	}
	public void setMaquinaDeVideoJuegos(MaquinaDeVideoJuegos maquinaDeVideoJuegos) {
		this.maquinaDeVideoJuegos = maquinaDeVideoJuegos;
	}
}
