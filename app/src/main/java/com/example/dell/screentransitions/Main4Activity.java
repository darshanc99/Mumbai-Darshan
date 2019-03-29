package com.example.dell.screentransitions;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        TextView text=(TextView)findViewById(R.id.textView9);
        text.setMovementMethod(LinkMovementMethod.getInstance());
        Button button=(Button)findViewById(R.id.button6);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        Button button1=(Button)findViewById(R.id.button7);
        button1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent=new Intent(getApplicationContext(), Main5Activity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
