# -*- coding: utf-8 -*-
"""
Created on Fri Dec 20 13:09:15 2019

@author: Lab User
"""

def knapsack_frac(values,weight,capacity):
    index=list(range(len(values)))
    ratio=[v/w for v,w,in zip(values,weight)]
    index.sort(key=lambda i:ratio[i] , reverse=True)
    fractions=[0]*len(values)
    max_value=0
    for i in index:
        if capacity>=weight[i]:
            fractions[i]=1
            max_value +=values[i]
            capacity -= weight[i]
        else:
            fractions[i] = capacity/weight[i]
            max_value += values[i]*capacity/weight[i]
            break
    return fractions,max_value