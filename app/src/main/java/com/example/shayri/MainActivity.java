package com.example.shayri;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{
    ListView list;
    String n[] = {"Morning", "Evening", "Night", "Cool", "Sad", "Attitude", "Love", "Funny", "Life", "Birthday", "Motivation","Anniversary"};

    int image[] = {R.drawable.goodm, R.drawable.goode,R.drawable.goodng,R.drawable.coold,R.drawable.sad,R.drawable.atti,R.drawable.love,R.drawable.funny,R.drawable.life1,R.drawable.birth,R.drawable.motivation,R.drawable.annivesary};
    int draw[] = {R.drawable.yel, R.drawable.night,R.drawable.lv,R.drawable.fn,R.drawable.np,R.drawable.even,R.drawable.cl,R.drawable.lv,R.drawable.even,R.drawable.cl,R.drawable.np,R.drawable.yel};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = findViewById(R.id.list);

        Myclass np = new Myclass(n, MainActivity.this,image, draw);
        list.setAdapter(np);

            list.setOnItemClickListener(new AdapterView.OnItemClickListener()
            {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                Log.e("+++", "onItemClick: " + position);
                String a = n[position];
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                i.putExtra("new", a);
                startActivity(i);
            }
        });
    }
}