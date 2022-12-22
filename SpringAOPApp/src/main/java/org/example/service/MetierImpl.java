package org.example.service;

import org.example.aspect.Log;
import org.springframework.stereotype.Service;

@Service
public class MetierImpl implements IMetier {
    @Override
    @Log
    public void process() {
        System.out.println("Busniss process ..........");
    }

    @Override
    @Log
    public double compute() {
        double data = 89;
        System.out.println("Busniss computing...");
        return data;
    }
}
