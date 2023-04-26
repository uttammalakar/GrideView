package com.example.grideview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    Context context;
    int[] flags;
    String[] countryName;
    private LayoutInflater inflater;
    CustomAdapter(Context context,String[] countryName,int[] flags)
    {
        this.context=context;
        this.countryName=countryName;
        this.flags=flags;

    }
    @Override
    public int getCount() {
        return countryName.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if (view==null)
        {
            inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view=inflater.inflate(R.layout.sampal,viewGroup,false);
        }
        ImageView imageView=view.findViewById(R.id.imageViewId);
        TextView textView=view.findViewById(R.id.textViewId);
        imageView.setImageResource(flags[i]);
        textView.setText(countryName[i]);
        return view;
    }
}
