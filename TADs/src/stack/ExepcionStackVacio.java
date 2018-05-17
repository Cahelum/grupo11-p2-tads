package stack;
public class ExepcionStackVacio extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2357493443980935556L;
	public ExepcionStackVacio() {
		super();
	}
     public String toString(){
    	 return "el stack esta vacio";
     }
}
