package kr.hs.emirim.w2009.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.text.CaseMap;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

//    Button btn_move;
//    EditText et_test;
//    String str;
//    ImageView test;

    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) { //어플을 틀었을 때 처음 실행부분
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = findViewById(R.id.list);

        //데이터 저장용(List 자료형)
        ArrayList<String> data = new ArrayList<String>();

        //this = 현재 액티비티
        //Adapter = ArrayList와 ListView의 중가다리 역할
        //안드로이드에서 제공하는 UI 디자인
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,data);
        list.setAdapter(adapter); //list에 adapter를 셋팅(연결)
        data.add("test1");
        data.add("test2");
        adapter.notifyDataSetChanged(); //현재 상태를 저장하겠다


//        btn_move = findViewById(R.id.btn_move);
//        et_test = findViewById(R.id.et_test);
//
//        test = findViewById(R.id.test);
//        test.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(), "Toast test", Toast.LENGTH_SHORT).show();      //본인의 액티비티
//            }
//        });
//
//        btn_move.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                str = et_test.getText().toString();                             // editText에 적은 내용을 str로 옮기는데 toString을 사용해 문자열로 변경해야함
//                Intent intent = new Intent(MainActivity.this, sub.class); //첫 번째 인자는 현재 activity, 두 번째 인자는 이동 할 activity
//                intent.putExtra("str", str); //데이터 이동
//                startActivity(intent); //activity 이동
//            }
//        });
    }}