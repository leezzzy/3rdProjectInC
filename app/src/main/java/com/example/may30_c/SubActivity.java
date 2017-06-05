package com.example.may30_c;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);


//        Button을 눌렀을 때 EditText에 들어간 텍스트를 TextView로 보냄, Button에 리스너 생성
        final EditText edittext=(EditText)findViewById(R.id.edittext);
        Button button=(Button)findViewById(R.id.button);
        final TextView textView=(TextView)findViewById(R.id.textview);

//      button은 클릭했을 때 액션을 취함함 -> setnClickListener를 이용, 리스너 생성.
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            // onClick메소드 안에 버튼이 클릭되었을 때 실행될 행동 삽입.
            public void onClick(View v) {
                // 버튼이 눌렸을 때 나올 액션 설정
                // textView.setText();는 TextView에 들어갈 텍스트를 설정하는 코드
                // edittext.getText()는 EditText에서 입력된 텍스트를 불러오는 코드
                textView.setText(edittext.getText());
            }
        });
    }
}


