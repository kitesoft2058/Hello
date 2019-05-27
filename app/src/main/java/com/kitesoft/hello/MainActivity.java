package com.kitesoft.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

// 안드로이드는 화면에 무엇인가를 보여주려면 반드시 Activity를 상속받은 클래스가 있어야함.
public class MainActivity extends AppCompatActivity {

    //생성자처럼 이 MainActivity가 처음 객체로 생성될 때 자동으로 실행되는 콜백메소드
    //이 메소드안에서 화명에 보여질 내용물 뷰를 설정함
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //화면에 보여줄 View를 설정하는 메소드
        setContentView(R.layout.activity_main);
        // 파라미터로 전달된 R.layout.activity_main은 res폴더의 layout폴더안에 있는 activity_main.xml를 보여주겠다는 코드임
    }
}
