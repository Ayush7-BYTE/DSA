#include <bits/stdc++.h>
using namespace std;

int main(){
    string str ;
    cin >> str ;
    string str_rev ;
    for (int i =str.size() -1; i>=0 ; --i){
       //str_rev = str_rev + str[i]; we canot add char in string 
       str_rev.push_back(str[i]);

    }
    cout<< str_rev << endl;
    if(str == str_rev){
        cout<< "YES";
    }else{
        cout << "NO";
    }
}