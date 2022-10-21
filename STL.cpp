#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <set>
#include <map>
#include <algorithm>
using namespace std;


int main() {
    int n;
    cin >> n;
    
    map<string, int> m;
    
    while (n--) {
        int t;
        cin >> t;
        
        string s;
        cin >> s;
        
        if (t == 1) {
            int a;
            cin >> a;
            
            m[s] += a;
        } else if (t == 2) {
            m[s] = 0;
        } else {
            cout << m[s] << "\n";
        }
    }
    
    return 0;
}
                        
