import java.util.Arrays;

class Main{
    public static void main(String [] args){
        Heap heap = new Heap(10);
        heap.insert(5);
        heap.insert(1);
        heap.insert(2);
        heap.insert(4);
        heap.insert(-1);
        
        for(int i =0;i<heap.arr.length;i++){
            System.out.println(heap.arr[i]);
        }
    }
}