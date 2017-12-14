#!/bin/python3

import sys


N = int(input().strip())

if N%2 != 0 :
    print("Weird")
    
if N%2 == 0 :
    if 2<=N and N<=5:
        print("Not Weird")
    if 6<=N and N<=20:
        print('Weird')
    if 20<N :
        print("Not Weird")
    
