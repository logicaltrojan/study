import java.util.*;

class Queue{ 
    private int front;
    private int rear;
    private int max;
    private Object [] arr;

    public Queue(int max){
       this.front = 0;
       this.rear = -1;
       this.max = max;
       this.arr = new Object[max]; 
    }

    public boolean empty(){
        return (front == rear+1);
    }

    public boolean full(){
        return (front == max-1);
    }

    public void enqueue(Object item){
        if(full()){
            throw new ArrayIndexOutOfBoundsException();
        }
        arr[++rear] = item;
    }

    public Object peek(){
        if(empty()) throw new ArrayIndexOutOfBoundsException();
        
        return arr[front];
    }

    public Object dequeue(){
        Object item = peek();
        front++;
        return item;
    }
}