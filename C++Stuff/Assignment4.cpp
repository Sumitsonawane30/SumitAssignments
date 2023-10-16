#include<iostream>
using namespace std;
struct node
{
    char data;
    struct node*left;
    struct node*right;

};
class stack
{
   node*data[10];
   int top;
   public:
   stack()
   {
    top=-1;
   } 
   node*topdata()
   {
    return(data[top]);
   }
   void push(node*p)
   {
    data[++top]=p;
   }
   node*pop()
   {
    return (data[top--]);
   }

};
node*create (char postfix[10])
{
    node*p;
    stack s;
    for(int i=0;postfix[i]!='\0';i++)
    {
        char token=postfix[i];
        if(isalnum(token))
        {
            p=new node;
            p->data=token;
            p->right=NULL;
            p->left=NULL;
            s.push(p);
        }
        else
        {
            p=new node;
            p->data=token;
            p->right=s.pop();
            p->left=s.pop();
            s.push(p);
        }
    }
    return s.pop();
}
void preorder(node*p)
{
    if(p!=NULL)
    {
        cout<<p->data;
        preorder(p->left);
        preorder(p->right);
    }
}
void inorder(node*p)
{
    if(p!=NULL)
    {
        inorder(p->left);
        cout<<p->data;
        inorder(p->right);
    }
}
void postorder(node*p)
{
    if(p!=NULL)
    {
        postorder(p->left);
        postorder(p->right);
        cout<<p->data;
    }
}
int main()
{
    node*r=NULL;
    int ch;
    char postfix[10];
    do
    {
        cout<<"\n1.Construct Postfix tree\n2.PREORDER\n3.INORDER\n4.POSTORDER\n5.EXIT";
        cout<<"\nEnter Your Choice:";
        cin>>ch;
        switch(ch)
        {
            case 1://To construct Tree
            cout<<"\nEnter postfix Expression:";
            cin>>postfix;
            r=create(postfix);
            cout<<"\nTree Created Successfully";
            break;;
            case 2://PREORDER
            cout<<"\nPreorder Traversal";
            preorder(r);
            break;
            case  3://INORDER
            cout<<"\nInorder Traversal";
            inorder(r);
            break;
            case 4://POSTORDER
            cout<<"Postorder Traversal";
            postorder(r);
            break;
        }
    }
    while(ch!=5);
    return 0;

}