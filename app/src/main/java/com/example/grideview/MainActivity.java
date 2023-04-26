package com.example.grideview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CursorAdapter;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   private GridView gridView;
   String[] countryName;
   int[] flags={R.drawable.australia,R.drawable.bel,R.drawable.greece,
           R.drawable.ind,R.drawable.mayanmar,R.drawable.potugal,
           R.drawable.rose,R.drawable.sunflower,R.drawable.usa
   };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countryName=getResources().getStringArray(R.array.country_names);
        gridView=findViewById(R.id.greedId);
        CustomAdapter adapter=new CustomAdapter(this,countryName,flags);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String valu=countryName[position];
                Toast.makeText(MainActivity.this,valu, Toast.LENGTH_SHORT).show();
            }
        });
    }
}