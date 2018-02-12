package com.example.liyan.leetcodeproj.util;

import android.text.TextUtils;

import com.example.liyan.leetcodeproj.model.Problem;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by liyan on 2/11/18.
 */

public class Utility {
    /**
     * 解析和处理服务器返回的题目数据, use GSON here;
     */
    public static boolean handleProblemResponse(String response){
        if(!TextUtils.isEmpty(response)){
            try{
                JSONArray allProblems= new JSONArray(response);
                for(int i=0; i<allProblems.length(); i++){
                    JSONObject problemObject= allProblems.getJSONObject(i);
                    Problem problem= new Problem();
                    problem.setId(problemObject.getInt("id"));
                    problem.save();
                }
                return true;
            }catch(JSONException e){
                e.printStackTrace();
            }
        }
        return false;
    }


}
