import java.util.*;

class Main{
    public static void main(String [] args){
        CircularQueue queue = new CircularQueue(3);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        while(!queue.isEmpty()){
            System.out.println(queue.dequeue());
        }

        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);

        while(!queue.isEmpty()){
            System.out.println(queue.dequeue());
        }
    }
}