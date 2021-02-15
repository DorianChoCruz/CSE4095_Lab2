package com.example.lab2.Controller;

public class NextQuestion {

    private static int index = 0;

    public int getCurrentQuestion() {
        return index;
    }

    public static int getNextQuestionIndex() {
        index++;
        return index;
    }
}