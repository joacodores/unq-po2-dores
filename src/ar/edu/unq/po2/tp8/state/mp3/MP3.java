package ar.edu.unq.po2.tp8.state.mp3;

import java.util.ArrayList;

public class MP3 {
	private Estado state;
	private ArrayList<Song> cancionesASeleccionar;
	private Song cancionSeleccionada;
	
	public MP3() {
		this.cancionesASeleccionar = new ArrayList<Song>();
		this.cancionSeleccionada = null;
		this.state = new EstadoSeleccionDeCanciones(this);
	}

	public Estado getState() {
		return state;
	}
	
	public void setState(Estado state) {
		this.state = state;
	}

	public ArrayList<Song> getCancionesASeleccionar() {
		return cancionesASeleccionar;
	}

	public void setCancionesASeleccionar(ArrayList<Song> cancionesASeleccionar) {
		this.cancionesASeleccionar = cancionesASeleccionar;
	}

	public Song getCancionSeleccionada() {
		return cancionSeleccionada;
	}
	
	public void agregarCancion(Song c) {
		getCancionesASeleccionar().add(c);
	}
	
	public void seleccionarCancion(Song c) {
		if (getCancionesASeleccionar().contains(c)) {
			this.cancionSeleccionada = c;
		}else {
			throw new IllegalStateException("La cancion no esta en la lista de canciones del MP3");
		}
	}

	public void reproducirCancion() {
		cancionSeleccionada.play();
	}
	public void pausarCancion() {
		cancionSeleccionada.pause();
	}
	public void stop() {
		cancionSeleccionada.stop();
	}
	public void botonPlay() {
		state.botonPlay();
	}
	public void botonPause() {
		state.botonPause();
	}
	public void botonStop() {
		state.botonStop();
	}
	
}
