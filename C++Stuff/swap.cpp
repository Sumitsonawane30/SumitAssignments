#include<iostream>
using namespace std;
int main(){
    int a=12;
    int b=33;
    int temp;
    cout<<"Before swap a is "<<a<<" and b is " <<b<<endl;
    temp=a;
    a=b;
    b=temp;
    cout<<"After swap a is "<<a<<" and is " <<b;
    
    return 0;
    
    
}