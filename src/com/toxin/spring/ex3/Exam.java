package com.toxin.spring.ex3;

public class Exam {
    private AnswerChecker answerChecker;
    private String subject;

    public Exam(String subject) {
        this.subject = subject;
    }

    public AnswerChecker getAnswerChecker() {
        return answerChecker;
    }

    public void setAnswerChecker(AnswerChecker answerChecker) {
        System.out.println("Set answer check using setter");
        this.answerChecker = answerChecker;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void examCheck() {
        answerChecker.checkAnswer();
    }
}
