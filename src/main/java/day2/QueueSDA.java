package day2;


public class QueueSDA {
    int capacity;
    int head;
    int tail;
    int actualSize;
    String tab[];
    public QueueSDA(int capacity) {
        this.capacity = capacity;
        tab = new String[capacity];
        head = 0;
        actualSize = 0;
        tail = 0;
    }



    public int getCapacity() {
        return capacity;
    }

    public boolean isFull() {
        return getActualSize() == capacity;

        }

    public boolean isEmpty() {
        return actualSize == 0;
    }

    public int getActualSize() {
        return actualSize;
    }

    public void setActualSize(int actualSize) {
        this.actualSize = actualSize;
    }

    public void add(String string) {

        if (isFull() == false) {

            tab[head] = string;
            head++;
            actualSize++;

        }
        else {System.out.println("Queue is Full");}

    }

    public String pop() {

//        if (isEmpty() == true)
//        {throw new NoItemsInQueue(); }

        String returnedObject =  this.tab[tail];
        this.tab[tail] = null;
        this.tail++;
        this.actualSize--;
        System.out.println(actualSize);
        return returnedObject;


    }

    public String peak () {
        String peekedObject = tab [tail+1];
        return peekedObject;
    }


}
