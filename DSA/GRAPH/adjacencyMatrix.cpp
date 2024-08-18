// Online C++ compiler to run C++ program online
#include <bits/stdc++.h>
using namespace std;

int main() {
    // Write C++ code here
    int v, e;
    cout<<"Enter number of nodes:"<<endl;
    cin>>v;
    cout<<"Enter number of edges:"<<endl;
    cin>>e;
    int adj[v][v];
    memset(adj, 0, sizeof(adj));
    cout<<"Enter edges:"<<endl;
    for (int i=0; i<e; i++) {
        int v1, v2;
        cin>>v1>>v2;
        adj[v1][v2] = 1;
        adj[v2][v1] = 1;
    }
    
    cout<<"GRAPH: "<<endl;
    for (int i=0; i<v; i++) {
        for (int j=0; j<v; j++) {
            cout<<adj[i][j]<<" ";
        }
        cout<<endl;
    }
    
    return 0;
}