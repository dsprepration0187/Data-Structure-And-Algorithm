#include<bits/stdc++.h>
using namespace std;


bool isValid(string s)
{
    int n=s.size();
    stack<char> str;
    bool ans=true;
    for(int i=0;i<n;i++)
    {
        if(s[i]=='{' or s[i]=='(' or s[i]=='[')
            {
                str.push(s[i]);
            }
            else if(s[i]==')'){
                if(!str.empty() and str.top()=='('){
                    str.pop();
                   }
                   else{
                    ans=false;
                    break;
                   }
            }

             else if(s[i]=='}'){
                if(!str.empty() and str.top()=='{'){
                    str.pop();
                   }
                   else{
                    ans=false;
                    break;
                   }
            }

             else if(s[i]==']'){
                if( !str.empty() and str.top()=='['){
                    str.pop();
                   }
                   else{
                    ans=false;
                    break;
                   }
            }
    }
    if(!str.empty())
        return false;
    return ans;
}
int main()
{
    string s="{([]})";

    if(isValid(s))
    {
        cout<<"String is Valid";
    }
    else
    {
        cout<<"String is inValid";
    }
    return 0;
}
