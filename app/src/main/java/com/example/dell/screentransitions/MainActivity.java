package com.example.dell.screentransitions;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    static boolean check=false;
      @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(!check){
            check=true;
            MediaPlayer anthem= MediaPlayer.create(MainActivity.this,R.raw.anthem);
            anthem.start();
        }
        Button button=findViewById(R.id.checkBox4);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent=new Intent(getApplicationContext(), Main19Activity.class);
                startActivity(intent);
                finish();
            }
        });
        Button button1=findViewById(R.id.checkBox2);
        button1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.olacabs.com/"));
                startActivity(intent);
            }
        });
          Button button2=findViewById(R.id.checkBox5);
          button2.setOnClickListener(new View.OnClickListener(){
              public void onClick(View view){
                  Intent intent = new Intent();
                  intent.setAction(Intent.ACTION_VIEW);
                  intent.addCategory(Intent.CATEGORY_BROWSABLE);
                  intent.setData(Uri.parse("https://timesofindia.indiatimes.com/city/mumbai"));
                  startActivity(intent);
              }
          });
          Button button3=findViewById(R.id.checkBox3);
          button3.setOnClickListener(new View.OnClickListener(){
              public void onClick(View view){
                  Intent intent = new Intent();
                  intent.setAction(Intent.ACTION_VIEW);
                  intent.addCategory(Intent.CATEGORY_BROWSABLE);
                  intent.setData(Uri.parse("https://maps.google.com/"));
                  startActivity(intent);
              }
          });
          Button button4=findViewById(R.id.radioButton);
          button4.setOnClickListener(new View.OnClickListener(){
              public void onClick(View view){
                  Intent intent=new Intent(getApplicationContext(), Main20Activity.class);
                  startActivity(intent);
                  finish();
              }
          });
    }
}
