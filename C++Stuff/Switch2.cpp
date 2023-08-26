#include<iostream>
using namespace std;
int main(){
    int age;
    cout<<"Enter your age"<<endl;
    cin>>age;

    switch (age)
    {
        case 3:
            cout<<"The age is 3";
            break;
        case 34:
            cout<<"The age is 34";
            break;
        case 65:
            cout<<"The age is 65";
            break;
        default:
            break;

    } 
    return 0;
}
    