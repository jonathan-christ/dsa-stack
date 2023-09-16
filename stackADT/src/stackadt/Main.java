package stackadt;

import java.util.ArrayList;

/**
 * Driver class/program for stack ADT implementation.
 * @author CALAYCAY, Matthew Cedric
 * @author DURAN, Sean Stefan Louis
 * @author MANALILI, Marlex Lance
 * @author PUMAR, Angelo
 * @author SCHULZ, Jared
 */
public class Main {

    /**
     * Main function, the heart of the driver program.
     * @param args required for default main arguments
     */
    public static void main(String[] args) {
        StackArray s = new StackArray();
        s.push('k');
        s.push('o');
        s.push('c');
        s.push('k');
        s.pop();
        s.insertBottom('s');
        s.display();
        s.display();
        s.makeNull();
        s.display();
        
        s.push('N');
        s.push('I');
        s.push('T');
        s.push('O');
        
        System.out.println(s.getTop());
        s.display();
    }
    
}
