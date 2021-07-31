package kr.hs.emirim.w2009.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.text.CaseMap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btn_move;
    @Override
    protected void onCreate(Bundle savedInstanceState) { //어플을 틀었을 때 처음 실행부분
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_move = findViewById(R.id.btn_move);
        btn_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, sub.class); //첫 번째 인자는 현재 activity, 두 번째 인자는 이동 할 activity
                startActivity(intent); //activity 이동
            }
        });

    }}