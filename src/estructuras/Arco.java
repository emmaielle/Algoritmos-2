package estructuras;

public class Arco {
	
	private Integer distancia; // ser� el peso?
	private Punto inicio;
	private Punto fin;
	private boolean existe;
	
	public Integer getDistancia() {
		return this.distancia;
	}

	public void setDistancia(Integer distancia) {
		this.distancia = distancia;
	}
	
	public boolean isExiste() {
		return existe;
	}

	public void setExiste(boolean existe) {
		this.existe = existe;
	}
	
	public Arco(){
		this.existe = false;
	}
	
	public Arco(Integer dist, Punto inicio, Punto fin){
		this.distancia = dist;
		this.inicio = inicio;
		this.fin = fin;
		this.existe = true;
	}

	public Punto getInicio() {
		return inicio;
	}

	public void setInicio(Punto inicio) {
		this.inicio = inicio;
	}

	public Punto getFin() {
		return fin;
	}

	public void setFin(Punto fin) {
		this.fin = fin;
	}

	


}
