package com.example.dell.screentransitions;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main20Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main20);
        Button button4=findViewById(R.id.radioButton2);
        button4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent=new Intent(getApplicationContext(), Main22Activity.class);
                startActivity(intent);
                finish();
            }
        });
        Button button1=findViewById(R.id.radioButton3);
        button1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent=new Intent(getApplicationContext(), Main21Activity.class);
                startActivity(intent);
                finish();
            }
        });
        Button button2=findViewById(R.id.radioButton4);
        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent=new Intent(getApplicationContext(), Main23Activity.class);
                startActivity(intent);
                finish();
            }
        });

        Button button5=findViewById(R.id.button35);
        button5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
