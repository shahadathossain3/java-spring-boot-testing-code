package com.example.demo.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class FibonacciSumTest {
    @Autowired
    FibonacciSum fibonacciSum;

    @Test
    void fibonacciNumberSun1() {
        Assertions.assertEquals(0,fibonacciSum.fibonacciNumberSun(0));
    }

    @Test
    void fibonacciNumberSun2() {
        Assertions.assertEquals(12,fibonacciSum.fibonacciNumberSun(6));
    }


    @Test
    void fibonacciNumberSun3() {
        Assertions.assertEquals(232,fibonacciSum.fibonacciNumberSun(100));
    }
}