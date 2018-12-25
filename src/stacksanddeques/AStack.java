/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacksanddeques;

import java.util.ArrayDeque;

/**
 *
 * @author Kaitha, Abhinay Reddy;
 */
public class AStack<E>  {
    private ArrayDeque<E> myStack;

    public AStack() {
        this.myStack=new ArrayDeque<E>();
    }
    public void push(E element){
        myStack.addFirst(element);
    }
    public E pop(){
        return myStack.removeFirst();
    }
    public E peek(){
        return myStack.peekFirst();
    }
    public boolean isEmpty(){
        if(myStack.size()==0){
            return true;    
        }
        else{
            return false;
        }
    }
}