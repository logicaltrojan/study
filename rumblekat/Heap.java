import java.util.Arrays;

class Heap{
    int [] heapArr;
    int current;
    int capacity;

    Heap(int capacity){
        this.capacity = capacity;
        heapArr = new int [capacity];
        current = 0;
    }

    public int getParent(int idx){
        return idx / 2;
    }

    public int getLeftChild(int idx){
        return idx * 2;
    }
    public int getRightChild(int idx){
        return idx * 2 +1;
    }

    public void insert(int item){
        if(current == this.capacity){
            return;
        }
        current++;
        int idx = current;
        heapArr[idx] = item;
        bubbleUp(idx);
    }

    public void bubbleUp(int idx){
        int parentIdx = idx / 2;
        int currentIdx = idx;
        //max < 
        //min >
        while(currentIdx > 1 && heapArr[parentIdx] < heapArr[currentIdx]){
            int temp = heapArr[currentIdx];
            heapArr[currentIdx] = heapArr[parentIdx];
            heapArr[parentIdx] = temp;
            currentIdx = parentIdx;
            parentIdx = parentIdx / 2;
        }
    }

    public int pop(){
        System.out.println("current : " + current);
        if(current == 0){
            return 0;
        }
        int answer = heapArr[1];
        heapArr[1] = heapArr[current];
        heapArr[current] = 0;
        sinkDown(1);
        current--;
        
        return answer;
    }

    public void sinkDown(int item){
        int idx = item;
        int leftChildIdx = 2 * item;
        int rightChildIdx = 2 * item +1;
        //max < 
        //min >
        if(leftChildIdx < current && heapArr[idx] < heapArr[leftChildIdx]){
            idx = leftChildIdx;
        }

        if(rightChildIdx < current && heapArr[idx] < heapArr[rightChildIdx]){
            idx = rightChildIdx;
        }

        if(idx != item){
            int temp = heapArr[idx];
            heapArr[idx] = heapArr[item];
            heapArr[item] = temp;
            sinkDown(idx);
        }
        this.toString();
    }

    public String toString(){
        return Arrays.toString(this.heapArr);
    }
}