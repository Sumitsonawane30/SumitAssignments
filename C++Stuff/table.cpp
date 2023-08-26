#include<iostream>
using namespace std;
int main() 
{
    int i;
    int n;
    
    cout<<"Enter an n to get table :"<<endl;
    cin>>n;
    

    for(i=1;i<=10;i++){
        cout<<(n*i)<<endl;
    }
    return 0;

}