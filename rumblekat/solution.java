import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Collections;
import java.util.Stack;

class solution{

    static int center = 0;
    static int left = 0;
    static int right = 0;
    static PriorityQueue minHeap = null;
    static PriorityQueue maxHeap = null;

    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        
        minHeap = new PriorityQueue<Integer>(100000);
        maxHeap = new PriorityQueue<Integer>(100000, Collections.reverseOrder());

        for(int i =0;i<num;i++){
            int val = Integer.parseInt(br.readLine());

            if (maxHeap.isEmpty())
                maxHeap.add(val);
     
            else if (maxHeap.size() == minHeap.size())
                maxHeap.add(val);
     
            else
                minHeap.add(val);
     
    
            if (!maxHeap.isEmpty() && !minHeap.isEmpty() && !((int)maxHeap.peek() <= (int)minHeap.peek()))
            {
                int a = (int)maxHeap.poll();
                int b = (int)minHeap.poll();
     
                maxHeap.add(b);
                minHeap.add(a);
            }
            System.out.println(maxHeap.peek());
        }
    }
}