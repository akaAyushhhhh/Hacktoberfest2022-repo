#include <iostream>
using namespace std;

int main(){
    int n;
    cout<<"Enter number of rows";
    cin >> n;
    for(int i=1; i<=n; i++){
        for(int j=1; j<=n; j++){
            if(i>=j) cout<<"*";
            else cout<<" ";
        }
        for(int j=n;j>0;j--)
        {
            if(i<j) cout <<" ";
            else cout <<"*";
        }
        cout<<endl;
    }
    for(int i=1; i<=n; i++){
        for(int j=n;j>0;j--){
            if(i<=j) cout<<"*";
            else cout<<" ";
        }
        for(int j=1; j<=n; j++){
            if(i>j) cout <<" ";
            else cout <<"*";
        }
        cout<<endl;
    }
    return 0;
}