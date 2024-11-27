package com.example.shayri;

import static android.content.Context.CLIPBOARD_SERVICE;
import static androidx.core.content.ContextCompat.getSystemService;
import static androidx.core.content.ContextCompat.startActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.WindowDecorActionBar;

public class  second extends BaseAdapter
{
    String[] blank;
    MainActivity2 mainActivity2;
    int[] draw;
    public second(String[] blank, MainActivity2 mainActivity2, int[] draw)
    {
            this.blank = blank;
            this.mainActivity2 = mainActivity2;
            this.draw = draw;
    }
    @Override
    public int getCount()
    {
        return blank.length;
    }

    @Override
    public Object getItem(int position) {
        return blank[position];
    }

    @Override
    public long getItemId(int position) {
        return (long) position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        convertView = LayoutInflater.from(mainActivity2).inflate(R.layout.secondpage, parent, false);
        TextView txt2;
        TextView Wp;
        TextView share;
        TextView copy;
        Wp = convertView.findViewById(R.id.Wp);
        copy = convertView.findViewById(R.id.copy);
        share = convertView.findViewById(R.id.share);
        txt2 = convertView.findViewById(R.id.txt2);
        txt2.setText(blank[position]);
        txt2.setBackgroundResource(draw[position]);

        Wp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent whatsappIntent = new Intent(Intent.ACTION_SEND);
                whatsappIntent.setType("text/plain");
                whatsappIntent.setPackage("com.whatsapp");
                whatsappIntent.putExtra(Intent.EXTRA_TEXT, blank[position]);
                try {
                    mainActivity2.startActivity(whatsappIntent);
                } catch (android.content.ActivityNotFoundException ex) {
                }
            }
        });
        copy.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                ClipboardManager clipboard = (ClipboardManager) mainActivity2.getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("label", blank[position]);
                Toast.makeText(mainActivity2, "Copied", Toast.LENGTH_SHORT).show();
                clipboard.setPrimaryClip(clip);
            }
        });
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // newgit

                Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                String shareBody = "Your body here";
                String shareSub = "Your subject here";
                sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, shareSub);
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
                mainActivity2.startActivity(Intent.createChooser(sharingIntent, "Share using"));
            }
        });
        return convertView;
    }


}
