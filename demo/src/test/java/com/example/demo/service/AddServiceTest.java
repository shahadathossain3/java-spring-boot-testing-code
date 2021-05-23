package com.example.demo.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class AddServiceTest {
    @Autowired
    AddService addService;
    @Test
    void add() {

        Assertions.assertEquals(3,addService.Add(1,2));
    }
}