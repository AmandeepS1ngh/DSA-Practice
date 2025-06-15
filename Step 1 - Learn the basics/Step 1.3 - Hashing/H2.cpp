#include<iostream>
using namespace std;

int main(){

    //characture array
    //ASCII 
    //A -> 65,Z -> 90
    //a -> 97, z -> 122 
    int a = 'a';
    cout<<a<<endl;
    int z = 'z';
    cout<<z<<endl;
    int A = 'A';
    cout<<A<<endl;
    int Z = 'Z';
    cout<<Z<<endl;

    string s;
    cin>>s;
    int n = s.size();
    int hasharr[256] =  {0};// there are total 256 ASCAII values
    for (int i = 0; i < n; i++)
    {
        hasharr[s[i]] = hasharr[s[i]] + 1;
    }
    int q;
    cin>>q;
    while (q--)
    {
        char alph;
        cin>>alph;
        cout<<hasharr[alph]<<" ";
    }
    
    

    return 0;
}
