#include<iostream>
using namespace std;
int main(){
	int num,last;
	int rev=0;
	cout<<"Enter a no. to perform reversal :";
	cin>>num;
	
	while(num>0){
		last=num % 10;
		rev=(rev * 10)+last;
		num=num/10;
		}
	 
	
		cout<<"Reversal no. is::"<<rev<<endl;
		return 0;