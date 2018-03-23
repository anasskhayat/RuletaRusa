package JuegoRuleta;

public class Jugador {
	
	private int id;
	private String nombre;
    private boolean vive;
    
    public Jugador(int id) {
    	this.id=id;
    	this.nombre="jugador "+id;
    	this.vive=true;
    }	
    public void dispara (Revolver r){
    		System.out.println("el " + nombre + " se apunta con la pistola ");
    		if(r.dispara()) {
    			this.vive=false;//jugador muere	
    			System.out.println("jugadro "+ nombre +" ha muerto");
    		}else {
    			System.out.println("jugadro "+ nombre + " salvado");
    		}
    	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isVive() {
		return vive;
	}
	
	public void setVive(boolean vive) {
		this.vive = vive;
	}
    
    
    	
    }
	

