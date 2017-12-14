#!/bin/python3

import sys

def factorial(n):
    # Complete this function
    if( n==0 or n==1 ):
      return n
    else:
      n = n * factorial(n-1)
      return (n)

n = int(input().strip())
result = factorial(n)
print(result)
