package com.example.dell.screentransitions;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main21Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main21);
        TextView text=findViewById(R.id.textView38);
        text.setMovementMethod(LinkMovementMethod.getInstance());
        Button button1=findViewById(R.id.switch2);
        button1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent=new Intent(getApplicationContext(), Main20Activity.class);
                startActivity(intent);
                finish();
            }
        });
    }

}
