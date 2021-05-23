package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class WeightedAverage {
    public static int weightAverageValue( List<Integer> weight,List<Integer> value)
    {
        List<Integer> weightlist=new ArrayList<Integer>();
        List<Integer> valuelist=new ArrayList<Integer>();
        int sum1=0,sum2=0,n=11;
        for(Integer i:weight)
        {

         weightlist.add(i);
        }
        for (Integer i:value) {
            valuelist.add(i);
        }
        int len=weightlist.size();
        int j=0;
        while (j<len)
        {
            sum1+=weightlist.get(j)*valuelist.get(j);

            sum2+=valuelist.get(j);

            j++;
        }
        System.out.println("This is Sum1 = "+sum1);
        System.out.println("This is Sum2 = "+sum2);
        return sum1/sum2;
    }


}
