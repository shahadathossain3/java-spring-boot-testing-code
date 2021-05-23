package com.example.demo.service;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class FibonacciPositionTest {
    @Autowired
    FibonacciPosition fibonacciPosition;
    @Test
    void fabonacciNumberPosition1() {
        Assertions.assertEquals(0,fibonacciPosition.fabonacciNumberPosition(0,1));
    }

    @Test
    void fabonacciNumberPosition2() {
        Assertions.assertEquals(2,fibonacciPosition.fabonacciNumberPosition(6,4));
    }

    @Test
    void fabonacciNumberPosition3() {
        Assertions.assertEquals(55,fibonacciPosition.fabonacciNumberPosition(100,11));
    }
}