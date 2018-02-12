package com.example.liyan.leetcodeproj.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by liyan on 2/11/18.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client= new OkHttpClient();
        Request request= new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
