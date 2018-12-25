/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlists;

/**
 *
 * @author Kaitha, Abhinay Reddy;
 */
public class Tester {
    public static void main(String[] args) {
        Kaitha_ALinkedList<Character> intList = new Kaitha_ALinkedList<>();

        intList.addFirst('A');
        intList.addFirst('E');
        intList.addFirst('I');
        intList.addFirst('J');
        intList.removeFirst();
        intList.addFirst('O');
        intList.addFirst('U');

        System.out.println("Contents of linked list\n"
                + (intList.isEmpty() ? "list is empty" : intList));

        while (!intList.isEmpty()) {
            System.out.println("Deleting " + intList.removeFirst());
        }
        System.out.println();
        System.out.println("Contents of linked list\n"
                + (intList.isEmpty() ? "list is empty" : intList));
    
}
}
