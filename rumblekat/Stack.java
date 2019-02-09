import java.util.*;

class Stack{
    private Object [] arr;
    private int top;
    private int max;

    public Stack(int size){
        this.max = size;
        this.arr = new Object[size];
        this.top = -1;
    }

    public boolean empty(){
        return this.top == -1;
    }

    public boolean full(){
        return (this.top == this.max-1);
    }

    public void push(Object item){
        if(full()){
            throw new ArrayIndexOutOfBoundsException();
        }
        this.arr[++top] = item;
    }

    public Object peek(){
        if(empty()){
            throw new ArrayIndexOutOfBoundsException();
        }
        return arr[top];
    }

    public Object pop(){
        Object item = peek();
        top--;
        return item;
    }
}
