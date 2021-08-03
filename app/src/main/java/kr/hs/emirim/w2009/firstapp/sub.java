package kr.hs.emirim.w2009.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class sub extends AppCompatActivity {

    ImageView image;
    Button btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        image = findViewById(R.id.image);
        btn_back = findViewById(R.id.btn_back);

        Intent subIntent = new Intent();
        getIntent();
        int data = subIntent.getIntExtra("data",0);

        if (data == 0 ){
            image.setImageResource(R.drawable.winter);
        }else if(data == 1){
            image.setImageResource(R.drawable.karina);
        }else if(data == 2){
            image.setImageResource(R.drawable.jeny);
        }

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent2);
            }
        });
    }
}