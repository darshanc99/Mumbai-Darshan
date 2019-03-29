package com.example.dell.screentransitions;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main22Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);
        TextView text=(TextView)findViewById(R.id.textView37);
        text.setMovementMethod(LinkMovementMethod.getInstance());
        Button button2=findViewById(R.id.switch1);
        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent=new Intent(getApplicationContext(), Main20Activity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
