//import java.util.ArrayList;

/*
Andrew Kalathra
COSC 2336-01
Instructor: Dr. Jiangjiang Liu
Programming Assignment 6
Due:  10/10/22
This program will be able to sort a list 
from minimum to maximum using a min-heap
*/
//import java.util.Comparator;

public class MinHeapAndrewKalathra {
	public static void main(String[] args) {
		/** test with Integers */
		Integer[] myIntegers = { 8, 9, 2, 3, 4, 1, 5, 6, 7 };
		System.out.println("Unsorted Integers in the array: ");
		for (int i = 0; i < myIntegers.length; i++)
			System.out.print(myIntegers[i] + " ");
		System.out.println();
		MinHeap<Integer> intHeap = new MinHeap<Integer>(myIntegers);
		System.out.println("Sorted Integers: ");
		while (intHeap.getSize() > 0)
			System.out.print(intHeap.remove() + " ");
		System.out.println();

		/** test with Strings */
		String[] myStrings = { "Computer ", "Science ", "Rocks " };
		System.out.println("Unsorted Strings in the array: ");
		for (int i = 0; i < myStrings.length; i++)
			System.out.print(myStrings[i]);
		System.out.println();
		System.out.println("Sorted Strings: ");
		MinHeap<String> stringHeap = new MinHeap<String>(myStrings);
		while (stringHeap.getSize() > 0)
			System.out.print(stringHeap.remove());
	}

	public static class MinHeap<E> {
		private java.util.ArrayList<E> list = new java.util.ArrayList<>();
		private java.util.Comparator<? super E> c;

		/** Create a default heap using a natural order for comparison */
		public MinHeap() {
			this.c = (e1, e2) -> ((Comparable<E>) e1).compareTo(e2);
		}

		/** Create a heap with a specified comparator */
		public MinHeap(java.util.Comparator<E> c) {
			this.c = c;
		}

		/** Create a heap from an array of objects */
		public MinHeap(E[] objects) {
			this.c = (e1, e2) -> ((Comparable<E>) e1).compareTo(e2);
			for (int i = 0; i < objects.length; i++)
				add(objects[i]);
		}

		/** Add a new object into the heap */
		public void add(E newObject) {
			list.add(newObject); // Append to the heap
			int currentIndex = list.size() - 1; // The index of the last node

			while (currentIndex > 0) {
				int parentIndex = (currentIndex - 1) / 2;
				// Swap if the current object is less than its parent
				if (c.compare(list.get(currentIndex), list.get(parentIndex)) < 0) {
					E temp = list.get(currentIndex);
					list.set(currentIndex, list.get(parentIndex));
					list.set(parentIndex, temp);
				} else
					break; // the tree is a heap now

				currentIndex = parentIndex;
			}
		}

		/** Remove the root from the heap */
		public E remove() {
			if (list.size() == 0)
				return null;

			E removedObject = list.get(0);
			list.set(0, list.get(list.size() - 1));
			list.remove(list.size() - 1);

			int currentIndex = 0;
			while (currentIndex < list.size()) {
				int leftChildIndex = 2 * currentIndex + 1;
				int rightChildIndex = 2 * currentIndex + 2;

				// Find the minimum between two children
				if (leftChildIndex >= list.size())
					break; // The tree is a heap
				int maxIndex = leftChildIndex;
				if (rightChildIndex < list.size()) {
					if (c.compare(list.get(maxIndex), list.get(rightChildIndex)) > 0) {
						maxIndex = rightChildIndex;
					}
				}

				// Swap if the current node is greater than the maximum
				if (c.compare(list.get(currentIndex), list.get(maxIndex)) > 0) {
					E temp = list.get(maxIndex);
					list.set(maxIndex, list.get(currentIndex));
					list.set(currentIndex, temp);
					currentIndex = maxIndex;
				} else
					break; // The tree is a heap
			}

			return removedObject;
		}

		/** Get the number of nodes in the tree */
		public int getSize() {
			return list.size();
		}

		/** Return true if heap is empty */
		public boolean isEmpty() {
			return list.size() == 0;
		}
	}

}
