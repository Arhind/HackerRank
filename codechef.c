#include <stdio.h>
 
void main() 
{ 
int T, N, M, i, j, x;
char str[100][100];

scanf("%d",&T);    
for( x=1; x<=T; x++)
{
  scanf("%d %d",&N, &M);
   for( i=1; i<=N; i++)
   {
    for( j=1; j<=M; j++)
    {
        scanf("%c\n", &str[i][j]);
    }
    printf("\n");
     }
   }   
 
do{
 slength = strlen(str[i][j]);
 for( i=1; i<=slength; i++)
{
	
