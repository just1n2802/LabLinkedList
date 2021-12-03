import java.util.Scanner;
import java.util.LinkedList;

public class Main {
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