package JuegoRuleta;

public class Metodos {
  
	public static int generarNumeroAleatorio(int minimo, int maximo) {
		int num = (int) Math.floor(Math.random()*(maximo - minimo +1)+(minimo)); 
	return num;
	}

}
