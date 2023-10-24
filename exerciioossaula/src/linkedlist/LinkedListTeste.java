package linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTeste {

	public static void main(String[] args) {
		LinkedList<String> cars = new LinkedList<String>();
		ArrayList<String> lista = new ArrayList<>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		cars.remove();
		cars.removeLast();
		cars.size();
		lista.size();
		
//	    cars.add(null);
		System.out.println(cars);
	}

}
