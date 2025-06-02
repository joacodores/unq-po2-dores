package ar.edu.unq.po2.tp8.state.mp3;

public class EstadoSeleccionDeCanciones implements Estado{
	
	private MP3 mp3;
	public EstadoSeleccionDeCanciones(MP3 m) {
		this.mp3 = m;
	}
	@Override
	public void botonPlay() {
		mp3.reproducirCancion();
		mp3.setState(new EstadoReproduciendoCancion(mp3));
	}
	@Override
	public void botonPause() {
		throw new IllegalStateException("Elige una cancion para reproducir!");
	}
	@Override
	public void botonStop() {
		mp3.getCancionSeleccionada().stop();
	}
}
