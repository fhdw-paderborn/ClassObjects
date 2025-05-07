package solutions;

public class Stack {
    private int[] array; 
    private int indexTopElem = -1;

    public Stack() {
        this.array = new int[10];
    }

    public void push(int number) {
        indexTopElem++;
        if(indexTopElem == array.length) {
            int[] oldArray = this.array;
            this.array = new int[indexTopElem * 2];

            for(int i = 0; i < indexTopElem; i++) {
                this.array[i] = oldArray[i];
            }
        }

        array[indexTopElem] = number;
    }

    public int pop() {
        if(!isEmpty()) {
            int topElem = array[indexTopElem];
            array[indexTopElem] = 0;
            indexTopElem--;
            return topElem;   
        } else {
            throw new IllegalStateException();
        }

    }

    public boolean isEmpty() {
        if (indexTopElem < 0) {
            return true;
        } else {
            return false;
        }
    }

    public int size() {
        return indexTopElem + 1;
    }
}
