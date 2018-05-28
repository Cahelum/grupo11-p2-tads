package nodoSimple;

public class MyLinkedList<T> implements LinkedList<T> {

	private Nodo<T> first;

	public MyLinkedList() {

		this.first = null;

	}
	
	public void addCoord(T elemento, int coordenada) {

	

			Nodo<T> verNext = first;

			for (int i = 0; i < coordenada-1; i++) {
				
				verNext = verNext.getNext();
			}
			if (coordenada == 0) {
				
				addFirst(elemento);
				
			}else {
				Nodo<T> another = new Nodo<T>(elemento);
				another.setNext(verNext.getNext());
				verNext.setNext(another);
			}
		}

	
		
		
		
	

	public void add(T entero) {

		if (first == null) {

			first = new Nodo<T>(entero);

		} else {

			Nodo<T> another = new Nodo<T>(entero);
			Nodo<T> verNext = this.first;
			Nodo<T> noNulo = null;

			while (verNext != null) {
				noNulo = verNext;
				verNext = verNext.getNext();

			}
			noNulo.setNext(another);
		}

	}

	public int size() {
		Nodo<T> verNext = this.first;
		int contador = 0;
		while (verNext != null) {
            
            
			verNext = verNext.getNext();
			contador++;

		}
		return contador;
	}

	public boolean search(T entero) {

		Nodo<T> verNext = first;
		boolean v = false;
		while (verNext != null) {

			if (entero == verNext.getValor()) {
				v = true;
			}

			verNext = verNext.getNext();

		}

		return v;
	}

	public T getElementFrom(int entero) {

		T resultado = null;
		Nodo<T> verNext = first;

		if (entero == 0) {
			resultado = verNext.getValor();
		} else {
			for (int i = 0; i < entero; i++) {

				verNext = verNext.getNext();

			}
			resultado =verNext.getValor();
		}
		return resultado;
	}

	public void delete(int entero) {
		Nodo<T> verNext = first;
		Nodo<T> before = null;

		if (entero == 0) {
			if(first.getNext()!=null){
			before = verNext;
			verNext = verNext.getNext();
			before.setNext(verNext.getNext());
			before.setValor(verNext.getValor());
			}else{first=null;}

		} else {
			for (int i = 0; i < entero; i++) {
				before = verNext;
				verNext = verNext.getNext();
			}

			before.setNext(verNext.getNext());
		}

	}

	public void addFirst(T entero) {

		Nodo<T> another = new Nodo<T>(first.getValor());
		another.setNext(first.getNext());
		first.setValor(entero);
		first.setNext(another);

	}

}
