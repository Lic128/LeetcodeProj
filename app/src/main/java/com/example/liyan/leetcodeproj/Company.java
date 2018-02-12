package com.example.liyan.leetcodeproj;

import org.litepal.crud.DataSupport;

import java.util.List;

/**
 * Created by liyan on 2/11/18.
 */

public class Company extends DataSupport {
    private String company;
    private List<Integer> ids;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }
}
