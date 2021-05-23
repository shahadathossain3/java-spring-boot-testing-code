package com.example.demo.service;


import org.springframework.stereotype.Service;

@Service
public class FibonacciSum {
    public int fibonacciNumberSun(int n)
    {
        int firstTerm = 0, secondTerm = 1,sum=0;
        while (firstTerm <=n) {
            sum+=firstTerm;
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        return sum;
    }
}
