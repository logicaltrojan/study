#include <bits/stdc++.h>


using namespace std;


priority_queue <int, vector <int> > LEFT_q;

priority_queue <int, vector <int>, greater<int> > RIGHT_q;

int LEFT;
int RIGHT;
int middle;

int main(){

    int N;
    int next;
    scanf("%d", &N);
    N = N-1;
    scanf("%d",&next);
    
    middle = next;
    printf("%d\n", middle);
    
    while(N--){

        scanf("%d", &next);
        if(next < middle){
            LEFT_q.push(next);
            LEFT++;
        }
        else{
            RIGHT_q.push(next);
            RIGHT++;
        }
        
        if(LEFT > RIGHT){
            RIGHT_q.push(middle);
            middle = LEFT_q.top(); LEFT_q.pop(); 
            LEFT--;
            RIGHT++;
        }else if(LEFT < RIGHT-1){
            LEFT_q.push(middle);
            middle = RIGHT_q.top(); RIGHT_q.pop();
            RIGHT--;
            LEFT++;
        }

        printf("%d\n", middle);
        
    }


}
