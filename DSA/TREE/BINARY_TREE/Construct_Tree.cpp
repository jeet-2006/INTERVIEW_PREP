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
  
  postOrder(root->left);
  postOrder(root->right);
  
  cout<<root->data<<" ";
}
Node* constructTree () {
  int n;
  cout<<"Enter Data: "<<endl;
  cin>>n;
  
  if (n == -1)
    return NULL;
    
  Node* root = new Node(n);
  
  cout<<"Enter left for: "<<n<<endl;
  root->left = constructTree();
  
  cout<<"Enter right for: "<<n<<endl;
  root->right = constructTree();
  
  return root;
}
int main() 
{
    Node* root = constructTree();
    
    postOrder(root);

    return 0;
}