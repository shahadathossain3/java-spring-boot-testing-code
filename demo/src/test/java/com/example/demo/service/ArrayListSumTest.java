package com.example.demo.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;



@SpringBootTest
class ArrayListSumTest {
    @Autowired
    ArrayListSum arrayListSum;
    @Test
    void sumArrayList1() {
        Assertions.assertEquals(5,arrayListSum.sumArrayList(10));
    }

    @Test
    void sumArrayList2() {
        Assertions.assertEquals(50,arrayListSum.sumArrayList(100));
    }

    @Test
    void sumArrayList3() {
        Assertions.assertEquals(100,arrayListSum.sumArrayList(200));
    }
}