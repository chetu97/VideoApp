package com.chaitanya.sanoriya.videoapp;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class FirstActivity extends AppCompatActivity
{
    private RelativeLayout sportsrel;
    private RelativeLayout pranksrel;
    private RelativeLayout musicrel;
    private RelativeLayout sciencerel;
    private RelativeLayout foodrel;
    private ImageView sportsimage;
    private ImageView pranksimage;
    private ImageView musicimage;
    private ImageView scienceimage;
    private ImageView foodimage;
    private TextView sportstext;
    private TextView prankstext;
    private TextView musictext;
    private TextView sciencetext;
    private TextView foodtext;
    private int sports = 0;
    private int pranks = 0;
    private int music = 0;
    private int science = 0;
    private int food = 0;
    private int count = 0;
    private Button conti_btn;
    private DatabaseHelper myDB;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        sportsimage = (ImageView) findViewById(R.id.sportsimage);
        pranksimage = (ImageView) findViewById(R.id.pranksimage);
        musicimage = (ImageView) findViewById(R.id.musicimage);
        scienceimage = (ImageView) findViewById(R.id.scienceimage);
        foodimage = (ImageView) findViewById(R.id.foodimage);
        sportstext = (TextView) findViewById(R.id.sportstext);
        prankstext = (TextView) findViewById(R.id.prankstext);
        musictext = (TextView) findViewById(R.id.musictext);
        sciencetext = (TextView) findViewById(R.id.sciencetext);
        foodtext = (TextView) findViewById(R.id.foodtext);
        sportsrel = (RelativeLayout) findViewById(R.id.sportsrel);
        pranksrel = (RelativeLayout) findViewById(R.id.pranksrel);
        musicrel = (RelativeLayout) findViewById(R.id.musicrel);
        sciencerel = (RelativeLayout) findViewById(R.id.sciencerel);
        foodrel = (RelativeLayout) findViewById(R.id.foodrel);
        conti_btn = (Button) findViewById(R.id.conti_btn);
        myDB = new DatabaseHelper(FirstActivity.this);
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        sportsrel.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (sports == 0)
                {
                    sportsimage.setImageResource(R.mipmap.sports_on);
                    sports = 1;
                    count++;
                } else
                {
                    sportsimage.setImageResource(R.mipmap.sports_off);
                    sports = 0;
                    count--;
                }
            }
        });
        pranksrel.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (pranks == 0)
                {
                    pranksimage.setImageResource(R.mipmap.pranks_on);
                    pranks = 1;
                    count++;
                } else
                {
                    pranksimage.setImageResource(R.mipmap.panks_off);
                    pranks = 0;
                    count--;
                }
            }
        });
        musicrel.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (music == 0)
                {
                    musicimage.setImageResource(R.mipmap.music_on);
                    music = 1;
                    count++;
                } else
                {
                    musicimage.setImageResource(R.mipmap.music_off);
                    music = 0;
                    count--;
                }
            }
        });
        sciencerel.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (science == 0)
                {
                    scienceimage.setImageResource(R.mipmap.science_on);
                    science = 1;
                    count++;
                } else
                {
                    scienceimage.setImageResource(R.mipmap.science_off);
                    science = 0;
                    count--;
                }
            }
        });
        foodrel.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (food == 0)
                {
                    foodimage.setImageResource(R.mipmap.food_on);
                    food = 1;
                    count++;
                } else
                {
                    foodimage.setImageResource(R.mipmap.food_off);
                    food = 0;
                    count--;
                }
            }
        });

        conti_btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                ArrayList<String> arrayList = new ArrayList<>();
                if(count==0)
                {
                    Toast.makeText(FirstActivity.this, "You have to select atleast one preference", Toast.LENGTH_LONG).show();
                }
                if(count>3)
                {
                    Toast.makeText(FirstActivity.this, "You can atmost select 3 preferences", Toast.LENGTH_LONG).show();
                }
                else
                {

                    if(sports==1)
                    {
                        arrayList.add("sports");
                    }
                    if(music==1)
                    {
                        arrayList.add("music");
                    }
                    if(pranks==1)
                    {
                        arrayList.add("pranks");
                    }
                    if(science==1)
                    {
                        arrayList.add("science");
                    }
                    if(food==1)
                    {
                        arrayList.add("food");
                    }
                    boolean test  = myDB.insertData(arrayList);
                    if(test==true)
                    {
                        Toast.makeText(FirstActivity.this, "Preferences Set", Toast.LENGTH_LONG).show();
                        Intent intent = new Intent();
                        setResult(RESULT_OK,intent);
                        finish();
                    }
                    else
                    {
                        Toast.makeText(FirstActivity.this, "There was a problem with saving your preferences", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}
