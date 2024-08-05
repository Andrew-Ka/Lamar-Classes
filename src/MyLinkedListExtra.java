/*
Andrew Kalathra
COSC 2336
Instructor: Dr. Jiangjiang Liu
Programming Assignment 7
Due: 10/19/22
This program will modify a few of the
methods from the MyLinkedList class,
lines 179-211
*/
public class MyLinkedListExtra<E> extends MyLinkedList<E>{
	@Override
	public boolean contains(Object e) {
		return contains(e); //checks if object is in the list
	}
	@Override
	public E get(int index) {
		return get(index);//gets the object at that index in the list
	}
	@Override
	public int indexOf(Object e) {
		return indexOf(e);//gets the index of an object in the list
	}
	@Override
	public int lastIndexOf(E e) {
		return lastIndexOf(e);//returns the last index of the element in the list
	}
	@Override
	public E set(int index, E e) {
		return set(index, e);//inserts and element at a certain index
	}
	
}
