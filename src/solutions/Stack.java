package solutions;

public class Stack {
    private int[] elements;
    private int top;

    public Stack() {
        elements = new int[10];
        top = -1;
    }

    public void push(int e) {
        if (top == elements.length - 1) {
            // Array ist voll, erzeuge ein neues Array mit doppelter Größe
            int[] newElements = new int[elements.length * 2];
            // Kopiere alle Elemente in das neue Array
            for (int i = 0; i <= top; i++) {
                newElements[i] = elements[i];
            }
            elements = newElements;
        }
        elements[++top] = e;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack ist leer");
        }
        return elements[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }
}