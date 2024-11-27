package com.example.shayri;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Myclass extends BaseAdapter
{
    String[] n;
    MainActivity mainActivity;
    int[] image;
    int[] draw;

    public Myclass(String[] n, MainActivity mainActivity, int[] image, int[] draw)
    {
        this.n = n;
        this.mainActivity = mainActivity;
        this.image = image;
        this.draw = draw;
    }

    @Override
    public int getCount()
    {
        return n.length;
    }

    @Override
    public Object getItem(int position)
    {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return (long) position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        ImageView im;
        convertView = LayoutInflater.from(mainActivity).inflate(R.layout.card, parent, false);
        im = convertView.findViewById(R.id.image);
        im.setBackgroundResource(image[position]);
        TextView txt;
        txt = convertView.findViewById(R.id.txt);
        txt.setBackgroundResource(draw[position]);
        txt.setText(n[position]);
        return convertView;
    }
}
