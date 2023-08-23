package com.example.cache;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class SumService {
    @Cacheable("sumCache")
    public int add(int a, int b) {
        System.out.println("sum is");
        return a + b;
    }
}
