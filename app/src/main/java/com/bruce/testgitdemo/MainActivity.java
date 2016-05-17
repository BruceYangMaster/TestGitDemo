package com.bruce.testgitdemo;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {
    //这是一个测试版的
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //测试一下,再来
    }

    /**
     * 测试方法
     */
    public void tes() {
        String name = "杨杰_方俊";
        //这是一个测试方法
        //这又是测试
    }

    /**
     * 测试方法第二个
     */
    public void testTwo() {
        //这是第二个测试方法
        String name = "name ";
        int age = 20;

    }
}
