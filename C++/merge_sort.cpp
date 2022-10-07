#include<bits/stdc++.h>
using namespace std;

//following is the function for Selection Sort

/* --------------------------------------------------------- */

void selectionSort(vector<int>& arr, int n)
{   
    for(int i=0; i<n-1; i++) {
        int minIndex = i;
        for(int j=i+1; j<n; j++) {
            if(arr[j] < arr[minIndex]) 
                minIndex = j;
        }
        
        swap(arr[i], arr[minIndex]);
    }
}

/* --------------------------------------------------------- */

int main() {
    int n;
    cout << "Enter array size: ";     //e.g. 5
    cin >> n;
    
    vector<int> arr(n);
    cout << "Enter the elements of array: ";   //e.g. 6 2 8 4 10
    for(int i=0; i<n; i++) {
        cin >> arr[i];
    }

    selectionSort(arr, n);
    
    cout << "The array in sorted order is: ";
    for(int i=0; i<n; i++) {
        cout << arr[i] << " ";
    }
    
    return 0;
}