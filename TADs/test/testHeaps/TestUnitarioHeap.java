package uy.edu.prog.testHeap;

import static org.junit.Assert.*;

import org.junit.Test;

import uy.edu.prog.heaps.Heap;
import uy.edu.prog.heaps.MyHeap;

public class TestUnitarioHeap {
	 
 public static Heap<Integer,String> h;
	@Test
	public void testAdd() {
		
		h=new MyHeap<>();
		
		h.add(100,"primer ingresado" );
		h.add(60,"casa1");
		h.add(70,"casa dos pisos");
		h.add(40,"izuierda");
		h.add(30,"izuierda");
		h.add(45,"izuierda");
		
		
		assertEquals("casa dos pisos", h.find(70).getData());
		
		
	}

}
