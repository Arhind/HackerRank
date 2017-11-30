#include<iostream>
using namespace std;

int main(){
    int i, n;
    cin >> n;
    int arr[n];
    for( i = 1; i <= n; i++){
       cin >> arr[i];
    }
for( i=n; i>=1; i--)
{
    cout<<arr[i]<<" ";
}
}

