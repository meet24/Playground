#include <bits/stdc++.h> 

using namespace std; 


int main() 

{ 

int n,m;
std::cin>>n;
std::cin>>m;

int mat[n][m];

for(int i=0;i<n;i++)
{
    for(int j=0;j<m;j++)
    {
        std::cin>>mat[i][j];
    }
}



for (int i = 0; i < n; i++) { 
int maxm = mat[i][0]; 

for (int j = 0; j < m; j++) { 



if (mat[i][j] > maxm) 

maxm = mat[i][j]; 

} 

cout << maxm << endl; 


} 


return 0; 

}