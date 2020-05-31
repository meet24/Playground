#include<iostream>
#include<stdio.h>
#include<stdlib.h>
int i,j;
int** memory(int c,int r){
int **a;
a=(int **)malloc(c*sizeof(int*));
for(i=0;i<c;i++)
*(a+i)=(int *)malloc(r*sizeof(int));
return a;
}
int main()
{
int **a,**b,r,c;
std::cin>>r;
std::cin>>c;
a=memory(c,r);
b=memory(c,r);
for(i=0;i<r;i++){
for(j=0;j<c;j++){
std::cin>>a[i][j];
}
}
for(i=0;i<r;i++){
for(j=0;j<c;j++){
std::cin>>b[i][j];
}
}for(i=0;i<r;i++){
for(j=0;j<c;j++){
std::cout<<a[i][j]+b[i][j]<<" ";
}std::cout<<"\n";
}
return 0;
}