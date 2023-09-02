#include<iostream>
#include<string.h>
#include<list>

using namespace std;

struct student{
	int Rollno;
	char Name[20];
	float SGPA;      

};

void accept(struct student list[5]);
void display(struct student list[80]);
void bubblesort(struct student list[5]);
int main(){
	struct student data[20];
	
	accept(data);
	cout<<"\n Bubble sort";
	bubblesort(data);
	display(data);
}

void accept(struct student list[5]){
	int i;
	for(i=0;i<5;i++){
		cout<<"Enter Roll no.,Name and SGPA:";
		cin>>list[i].Rollno>>list[i].Name>>list[i].SGPA;
		
	
	}

}

void display(struct student list[80]){
	int i;
	cout<<"\nRollno\tName\tSGPA\n";
	for(i=0;i<5;i++){
		cout<<"\n"<<list[i].Rollno<<"\t"<<list[i].Name<<"\t"<<list[i].SGPA;
		
	}

}

void bubblesort(struct student list[5]){
	int i,j,size=5;
	struct student temp;
	for(i=0;i<size-1;i++)
	{
		for(j=0;j<(size-1-i);j++){
			if(list[j].Rollno>list[j+1].Rollno){
				temp=list[j];
				list[j]=list[j+1];
				list[j+1]=temp;
			
			}
		
			
		}
	
	
	}

}
