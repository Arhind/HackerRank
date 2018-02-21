#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

int main(){
    int N;
    scanf("%d",&N);

    if( N%2 != 0 ){ printf("Weird"); }

    if( N%2 == 0 )
    {
         if( 2<N && N<5)
          { printf("Not Weird");
          return N;}

        else if( 6<N && N<=20)
          { printf("Weird");
          return N;}

        else ( 20<N);
          { printf("Not Weird");
              return N;}

    }
}
