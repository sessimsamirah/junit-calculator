package com.samirahsessim.calculator;

public class Calculator {

    public int sum(int num_1, int num_2) {
        if (num_1 < 0 || num_2 < 0 ){
            throw new RuntimeException("");
        }
        return num_1 + num_2;
    }

    public int subtraction(int num_1, int num_2) {
        return num_1 - num_2;
    }

    public int multiplication(int num_1, int num_2) {
        return num_1 * num_2;
    }

    public float split(int num_1, int num_2) {
        if (num_1 <= 0 || num_2 <= 0) {
            throw new RuntimeException("");
        }
        return num_1 / num_2;
    }
}