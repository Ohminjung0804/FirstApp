package kr.hs.emirim.w2009.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class sub extends AppCompatActivity {

    TextView tv_sub;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        tv_sub = findViewById(R.id.tv_sub);

        Intent intent = getIntent(); //어디선가 오는 인텐트를 받는다
        String str = intent.getStringExtra("str"); //main에서 오는 str을 str로 받음
        tv_sub.setText(str);
    }
}