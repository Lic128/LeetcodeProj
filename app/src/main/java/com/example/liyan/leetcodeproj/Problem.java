package com.example.liyan.leetcodeproj;

/**
 * Created by liyan on 2/5/18.
 */

public class Problem {
    private double acceptRate;
    private String difficulty;
    private String title;
    private String description;
    public Problem( String title,String description, String difficulty, double acceptRate){
        this.difficulty= difficulty;
        this.description= description;
        this.title= title;
        this.acceptRate=acceptRate;
    }
    public String getTitle(){
        return title;
    }
    public String getDescription(){
        return description;
    }
    public String getDifficulty(){
        return difficulty;
    }
    public double getAcceptRate(){
        return acceptRate;
    }
}
