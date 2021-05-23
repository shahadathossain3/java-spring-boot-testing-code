package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
@Service
public class ArrayListSum {

    public int sumArrayList(int n)
    {
        ArrayList<Integer> number=new ArrayList<>();
        int i=0,sum=0,j=0;
        while(i<=n)
        {
            number.add(i);
            sum+=number.get(i);
            i++;
        }
        return sum/n;
    }


}
