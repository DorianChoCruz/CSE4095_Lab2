package com.example.lab2.Model;

import com.example.lab2.R;

public class AllQuestions {

    private int questionIndex;

    private Question[] allQuestions = {
            new Question(R.string.q_start, true),
            new Question(R.string.Question_Croc, true),
            new Question(R.string.Question_Vit, true),
            new Question(R.string.Question_China, true),
            new Question(R.string.Question_Body, true),
            new Question(R.string.Question_Chon, true),
            new Question(R.string.Question_UNO, true),
            new Question(R.string.Question_Wool, true),
            new Question(R.string.Question_Penguin, true),
            new Question(R.string.Question_Texas, true),
            new Question(R.string.q_start, true),
    };

    public AllQuestions() {
        questionIndex = 0;
    }
    public Question getQuestion(int index){
        index = index % allQuestions.length;
        return allQuestions[index];
    }

    /* stuff deleted
    private Question[] allQuestions = ...
    */

}