#include <bits/stdc++.h>
#define CAP 1<<18
#define leftChild(x) ((x)*2)
#define rightChild(x) ((x)*2+1)
#define parent(x) ((x)/2)

using namespace std;



struct h{
    int size = 0;
    int arr[CAP];
} Heap;

void swap(int* a, int* b){
    int* temp = a;
    a = b;
    b = temp;
}
void printH(){
    
    for(int i = 1; i <= Heap.size ; i++){
        printf("%d\n", Heap.arr[i]);
    }

}
void insert(int item){

    int i;
    for(i = ++Heap.size; i > 0 ; i = parent(i)){
        if(Heap.arr[parent(i)] > item){
            Heap.arr[i] = Heap.arr[parent(i)];
        }
        else{
            break;
        }

    }
    
    Heap.arr[i] = item;
   
}
int wrong_pop(){ 
    int r_val = Heap.arr[1];
    
    int last_val = Heap.arr[Heap.size--];
    int idx = 1;

    while(leftChild(idx) <= Heap.size){ 
        if(idx+1 <= Heap.size && Heap.arr[idx+1] < Heap.arr[idx]) idx++;

        if(last_val <= Heap.arr[idx]) break;
        
        Heap.arr[idx] = Heap.arr[idx];
        idx = leftChild(idx);
    }

    Heap.arr[idx] = last_val;
    return r_val;
}
int pop(){ 
    int r_val = Heap.arr[1];
    
    int last_val = Heap.arr[Heap.size--];
    int idx = 1;

    while(leftChild(idx) <= Heap.size){ 
        int nidx = leftChild(idx);
        if(nidx+1 <= Heap.size && Heap.arr[nidx+1] < Heap.arr[nidx]) nidx++;

        if(last_val <= Heap.arr[nidx]) break;
        
        Heap.arr[idx] = Heap.arr[nidx];
        idx = nidx;
    }

    Heap.arr[idx] = last_val;
    return r_val;
}
int pop(){
    int r_val = Heap.arr[1];
    int last_val = Heap.arr[Heap.size--];
    int idx = 1;
    while(leftChild(idx) <= Heap.size){
        int n_idx = leftChild(idx);
        if(n_idx+1 <= Heap.size && Heap.arr[n_idx] > Heap.arr[n_idx+1]) n_idx++;

        if(Heap.arr[n_idx] > last_val) break;

        Heap.arr[idx] = Heap.arr[n_idx];
        idx = n_idx;
    }

    Heap.arr[idx] = last_val;
    return last_val;
}


int main(){


    insert(2);
    insert(1);
    insert(3);
    insert(99);
    printH();
    printf("%d\n", Heap.size);

    cout << pop() << endl;
    cout << pop() << endl;
    cout << pop() << endl;

    return 0;
}
