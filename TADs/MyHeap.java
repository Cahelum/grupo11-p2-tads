package uy.edu.prog.heaps;

public class MyHeap<K extends Comparable<K>, T> implements Heap<K, T> {

	NodeH<K, T>[] myList = new NodeH[10];
	
	public void add(K key, T data) {
   
		NodeH<K, T> node = new NodeH<>(key, data);
		int i = 0;
		if (myList[0] == null) {
			myList[0] = (node);
		} else {
			while (myList[i] != null && i < myList.length) {
				i++;
			}
			
			myList[i] = node;

			// Los hijos de i están en 2i+1 y 2i+2
			// El padre de i está en (i-1)/2
			boolean cambio=true;

			do {
				if (myList[i].getKey().compareTo(myList[(i - 1) / 2].getKey()) == 1) {
					NodeH<K, T> hijo = myList[i];
					NodeH<K, T> padre = myList[(i - 1) / 2];

					myList[i] = padre;
					myList[(i - 1) / 2] = hijo;

					i = (i - 1) / 2;

				}else{
					cambio=false;
				}
			} while (cambio==true);
			
		}

	}
	
	
	public NodeH<K,T> find(K key){
		int i=0;
		NodeH<K,T> oExit=null;
		while(myList[i]!=null && i<myList.length){
			
			if (myList[i].getKey().compareTo(key)==0){
				oExit=myList[i];
			}
            i++;
		}
		
		
		
		return oExit;
	}

}
