#include <iostream>
using namespace std;
int getPairsCount(int N, int arr[]){
	
	for(int i=0; i<N;i++){
		for(int j=i+1;j<N;j++){
			if(arr[i]==arr[j]){
				cout<<arr[i]<<" ";
				
			}
			else{
			
			}
			
		}
		
	}
	
	
}
int main(){
	int N=5,arr[]={2,3,1,2,3};
	      getPairsCount(N,arr);
}
