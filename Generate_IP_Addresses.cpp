/*program to generate all possible combination of IPv4 address

Rules for IPv4 Address:
*A valid IP address must be in the form of A.B.C.D
*where A, B, C, and D are numbers from 0-255
*/
#include<iostream>
#include<vector>
using namespace std;

vector<string> genIp(string &s) {
    vector<string> res;       //dynamic size of array that stores valid IP (result)
    string currentIp;
    for (int i=1; i<=3; i++)
    {                               
        for (int j=1; j<=3; j++)
        {
            for (int k=1; k<=3; k++)
            {
                for (int l=1; l<=3; l++)
                {
                    if (i+j+k+l == s.length()) 
                    {
                        int a = stoi(s.substr(0, i));
                        int b = stoi(s.substr(i, j));
                        int c = stoi(s.substr(i+j, k));
                        int d = stoi(s.substr(i+j+k, l));
                        if (a<=255 && b<=255 && c<=255 && d<=255)
                        {
                            currentIp=to_string(a)+"."+to_string(b)+"."+to_string(c)+"."+to_string(d);
                            if(currentIp.size()-3==s.size())
                            {
                                res.push_back(currentIp);
                            }
                        }
                    }
                }
            }
        }
    }
    return res;
}


int main()
{
    string s;
    cin>>s;               //Input should be numberical value >> Example input: 1234
	  vector<string>res=genIp(s);
	  if(res.size()==0)
	  {
	      cout<<"Cannot generate valid IP address";   //Example: if input is 12, 2 digit is not sufficient to generate IP addresses
	  }
	  else
  	{
	  for(int i=0; i<res.size();i++)
	  {
	      cout<<res[i];
	      cout<<endl;
  	}
  	}
  	return 0;
}
