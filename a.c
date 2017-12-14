#include<stdio.h>
 
int main() {
 
	// Define the two integer variables
	int L,R;
	int i;
 
	// Get L and R from the user
	scanf("%d %d" , &L, &R);
    
	// Write here the logic to print all integers between L and R
 for( i=L; i=R; i++) {
     printf("%d", i);
     printf("\t");
 }    
	return 0;
}
