#include <bits/stdc++.h>
#define QMax 10005
using namespace std;


struct q{
    int size = 0;
    int front = 0;
    int back = 0;
    int array[QMax];
} Q;


int q_empty(){ 
    return Q.size == 0 ? 1 : 0;
}
void push(int x){
    Q.array[Q.back++] = x;
    Q.size++;
}

void pop(){
    
    if(q_empty() == 1){
        printf("-1\n");
        return;
    }
    printf("%d\n", Q.array[Q.front]);
    Q.size--;
    Q.front++;

}

int q_size(){
    
    return Q.size;
}


int q_front(){
    
    return q_empty() ? -1 : Q.array[Q.front];

}

int q_back(){
    
    return q_empty() ? -1 : Q.array[Q.back-1];


}

void printQstatus(){

    for(int i = 0; i < Q.back ; i++){
        cout << Q.array[i];
    }
    cout << endl;
}
int main(){
    
    string a;
    int N;
    scanf("%d ", &N);
    while(N--){ 
        //push x, front, back , size, empty, pop
        
        cin >> a;
        if(!a.compare( "front")) printf("%d\n", q_front());
        else if(!a.compare( "back")) printf("%d\n", q_back());
        else if(!a.compare( "size")) printf("%d\n", q_size());
        else if(!a.compare( "empty")) printf("%d\n", q_empty());
        else if(!a.compare( "pop")) pop();
        else{
            int item;
            scanf("%d", &item);
            push(item);
        }
    }

    return 0;
}
