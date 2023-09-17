package stackadt;

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
//        StackArray s = new StackArray(10);
        StackLinkedList s = new StackLinkedList();
        s.push('e');
        s.push('l');
        s.push('c');
        s.push('i');
        s.push('s');
        s.push('p');
        s.push('o');
        s.push('p');
        s.display();
        s.pop();
        s.insertBottom('s');
        s.display();
        s.display();
        s.makeNull();
        s.pop();
        s.display();
        
        s.push('Y');
        s.push('L');
        s.push('O');
        s.push('P');
        s.push('O');
        s.push('N');
        s.push('O');
        s.push('M');
        System.out.println(s.getTop());
        s.display();
        
        s.makeNull();
        System.out.println(s.getTop());
        s.display();
    }
    
}
