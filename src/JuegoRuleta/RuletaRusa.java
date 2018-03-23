package JuegoRuleta;

public final class RuletaRusa {


	public static void main(String[] args) {
	
		Juego juego=new Juego(6);
		
		while(!(juego.finJuego())){
			
			juego.ronda();
		}
		
		System.out.println("el juego ha terminado");

	}

}
