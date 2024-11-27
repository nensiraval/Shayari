package com.example.shayri;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class Mypage extends PagerAdapter
{
    MainActivity3 mainActivity3;
    String[] array;
    int[] draw;
    public Mypage(MainActivity3 mainActivity3, String[] array, int[] draw)
    {
        this.mainActivity3 = mainActivity3;
        this.array = array;
        this.draw = draw;
    }

    @Override
    public int getCount()
    {
        return array.length;
    }
    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object)
    {
        return view == object;
    }

    @SuppressLint("MissingInflatedId")
    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        TextView vtext;
        View vv = LayoutInflater.from(mainActivity3).inflate(R.layout.swipe,container,false);
        vtext = vv.findViewById(R.id.vtext);
        vtext.setText(array[position]);
        vtext.setBackgroundResource(draw[position]);

        container.addView(vv);

        return vv;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object)
    {
        container.removeView((View)object);
    }

}
