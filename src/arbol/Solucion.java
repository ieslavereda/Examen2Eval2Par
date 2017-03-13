package arbol;

public class Solucion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArbolBinario arbol;
		Nodo a1, a2, a;

		a1 = ArbolBinario.nuevoArbol(ArbolBinario.nuevoArbol(null, "Maria", null), "Esperanza",	ArbolBinario.nuevoArbol(null, "Rodrigo", null));
		a2 = ArbolBinario.nuevoArbol(ArbolBinario.nuevoArbol(null, "Anyora", null), "M Jesus", ArbolBinario.nuevoArbol(null, "Abel", null));
		a = ArbolBinario.nuevoArbol(a1, "Esperanza", a2);
		arbol = new ArbolBinario(a);
		
		System.out.printf("El arbol tiene %s nodos internos.",contarNodosInternos(arbol.raiz));
	}

	public static int contarNodosInternos(Nodo a){
		if(a==null) return 0;
		else {
			if(a.subarbolIzdo()!=null || a.subarbolDcho()!=null) return 1 + contarNodosInternos(a.subarbolIzdo()) + contarNodosInternos(a.subarbolDcho());
			else return 0;
		}
	}

}
