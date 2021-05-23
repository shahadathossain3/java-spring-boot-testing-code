package com.example.demo.service;


import org.springframework.stereotype.Service;

@Service
public class FibonacciPosition {

    public int fabonacciNumberPosition(int n, int position)
    {
        int firstTerm = 0, secondTerm = 1,result=0,average=0,i=1;
        while (firstTerm <=n) {
            if(i==position)
            {
                result=firstTerm;
            }
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
            i++;

        }
        return result;
    }
}
