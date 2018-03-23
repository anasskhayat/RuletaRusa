package JuegoRuleta;

public class Revolver {
	
	private int posicionBalaActual;
	private int posicionBala;
	
	public  Revolver(){
		
		posicionBalaActual=Metodos.generarNumeroAleatorio(1, 6);
		posicionBala=Metodos.generarNumeroAleatorio(1,6);
	}
		
		public boolean dispara() {
			
			boolean exito=false;
			
			if(posicionBalaActual==posicionBala) {
				exito=true;
			}
			siguienteBala();
			
			return exito;
		}

		private void siguienteBala() {
			
			if(posicionBalaActual==6) {
				posicionBalaActual=1;
			}else {
				posicionBalaActual++;
			}
			
		}

		public String toString() {
			return "posicion de bala actual"+posicionBalaActual+"posicion de la bala "+posicionBala;
		}
		
	}
		













