#include<iostream>
using namespace std;
void rev(int l , int arr[] , int r){
    if(l>=r/2) return;
    return swap(arr[l],arr[r]);
}
int main(){
    int a;
    cin>>a;
    int arr[a];
    for(int i=0;i<=a;i++){
        cin>>arr[a];
    }
    for(int i=0;i<=a;i++){
        cout<<arr[a];
    }

    
    return 0;
}