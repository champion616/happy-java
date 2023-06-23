package com.example.myproject;

import com.example.fw.Controller;

public class FirstController extends Controller {
    @Override
    protected void run() {
        System.out.println("별도로 동작하는 코드 11111");
    }

//    @Override
//    protected void init() { // 'init()' cannot override 'init()' in 'com.example.fw.Controller'; overridden method is final
//        System.out.println("내 마음대로 init");
//    }
}
