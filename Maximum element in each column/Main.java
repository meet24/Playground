#include<iostream> 
using namespace std; 
const int MAX = 10;
void largestInColumn(int mat[MAX][MAX],int rows,int cols) 
{ 
	for(int i=0;i<cols;i++)
	{
	    int maxm = mat[0][i]; 
        for(int j=1;j<rows;j++) 
        {
            if(mat[j][i]>maxm) 
			{
			    maxm = mat[j][i];
			}
		}
		cout<<maxm<<endl; 
	} 
}
int main() 
{ 
	int n,m,i,j,mat[MAX][MAX];
	//cout<<"Enter the number of rows and columns of the matrix : ";
    cin>>m;
    cin>>n;
    //cout << "Enter the array elements : ";
    for(i=0;i<m;i++)
    {
        for(j=0;j<n;j++)
        {
            cin>>mat[i][j];
        }
    }
    //cout<<"Matrix : \n ";
	largestInColumn(mat,m,n);
	return 0;
}