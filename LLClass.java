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
 * 
 * makes LL object from class just created
 * demonstrate functionality of LL and iterator
 * use each method at least once to
 * handle exceptions
 * make another LL object and let the user input a number of int values
 * use the iterator to iterate over the values and sum them, printing the sum
 */

import java.util.Scanner;
import java.util.LinkedList;
import java.util.ListIterator;

class LLClass {
    public static LinkedList<Integer> list = new LinkedList<Integer>();
    public static Scanner sc = new Scanner(System.in);
    
    public static void demo(LinkedList<Integer> list) {

    }

    public static void main(String[] args) {
        inputMenu();
        

    }

    public static void inputMenu() {
        System.out.println("Enter integer to LinkedList or -1 to exit");
        System.out.printf(":> ");
        int inp = getInput();
        if (inp != -1) {
            LLClass.list.addLast(inp);
            inputMenu();
        } else {
            System.out.println("sum of entries: ");
            System.out.println(inner.sum(LLClass.list));
        }
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

class inner extends LLClass {
    public static int sumnum = 0;
    public static int sum(LinkedList<Integer> list) {
        ListIterator<Integer> listIterator = LLClass.list.listIterator();
        while (listIterator.hasNext()) {
            sumnum += listIterator.next();
        }
        return sumnum;
    }
}