import java.util.*;

public class Queue{
    private Object[] queue;
    private int size = 0;
    private int rear = -1;
    private int front = -1;
    
    Queue(int size){
        this.size = size;
        this.queue = new Object[size];
    }

    public void enqueue(Object element){
        if(isFull()){
            System.out.println("Overflow...");
        }
        queue[++rear] = element; 
    }

    public Object dequeue(){
        if(isEmpty()){
            System.out.println("UnderFlow...");
        }
        Object temp = queue[++front];
        if(isEmpty()){
            rear = -1;
            front = -1;
        }
        return temp;
    }

    public boolean isFull(){
        return (rear == size-1);
    }

    public boolean isEmpty(){
        return front == rear;
    }

    public int getSize(){
        return size;
    }
}