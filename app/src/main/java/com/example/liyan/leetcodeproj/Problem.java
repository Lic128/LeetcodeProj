package com.example.liyan.leetcodeproj;

import java.util.List;

/**
 * Created by liyan on 2/5/18.
 */

public class Problem {
    private int id;
    private String title;
    private String url;
    private List<String> companyTags;
    private String difficulty;
    private String content;
    private String discussUrl;
    private List<String> similarQuestions;
    private List<String> topicTags;
    private String total_acs;
    private String total_submitted;
    private boolean isFavorited;


    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public List<String> getCompanyTags() {
        return companyTags;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public String getContent() {
        return content;
    }

    public String getDiscussUrl() {
        return discussUrl;
    }

    public List<String> getSimilarQuestions() {
        return similarQuestions;
    }

    public List<String> getTopicTags() {
        return topicTags;
    }

    public String getTotal_acs() {
        return total_acs;
    }

    public String getTotal_submitted() {
        return total_submitted;
    }

    public boolean isFavorited() {
        return isFavorited;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setDiscussUrl(String discussUrl) {
        this.discussUrl = discussUrl;
    }

    public void setCompanyTags(List<String> companyTags) {
        this.companyTags = companyTags;
    }

    public void setSimilarQuestions(List<String> similarQuestions) {
        this.similarQuestions = similarQuestions;
    }

    public void setTopicTags(List<String> topicTags) {
        this.topicTags = topicTags;
    }

    public void setTotal_acs(String total_acs) {
        this.total_acs = total_acs;
    }

    public void setTotal_submitted(String total_submitted) {
        this.total_submitted = total_submitted;
    }

    public void setFavorited(boolean favorited) {
        isFavorited = favorited;
    }
}
