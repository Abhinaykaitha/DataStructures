/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacksanddeques;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Kaitha, Abhinay Reddy;
 */
public class BooksStack {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
         AStack<Book> books=new AStack<Book>();
        AStack<Book> books1=new AStack<Book>();
       
      Scanner scan = new Scanner(new File("books.txt"));
     
      while(scan.hasNext()){
          Book b = new Book(scan.nextLine(),scan.nextLine());
          books.push(b);
          
      }
     System.out.println("All books in the stack from top to bottom");
   
    while(!(books.isEmpty())){
        System.out.println("-------------------------------------");
    Book temp=books.pop();
    books1.push(temp);
        System.out.println(temp);
    
    }
    while(!(books1.isEmpty())){
        Book temp = books1.pop();
        if(!"Fantastic Beats:The Crimes of Grindelwald".equals(temp.getTitle())){
            books.push(temp);
    }
    }
    System.out.println("-------------------------------------");
    System.out.println("Stack after removing book with name Fantastic Beasts: The Crimes of Grindelwald");
    while(!(books.isEmpty())){
        System.out.println("-------------------------------------");
        Book temp=books.pop();
        books1.push(temp);
        System.out.println(temp);
    } 
   }
}
