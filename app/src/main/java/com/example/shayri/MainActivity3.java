package com.example.shayri;

import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager.widget.ViewPager;


public class MainActivity3 extends AppCompatActivity {
//    TextView txt;
    Button next, previous;
    ViewPager vpager;
    int p = 0;
    int draw[] = {R.drawable.even,R.drawable.fn, R.drawable.lv, R.drawable.night, R.drawable.np, R.drawable.cl, R.drawable.np, R.drawable.even, R.drawable.lv, R.drawable.even, R.drawable.night, R.drawable.cl};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);

        next = findViewById(R.id.next);
        previous = findViewById(R.id.previous);
        vpager = findViewById(R.id.vpager);

        String[] array = getIntent().getStringArrayExtra("array");
        String n = getIntent().getStringExtra("shayri");
        int a = getIntent().getIntExtra("Int",0);
        Log.e("--", "onCreate: "+a);

        Mypage pg = new Mypage(this, array,draw);
        vpager.setAdapter(pg);
        vpager.setCurrentItem(a);
        p = vpager.getCurrentItem();

        next.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                p++;
                vpager.setCurrentItem(p);
            }
        });

        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                p--;
                vpager.setCurrentItem(p);
            }
        });
    }
}