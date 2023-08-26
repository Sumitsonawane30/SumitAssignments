#include<iostream>
#include<string>
using namespace std;
int main (){
	string org;
	string result="";
	
	cout<<"Enter an string for reversal method:";
	
	cin>>org;
	
	
	for(int i=0;i<org.length();i++){
		result=org[i]+result;
	}
	
	cout<<"Reversal string is :"<<result<<endl;
	return 0;
	


}
