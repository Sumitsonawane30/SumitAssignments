#include<iostream>
using namespace std;

int Binarysearch(int arr[],int n,int key){
    int s=0;
    int e=n;
    while(s<=e){
        int mid=(s+e)/2;
        if(arr[mid]==key){
            return mid;
        }
        else if(arr[mid]>key){
            e=mid-1;
        }
        else{
            s=mid+1;
        }
    }
}

int main(){
    int n;
    cout<<"Enter any No.:";
    cin>>n;

    int arr[n];
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    int key;
    cout<<"Enter an element which index to be find out:";
    cin>>key;

cout<<Binarysearch(arr,n,key)<<endl;

}