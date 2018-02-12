package com.example.liyan.leetcodeproj.model;

import org.litepal.crud.DataSupport;

import java.util.List;

/**
 * Created by liyan on 2/11/18.
 */

public class Topic extends DataSupport {
    private String topic;
    private List<Integer> ids;

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }
}
