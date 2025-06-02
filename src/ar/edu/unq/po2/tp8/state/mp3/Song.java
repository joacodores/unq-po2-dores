package ar.edu.unq.po2.tp8.state.mp3;

public class Song {
	private String nombreCancion;
	
	public Song(String n) {
		this.nombreCancion = n;
	}
	public void play() {
		System.out.println("reproduciendo cancion "+ nombreCancion);
	}
	public void pause() {
		System.out.println("cancion "+ nombreCancion + "pausada");
	}
	public void stop() {
		System.out.println("Selecciona una cancion para reproducir");
	}
}
