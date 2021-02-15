package com.example.lab2.Controller;

import com.example.lab2.Model.AllQuestions;

public class Score {
    public final int CORRECT_ANSWER = 10;
    public final int SKIP_QUESTION = 5;
    public int score;

    public Score(){
        score = 0;
    }

    AllQuestions allQs = new AllQuestions();

    public void correctAnswer(){score = score + CORRECT_ANSWER;}
    public void skipQuestion(){score = score + SKIP_QUESTION;}
    public int getScore(){return score;}

    /* stuff deleted */

}