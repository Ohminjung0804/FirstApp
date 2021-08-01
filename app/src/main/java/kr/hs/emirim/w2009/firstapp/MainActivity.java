package kr.hs.emirim.w2009.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.text.CaseMap;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_move;
    EditText et_test;
    String str;
    ImageView test;

    @Override
    protected void onCreate(Bundle savedInstanceState) { //어플을 틀었을 때 처음 실행부분
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_move = findViewById(R.id.btn_move);
        et_test = findViewById(R.id.et_test);

        test = findViewById(R.id.test);
        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Toast test", Toast.LENGTH_SHORT).show();      //본인의 액티비티
            }
        });

        btn_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = et_test.getText().toString();                             // editText에 적은 내용을 str로 옮기는데 toString을 사용해 문자열로 변경해야함
                Intent intent = new Intent(MainActivity.this, sub.class); //첫 번째 인자는 현재 activity, 두 번째 인자는 이동 할 activity
                intent.putExtra("str", str); //데이터 이동
                startActivity(intent); //activity 이동
            }
        });




    }}