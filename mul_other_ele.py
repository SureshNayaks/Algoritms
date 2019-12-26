# -*- coding: utf-8 -*-
"""
Created on Wed Dec 18 08:25:23 2019

@author: Lab User
"""
def Mul_Oth(List):
    result=[]
    n=len(List)
    for i in range(n):
        p=List.pop(0)
        mul=1
        for j in range(len(List)):
            mul=mul*List[j]
        result.append(mul)
        List.append(p)
    print (result)