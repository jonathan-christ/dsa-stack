package stackadt;

import java.util.LinkedList;

/**
 * Stack ADT implementation using Linked Lists. The class contains a pointer to
 * a linked list.
 *
 * @author CALAYCAY, Matthew Cedric
 * @author DURAN, Sean Stefan Louis
 * @author MANALILI, Marlex Lance
 * @author PUMAR, Angelo
 * @author SCHULZ, Jared
 */
public class StackLinkedList {

    /**
     * The variable the points to the stack elements which are represented
     * through a linked list.
     */
    private LinkedList<Character> top;

    /**
     * Initializes the stack class. Initializing pointer for usage.
     */
    public StackLinkedList() {
        this.top = new LinkedList<>();
    }

    /**
     * Inserts an element into the stack, specifically on top of the stack.
     *
     * @param elem refers to the element being inserted.
     */
    public void push(char elem) {
        this.top.push(elem);
    }

    /**
     * Removes an element from the stack, specifically the topmost element.
     */
    public void pop() {
        if (!this.isEmpty()) {
            this.top.pop();
        }
    }

    /**
     * Removes all elements of the stack. Doesn't do anything if the stack is
     * empty.
     */
    public void makeNull() {
        if (!this.isEmpty()) {
            this.top.clear();
        }
    }

    /**
     * Retrieves the topmost element of the stack. Returns a '\0' character if
     * the stack is empty.
     *
     * @return char the datatype of the stack elements.
     */
    public char getTop() {
        char retVal = '\0';
        if (!this.isEmpty()) {
            retVal = this.top.peek();
        }
        return retVal;
    }

    /**
     * Determines if the stack is empty
     *
     * @return Boolean Returns 'true' if the stack is empty, otherwise 'false'
     */
    public boolean isEmpty() {
        return this.top.isEmpty();
    }

    /**
     * Inserts an element at the bottom of the stack.
     *
     * @param elem the element being inserted.
     */
    public void insertBottom(char elem) {
        this.top.addLast(elem);
    }

    /**
     * Displays stack elements without traversal.
     *
     * @see #getTop()
     * @see #push(char)
     * @see #pop()
     */
    public void display() {
        StackLinkedList temp;
        if (!this.top.isEmpty()) {
            temp = new StackLinkedList();
            System.out.print("[TOP] ");

            for (; !this.isEmpty(); temp.push(this.getTop()), this.pop()) {
                System.out.print(this.getTop() + " ");
            }
            System.out.print("[BOTTOM]\n");

            for (; !temp.isEmpty(); this.push(temp.getTop()), temp.pop()) {
            }
        } else {
            System.out.println("Empty stack");
        }

    }
}
