package JuegoRuleta;

public class Juego {

	private Jugador[] jugadores;
	private Revolver revolver;

	public Juego(int numJugador) {

		jugadores = new Jugador[comprobarJugadore(numJugador)];
		
		crearJugador();
		revolver = new Revolver();
	}

	public int comprobarJugadore(int numJugador) {
		if (!(numJugador >= 1 && numJugador <= 6)) {
			numJugador = 6;
		}
		return numJugador;
	}
	
	public void crearJugador() {
		for(int i=0;i<jugadores.length;i++) {
			jugadores[i]=new Jugador(i+1);
		}
	}

	public boolean finJuego() {

		for (int i=0;i<jugadores.length;i++) {
			if (jugadores[i].isVive()) {
				return true;
			}
		}
		return false;

	}
	public void ronda() {
		for(int i=0;i<jugadores.length;i++) {
			jugadores[i].dispara(revolver);
		}
	}
}
