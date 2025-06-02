package ar.edu.unq.po2.tp8.state.mp3;

public class EstadoCancionPausada implements Estado{
	private MP3 mp3;
	public EstadoCancionPausada(MP3 mp3) {
		this.mp3 = mp3;
	}

	@Override
	public void botonPlay() {
		throw new IllegalStateException("Ya hay una cancion reproduciendose"); 

	}

	@Override
	public void botonPause() {
		mp3.reproducirCancion();
		mp3.setState(new EstadoReproduciendoCancion(mp3));

	}

	@Override
	public void botonStop() {
		mp3.stop();
		mp3.setState(new EstadoSeleccionDeCanciones(mp3));

	}
}
