package org.example.service;

import org.springframework.stereotype.Service;

@Service
public class MetierImpl implements IMetier {
    @Override
    public void process() {
        System.out.println("Busniss process ..........");
    }

    @Override
    public double compute() {
        double data = 89;
        System.out.println("Busniss computing...");
        return data;
    }
}
