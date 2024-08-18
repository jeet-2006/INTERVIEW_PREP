#include <iostream>
#include<bits/stdc++.h>
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

int postOrder(Node * root) {
  if (root == NULL) {
    return 0;
  }  
  
  int lh = postOrder(root->left);
  int rh = postOrder(root->right);
  
  if (lh == 0 && rh == 0)
    cout<<root->data<<" ";
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
    
    postOrder(n);

    return 0;
}