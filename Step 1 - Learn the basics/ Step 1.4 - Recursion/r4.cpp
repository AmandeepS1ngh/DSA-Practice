// Sum of N using Functional Way
int Sum(int n){
    if(n==0) return 0;
    return n + Sum(n-1);
}

int main(){
    int n;
    cin>>n;
    cout<<Sum(n);
    return 0;
}
