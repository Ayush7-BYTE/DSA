#include<bits/stdc++.h>
using namespace std;
#define ll long long
ll e = 1e9 + 7; //10^9+7 is represented  as 1e9+7

int main(){
    int T;
    
    cin >> T;
    for (int t = 0; t < T; t++) {
        int h;
        cin >> h;
     	ll* arr = new ll[h+1];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i <= h; i++) {
            arr[i] = (((arr[i-1]%e)*(arr[i-1]%e) + e)%e + ((((arr[i-1]%e)*(arr[i-2]%e))%e)*2 + e)%e)%e;
        }
        cout << arr[h]%e << endl;
       delete arr;
    }
    return 0;
}
