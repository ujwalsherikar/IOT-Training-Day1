package TrainingDay4;

import java.util.Vector;
public class VectorConstructor1 {
	public static void main(String[] args) {
		Vector vector = new Vector();
		vector.add("A");
		vector.add("B");
		vector.add("C");
		vector.add("D");
		vector.add("E");
		vector.add("F");
		vector.add("G");
		vector.add("H");
		vector.add("I");
		vector.add("J");
		vector.add("K");
		System.out.println("No of elements in the vector: " + vector.size());
		System.out.println("Capacity of the vector: " + vector.capacity());
		System.out.println("Values stored in vector: " + vector);
		vector.trimToSize();
		System.out.println("After trimming......");
		System.out.println("No of elements in the vector: " + vector.size());
		System.out.println("Capacity of the vector: " + vector.capacity());
		System.out.println("Values stored in vector: " + vector);
	}
}