/**
 * must have:
 * linked list class
 * Node inner class
 * reference to the first node in
 * minimally implement:
 *      addFirst
 *      getFirst
 *      removeFirst
 * 
 * inner class functions as iterator for likedlist class
 * minimally implement:
 *      next
 *      hasNext
 * implement an exception that can be thrown when the class attempts an illegal operation
 * 
 */

import java.util.Scanner;
import java.util.LinkedList;

public class LLClass {
    public static LinkedList<String> list = new LinkedList<String>();
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println(getInput());
        sc.close();
    }

    public static int getInput() {
        try {
            String inp = sc.nextLine();
            int inpint = Integer.parseInt(inp);
            return inpint;
        } catch (Exception e) {
            System.out.println("NaN");
            return getInput();
        }
    }


}