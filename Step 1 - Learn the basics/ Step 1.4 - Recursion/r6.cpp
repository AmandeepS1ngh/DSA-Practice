// factorial using parametrize way 
void Fact(int n,int fact){
    if(n==1){
        cout<< fact;
        return;
    }

    Fact(n-1,fact*n);
}

int main(){
    int n;
    cin>>n;
    Fact(n,1);
    return 0;
}
