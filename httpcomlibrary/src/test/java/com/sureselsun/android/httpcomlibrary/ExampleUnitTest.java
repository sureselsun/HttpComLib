package com.sureselsun.android.httpcomlibrary;

import android.util.Log;

import org.junit.Test;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    private static final String Tag = "ExampleUnitTest" ;

    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void http_get(){
        try {
            OkHttpClient client = new OkHttpClient();
            Request request = new Request.Builder().url("https://www.baidu.com").build();
            Response response = client.newCall(request).execute();
            if(response.isSuccessful()){
                System.out.println(Tag+"response.code()=="+response.code());
                System.out.println(Tag+"response.message()=="+response.message());
                System.out.println(Tag+"res=="+response.body().string());
            }
        }catch (IOException e){
            System.out.println(Tag+e.getMessage());
        }
    }
}