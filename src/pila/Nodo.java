package pila;

public class Nodo {
	protected int dato;
	protected Nodo siguiente;
	protected Nodo anterior;
	
	public Nodo(int dato){
		this.dato = dato;
		siguiente = null;
		anterior = null;
	}
	
	public Nodo(Nodo q){
		dato = q.getDato();
		siguiente = null;
		anterior = null;
	}
	
	public int getDato() {
		return dato;
	}

	public Nodo getSiguiente() {
		return siguiente;
	}

	public Nodo getAnterior() {
		return anterior;
	}

	public void setDato(int dato) {
		this.dato = dato;
	}

	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}

	public void setAnterior(Nodo anterior) {
		this.anterior = anterior;
	}

	public String toString(){
		return Integer.toString(dato);
	}
}
