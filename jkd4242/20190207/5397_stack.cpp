#include <bits/stdc++.h>
#define MAXIMA 1000005

using namespace std;


void printAscii(char* input){

    for(int i = 0; i < 25; i++){
        printf("%d %c %d\n", i, *(input+i), *(input+i));
        
    }

}


stack <char> leftStack;
stack <char> rightStack;



void mach(char a){ 

    
    if(a == '<'){
        if(!leftStack.empty()){
            rightStack.push(leftStack.top());
            leftStack.pop();
        }
    }else if(a == '>'){
        if(!rightStack.empty()){
            leftStack.push(rightStack.top());
            rightStack.pop();
        }
        
    }else if(a == '-'){
        if(!leftStack.empty()) leftStack.pop();

    }
    else{
        leftStack.push(a);
    }
   

}

void printAns(){

    while(!leftStack.empty()){
            rightStack.push(leftStack.top());
            leftStack.pop();
    }
    while(!rightStack.empty()){
        printf("%c", rightStack.top());
        rightStack.pop();
    }
    cout << endl;
}

int main(){

    int N;
    char input; 
    scanf("%d ", &N);

    while(N--){
        
        // scanf("%[^\n]s\n", input);
        // printf("%s\n", input);
        // printAscii(input);
        
        // gets_s(input,sizeof(input));
        // only in VC, not in gcc
        // use fgets(input, sizeof(input), stdin)

        // fgets(input, sizeof(input), stdin); //gets \n
        while(scanf("%c", &input) == 1 && input != '\n'){
            mach(input);
        }
        printAns();
    }
    
    
    
}
