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
    vector<vector<int>> adjList(v);
    cout<<"Enter edges:"<<endl;
    for (int i=0; i<e; i++) {
        int v1, v2;
        cin>>v1>>v2;
        adjList[v1].push_back(v2);
        adjList[v2].push_back(v1);
    }
    
    cout<<"GRAPH: "<<endl;
    for (int i=0; i<v; i++) {
        for (int j=0; j<adjList[i].size(); j++) {
            cout<<adjList[i][j]<<" ";
        }
        cout<<endl;
    }
    
    return 0;
}