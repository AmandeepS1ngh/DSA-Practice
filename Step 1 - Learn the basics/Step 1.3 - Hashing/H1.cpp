#include<iostream>
using namespace std;
// basic structure 
int main(){
  // Taking Input array 
    int n;
    cin>>n;

    int arr[n];
    for (int i = 0; i < n; i++)
    {
        cin>>arr[i];
    }
    //counting element using Hashing 
    int q;
    cin>>q;
    int hasharr[10000]={0};
    for (int i = 0; i < n; i++)
    {
        hasharr[arr[i]] = hasharr[arr[i]] + 1;
    }
    // printing number of elements
    while (q--)
    {
        int ele;
        cin>>ele;
        cout<<hasharr[ele]<<" ";
    }  

    return 0;
}
