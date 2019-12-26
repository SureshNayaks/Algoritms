# -*- coding: utf-8 -*-
"""
Created on Tue Dec 17 09:10:07 2019

@author: Lab User
"""

def Day_1(nums,target):
   two_sum = dict() # key is a num in nums, value is num's index
        
   for i in range(len(nums)):
       complement=target-nums[i]
       if complement not in two_sum:
           two_sum[nums[i]]=i
       else:
           return [nums[two_sum[complement]],nums[i]]
