/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlists;
import java.util.NoSuchElementException;

/**
 *
 * @author Kaitha, Abhinay Reddy;
 */
public class Kaitha_ALinkedList<E> {
    
    private Node<E> listStart;
    private int listLength;
    /**
	 * Constructor
	 * Creates an empty linked list with the head of the list
     * pointing to null.
	 * Initializes the length of the list to 0.
	 */

       public Kaitha_ALinkedList() {
        listLength = 0;
        listStart = new Node<E>(null);
        listStart.nextNode = null;
    }
       
    /**
	 * Returns true if the list is empty; false otherwise.
	 * @return true if the list is empty; false otherwise.
	 */
   public boolean isEmpty()
   {
    if(listLength==0){
        return true;
    }else{
        return false;
    }
   }
   
    /**
	 * Adds an object to the beginning of the list.
	 * @param myObject The object to be added to the beginning
	 * of the list.
	 */
   public void addFirst(E myObject)
   {
    if (listStart.nextNode == null && listStart.data == null) {
            listStart = new Node<E>(myObject);
        } else {
            Node<E> tempNode = listStart;
            Node<E> currentNode = new Node<E>(myObject);
            listStart = currentNode;
            currentNode.nextNode = tempNode;
        }
     
        listLength++;
    
   }
/**
     * Removes the first object from the list.
     *
     * @return the node that was removed from the list.
     * @throws NoSuchElementException if the list is empty
     */
    public Node<E> removeFirst() {
        Node<E> result;
        if (listStart == null) {
            return null;
        } else {
            Node<E> temp = listStart;
            Node<E> current = listStart.nextNode;
            listStart = current;
            listLength--;
            return temp;
        }
        
    }
     /**
     * Returns the number of nodes in the list.
     *
     * @return the number of nodes in the list.
     */
    public int size() {
        return listLength;
    }
    /**
     * Returns a string representation of the linked list. The string
     * representation consists of each node in the list, printed using the
     * toString method of the Node class, with each node printed on a new line.
     *
     * @return a string representation of the linked list.
     */
    @Override
    public String toString() {
        String x = listStart +"\n";
        Node cur = listStart.nextNode;
        String data;
        if (listStart != null) {
            while (cur != null ) {
                x += cur.data.toString() + "\n";
                cur = cur.nextNode;      
            }
        }
        return x;
    }

}
