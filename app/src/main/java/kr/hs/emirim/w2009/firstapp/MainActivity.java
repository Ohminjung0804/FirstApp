package kr.hs.emirim.w2009.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
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

    EditText et_save;
    String shared = "file";

    @Override
    protected void onCreate(Bundle savedInstanceState) { //어플을 틀었을 때 처음 실행부분
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_save = findViewById(R.id.et_save);
        SharedPreferences sharedPreferences = getSharedPreferences(shared, 0);
        String value = sharedPreferences.getString("value","");//defValue 꺼내오기 때문에 빈 값을 씀
        et_save.setText(value);
    }

    @Override
    protected void onDestroy() { //메인 액티비티를 벗어났을 때 호출됨
        super.onDestroy();
        SharedPreferences sharedPreferences = getSharedPreferences(shared, 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        String value = et_save.getText().toString();
        editor.putString("value",value);
        editor.commit();
        //sharedPreferences안에 editor를 연결
        //editor = 저장할 때 불러와야 하는 것
    }
}