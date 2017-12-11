package com.toxin.spring.ex3;

public class Exam {
    private AnswerChecker answerChecker;

    public AnswerChecker getAnswerChecker() {
        return answerChecker;
    }

    public void setAnswerChecker(AnswerChecker answerChecker) {
        System.out.println("Set answer check using setter");
        this.answerChecker = answerChecker;
    }

    public void examCheck() {
        answerChecker.checkAnswer();
    }
}
