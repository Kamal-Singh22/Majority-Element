# Majority-Element
Given an array of integers, find the element that appears more than n/2 times (where n is the size of the array). You may assume that such an element always exists.
Explanation:
This uses the Boyer-Moore Voting Algorithm.

It assumes there's always a majority element.

It maintains a counter and resets the candidate if the counter hits zero.

The final candidate is the majority.....
