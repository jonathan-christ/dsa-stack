package stackadt;

/**
 * Stack ADT implementation using Arrays.
 * The class contains an array of elements, a top index variable, and
 * a relative MAX count.
 * @author CALAYCAY, Matthew Cedric
 * @author DURAN, Sean Stefan Louis
 * @author MANALILI, Marlex Lance
 * @author PUMAR, Angelo
 * @author SCHULZ, Jared
 */
public class StackArray {
    /**
     * 
     * <p id="top">The top index variable refers to the index of the element array
     * where the top element resides. Since it is an index, by default,
     * it should be -1.</p>
     * 
     * <p id="max">
     * The max count refers to the maximum number of elements the array
     * can hold, by default it is set to 5.</p>
     */
    private final char[] elements;
    private int top;
    private int MAX = 5;

    /**
     * Initializes the stack class.
     * Done by allocating space for the element array 
     * with the default max value, and sets -1 as the top index for usage. 
     */
    public StackArray() {
        this.elements = new char[MAX];
        this.top = -1;
    }

    /**
     * Initializes stack with a specified number of maximum elements.
     * @see #StackArray()  for stack initializing.
     *
     * @param max refers to the new maximum stack element count.
     */
    public StackArray(int max) {
        this.MAX = max;
        this.elements = new char[MAX];
        this.top = -1;
    }

    /**
     * Inserts an element into the stack, specifically on top of the stack.
     * Doesn't do anything if the stack is full.
     * Makes the current inserted element as the top of the stack by
     * incrementing the top index variable.
     * @see #top
     *
     * @param elem refers to the element being inserted.
     */
    public void push(char elem) {
        if (!this.isFull()) {
            this.elements[++this.top] = elem;
        }
    }

    /**
     * <p id="pop()">
     * Removes an element from the stack, specifically the topmost element.
     * Doesn't do anything if the stack is empty.
     * Removes the element by decrementing the top index variable.</p>
     * @see #top
     */
    public void pop() {
        if (!this.isEmpty()) {
            this.top--;
        }
    }

    /**
     * Removes all elements of the stack.
     * Doesn't do anything if the stack is empty.
     * Resets the top index variable to -1.
     * @see #top
     */
    public void makeNull() {
        if (!this.isEmpty()) {
            this.top = -1;
        }
    }

    /**
     * Retrieves the topmost element of the stack. 
     * Returns a '\0' character if the stack is empty.
     *
     * @return char the datatype of the stack elements.
     */
    public char getTop() {
        char retVal = '\0';
        if (!this.isEmpty()) {
            retVal = elements[top];
        }
        return retVal;
    }

    /**
     * Determines if the stack is full.
     * Determines by comparing the top index variable to the max count.
     * Returns 'true' if it is equal to max count - 1, otherwise, 'false'.
     * @see #top
     *
     * @return Boolean the datatype for answering a ' yes or no ' question.
     */
    public boolean isFull() {
        return top == MAX - 1;
    }

    /**
     * Determines if the stack is empty.
     * Determines by comparing the top index variable to -1;
     * Returns 'true' if it is equal to -1, otherwise, 'false'.
     * @see #top
     * 
     * @return Boolean Returns 'true' if the stack is empty, otherwise 'false'
     */
    public boolean isEmpty() {
        return top == -1;
    }

    /**
     * Inserts an element at the bottom of the stack without traversal.
     * Doesn't do anything if the stack is empty.
     * Pushes existing elements with the new element being the last one
     * to a temporary stack before pushing them to the main stack again.
     * @see #pop() 
     * @see #push(char) 
     * 
     * @param elem the element being inserted.
     */
    public void insertBottom(char elem) {
        StackArray temp;
        if (this.isEmpty()) {
            System.out.println("Empty stack");
        } else {
            temp = new StackArray();

            while (!this.isEmpty()) {
                temp.push(this.getTop());
                this.pop();
            }
            temp.push(elem);

            while (!temp.isEmpty()) {
                this.push(temp.getTop());
                temp.pop();
            }
        }
    }

    /**
     * Displays stack elements without traversal.
     * Prints "Empty stack" if the stack is empty.
     * Utilizes a combination of getTop, push, and pop and
     * a temporary stack to display. Has similarities with
     * insertBottom.
     * 
     * @see #getTop() 
     * @see #push(char) 
     * @see #pop() 
     * @see #insertBottom(char) 
     */
    public void display() {
        StackArray temp;
        if (this.isEmpty()) {
            System.out.println("Empty stack");
        } else {
            temp = new StackArray();

            System.out.print("[TOP] ");
            while (!this.isEmpty()) {
                System.out.print(this.getTop() + " ");
                temp.push(this.getTop());
                this.pop();
            }
            while (!temp.isEmpty()) {
                this.push(temp.getTop());
                temp.pop();
            }
            System.out.print("[BOTTOM]\n");
        }
    }

}
