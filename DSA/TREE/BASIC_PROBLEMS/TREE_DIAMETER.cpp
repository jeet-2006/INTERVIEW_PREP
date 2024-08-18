#include <iostream>
#include<bits/stdc++.h>
//TREE DIAMETER: MAX DISTANCE BETWEEN 2 LEAF NODES 
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

int findDiameter(Node * root, int &ans) {
  if (root == NULL) {
    return 0;
  }  
  
  int lh = findDiameter(root->left, ans);
  int rh = findDiameter(root->right, ans);
  
  //we are storing max diameter which is either sum of 2 height or max dia of one of the child node
  ans = max(1 + lh + rh, ans);
  
  //here we are returning height 
  return 1 + max(lh, rh);
}

int main() 
{
    cout << "Hello, World!"<<endl;
    Node* n = new Node(1);
    n->left = new Node(2);
    n->right = new Node(3);
    n->right->left = new Node(4);
    n->right->right = new Node(5);
    n->right->right->right = new Node(5);
    int ans = 0;
    findDiameter(n, ans);
    cout<<"Diameter : "<<ans<<endl;

    return 0;
}