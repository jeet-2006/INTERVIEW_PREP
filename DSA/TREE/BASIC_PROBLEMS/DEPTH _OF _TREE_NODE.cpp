#include <iostream>
#include<bits/stdc++.h>
//DEPTH OF NODE: TOTAL NUMBER OF EDGES COMING FROM MAIN ROOT.
using namespace std;
struct Node {
  int data;
  Node* left;
  Node* right;
  
  Node(int data) {
    this->data = data;
    this->left = this->right = NULL;
  }
};

int findDepth(Node * root, int key) {
  if (root == NULL) {
    return -1;
  }  
  
  int dist = -1;
  if (root->data == key  
      || (dist = findDepth(root->left, key)) >= 0
      || (dist = findDepth(root->right, key)) >= 0
     )
    return dist+1;
    
  return dist;
}

int main() 
{
    cout << "Hello, World!"<<endl;
    Node* n = new Node(1);
    n->left = new Node(2);
    n->right = new Node(3);
    n->right->left = new Node(4);
    n->right->right = new Node(5);
    int ans = 0;
    
    cout<<"Depth : "<<findDepth(n, 2)<<endl;

    return 0;
}