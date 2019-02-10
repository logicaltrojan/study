#include <bits/stdc++.h>

using namespace std;

int main(){

    char a[1<<17];

    int stck = 0;
    int ans = 0;
    int i = 0;
    scanf("%s", a);
    while(a[i]){
        if(a[i] == '(' && a[i+1] == ')'){
            ans += stck;
            i++;
        }else if(a[i] == '('){
            stck++;
        }
        else{
            ans++;
            stck--;
        }
        i++;
    }
    cout << ans;
}
