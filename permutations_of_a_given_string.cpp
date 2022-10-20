//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution
{
 public:
 void solve(int index,string S , set<string>&st){
     
     
     //base case
     if(index == S.size()){
         st.insert(S);
         return ;
     }
     
     for(int j=index ; j<S.size();j++){
         swap(S[index],S[j]);
         
         solve(index+1 , S, st);
         //backtracking
         swap(S[index],S[j]);
         
     }
 }
  vector<string>find_permutation(string S)
  {
      
    
      set<string>st;
      
      // Code here there
     solve(0,S,st);
     vector<string>ans(st.begin(),st.end());
     
     
     
     
      return ans;
  }
};



//{ Driver Code Starts.
int main(){
    int t;
    cin >> t;
    while(t--)
    {
     string S;
     cin >> S;
     Solution ob;
     vector<string> ans = ob.find_permutation(S);
     for(auto i: ans)
     {
      cout<<i<<" ";
     }
     cout<<"\n";
    }
 return 0;
}

// } Driver Code Ends
