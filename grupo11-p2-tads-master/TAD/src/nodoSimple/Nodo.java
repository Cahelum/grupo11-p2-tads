package nodoSimple;

public class Nodo<T> {

	private T valor;
	private Nodo next;

	public Nodo(T valor) {
		next = null;
		this.valor = valor;

	}

	public T getValor() {

		return valor;
	}

	public void setValor(T valor) {
		this.valor = valor;
	}

	public Nodo getNext() {
		return next;
	}

	public void setNext(Nodo next) {

		this.next = next;
	}

}
