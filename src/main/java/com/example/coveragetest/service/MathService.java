package com.example.coveragetest.service;

import org.springframework.stereotype.Service;

@Service
public class MathService {

    public int sub(int a, int b) {
        return a - b;
    }

    public int add(int a, int b) {
        return a + b;
    }
}
