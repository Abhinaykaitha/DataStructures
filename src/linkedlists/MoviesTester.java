/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlists;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Kaitha, Abhinay Reddy;
 */
public class MoviesTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        
        Kaitha_ALinkedList<Movie> marvels =new Kaitha_ALinkedList<>();
        
        Scanner in = new Scanner(new File("movies.txt"));

        while (in.hasNext()) {
            marvels.addFirst(new Movie(in.nextLine(), in.nextLine(), in.nextInt()));
            if (in.hasNext()) {
                in.nextLine();
            }
        }
        System.out.println(marvels);
        System.out.println(marvels.size() + " movies in the list");
        System.out.println("deleting " + marvels.removeFirst());
        System.out.println(marvels.size() + " courses in the list");
    }
}
