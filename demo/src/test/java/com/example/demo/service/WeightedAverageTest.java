package com.example.demo.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class WeightedAverageTest {
    @Autowired
    WeightedAverage weightedAverage;
    @Test
    void weightAverageValue1() {
        List<Integer> weight=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> value=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Assertions.assertEquals(7,weightedAverage.weightAverageValue(weight,value));
    }

    @Test
    void weightAverageValue2() {
        List<Integer> weight=Arrays.asList(12,45,67,2,22,45,98,36,11,3);
        List<Integer> value= Arrays.asList(23,44,33,45,42,7,77,43,51,9);
        Assertions.assertEquals(41,weightedAverage.weightAverageValue(weight,value));
    }

    @Test
    void weightAverageValue3() {
        List<Integer> weight=Arrays.asList(99,23,544,32,6,7,22,64,78,9,12,93);
        List<Integer> value=Arrays.asList(34,53,88,32,80,32,70,64,42,790,22,1);
        Assertions.assertEquals(53,weightedAverage.weightAverageValue(weight,value));
    }
}