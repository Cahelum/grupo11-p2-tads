package uy.edu.prog.heaps;

public interface Heap<K extends Comparable<K>,T> {
	
	public void add(K key, T data);
	public NodeH<K,T> find(K key);
	//public NodeH<K,T> findMax(K key);
	//public NodeH<K,T> findMin(K key);
	

}
