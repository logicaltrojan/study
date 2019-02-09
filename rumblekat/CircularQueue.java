import java.util.*;

class CircularQueue<E>{
    private int currentSize;
    private E[] arr;
    private int maxSize;
    
    private int rear;
    private int front;

    public CircularQueue(int maxSize){
        this.maxSize = maxSize;
        arr = (E[])new Object[this.maxSize];
        currentSize = 0;
        front = -1;
        rear = -1;
    }

    public void enqueue(E item){
        if(isFull()){
            System.out.println("Circular Queue is full...");
        }else{
            rear = (rear+1) % maxSize;
            arr[rear] = item;
            currentSize++;
            if(front == -1){
                front = rear;
            }
        }
    }

    public E dequeue(){
        E element = null;
        if(isEmpty()){
            System.out.println("Circular Queue is Empty");
        }else{
            element = arr[front];
            arr[front] = null;
            front = (front + 1) % maxSize;
            currentSize--;
        }
        return element;
    }

    public boolean isFull(){
        return (currentSize == arr.length);
    }

    public boolean isEmpty(){
        return currentSize == 0;
    }
}