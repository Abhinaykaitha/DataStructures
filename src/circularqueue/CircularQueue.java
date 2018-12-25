/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circularqueue;

/**
 *
 * @author Kaitha, Abhinay Reddy;
 */
public class CircularQueue<E> {
    private int currentSize;
    private E[] Elements;
    private int maxSize;
    private int rear;
    private int front;

    public CircularQueue(int maxSize) {
        this.maxSize = maxSize;
        Elements = (E[]) new Object[this.maxSize];
        currentSize = 0;
        front = -1;
        rear = -1;
    }
     public int getLength(){
        return currentSize;
    }
     /**
     * Check if queue is full.
     * @return boolean
     */
    public boolean isFull() {
        return (getLength() == Elements.length);
    }

    /**
     * Check if Queue is empty.
     * @return boolean
     */
    public boolean isEmpty() {
        return (getLength() == 0);
    }
     /**
     *
     * @param item
     * @throws IndexOutOfBoundsException
     */
    public void insert(E item) throws IndexOutOfBoundsException {
        if (isFull()) {
            throw new IndexOutOfBoundsException("Circular Queue is full. Element cannot be added");
        } else {
            rear = (rear + 1) % Elements.length;
            Elements[rear] = item;
            currentSize++;
            if (front == -1) {
                front = rear;
            }
        }
    }
   
    public E remove() throws UnsupportedOperationException {
        E removeElement;
        if (isEmpty()) {
            throw new UnsupportedOperationException("Circular Queue is empty. Element cannot be removed");
        }
        else {
            removeElement = Elements[front];
           Elements[front] = null;
            front = (front + 1) % Elements.length;
            currentSize--;
        }
        return removeElement;
    }
    
    public E retrieve() throws UnsupportedOperationException{
        if (isEmpty()) {
            throw new UnsupportedOperationException("Circular Queue is empty. Element cannot be removed");
        }else
        return Elements[front];
    }

    public String print() {
        String printing = "";
        for(int i = 0; i< currentSize; i++){
            printing += Elements[i] +"\n";
        }
        String newPrinting = printing.substring(0, printing.length()-1);
        return newPrinting;
    }
}
