package com.it.zjhz.hellostudio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("原谅我这一首不为谁而作的歌");
        System.out.println("我站在七月的洪流上");
        System.out.println("过了很久终于我愿抬头看");
    }
}
