// Hashmap using STL
#include<iostream>
#include <map>
using namespace std;

int main()
{

    int n;
    cin>>n;
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        cin>>arr[i];
    }

    map <int,int> mpp;
    for (int i = 0; i < n; i++)
    {
        mpp[arr[i]]=mpp[arr[i]]+ 1;
    }
    int q;
    cin>>q;
    while (q--)
    {
        int num;
        cin>>num;
        /* code */
        cout<<mpp[num]<<endl;
    }
    return 0;
}
