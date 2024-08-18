// Online C++ compiler to run C++ program online
#include <iostream>
#include <bits/stdc++.h>
using namespace std;

void heapify (vector<int> &heap) {
    int curr = heap.size() - 1;
    int parent = curr/2;
    
    while (curr > 1) {
        if (heap[curr] > heap[parent]) {
             swap(heap[curr], heap[parent]);
        
            curr = parent;
            parent = parent/2;
        } else {
            return;
        }
    }
}
int main() {
    vector<int> heap;
    heap.push_back(-1);
    int n=1;
    while (n) {
        cout<<"Add number to heap: "<<endl;
        cin>>n;
        heap.push_back(n);
        //balancing max heap.
        heapify(heap);
    }
    
    for (int i=1; i<heap.size(); i++)
        cout<<heap[i]<<" ";
    
    cout<<endl;
    return 0;
}