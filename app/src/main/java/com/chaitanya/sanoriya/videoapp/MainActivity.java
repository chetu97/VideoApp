package com.chaitanya.sanoriya.videoapp;

import android.Manifest;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.dailymotion.android.player.sdk.PlayerWebView;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerFragment;
import com.google.android.youtube.player.YouTubePlayerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements YouTubePlayer.OnInitializedListener
{
    public static final String DEVELOPER_KEY = "AIzaSyARcOWlSk30cfUFSco13GhC3Y-e52qGuLs";
    private static final int RECOVERY_DIALOG_REQUEST = 1;
    private String YOUTUBE_VIDEO_ID_1 = "yfWKfFKAhJk";
    private String YOUTUBE_VIDEO_ID_2 = "bFBj2GM1hEg";
    private String YOUTUBE_VIDEO_ID_3 = "jeny_2yymlM";
    private String YOUTUBE_VIDEO_ID_4 = "5giQCTAy33o";
    private String YOUTUBE_VIDEO_ID_5 = "Foojp8CMraw";
    private String DAILYMOTION_VIDEO_ID_1 = "x5dy5zp";
    private String DAILYMOTION_VIDEO_ID_2 = "x408c9n";
    private String DAILYMOTION_VIDEO_ID_3 = "x14ydka";
    private String DAILYMOTION_VIDEO_ID_4 = "x1v27ac";
    private String DAILYMOTION_VIDEO_ID_5 = "x5zv0x8";
    SharedPreferences prefs = null;
    private DatabaseHelper myDB;
    private YouTubePlayerFragment youTubePlayerFragment;
    private PlayerWebView mVideoView;
    private Button preferences;
    private int flag = 2;
    private ImageView img1;
    private ImageView img2;
    private ImageView img3;
    private YouTubePlayer youTubePlayer;
    private RelativeLayout img1rel;
    private RelativeLayout img2rel;
    private RelativeLayout img3rel;
    private ScrollView scrollView;
    private int count = 1;
    private TextView img1txt;
    private TextView img2txt;
    private TextView img3txt;
    private Member m;
    private ArrayList<String> arrayList;
    private ArrayList<String> arrayList_1;
    private ArrayList<String> arrayList_2;
    private Struct struct;
    private T t;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        preferences = (Button) findViewById(R.id.preferences);
        mVideoView = (PlayerWebView) findViewById(R.id.dm_player_web_view);
        youTubePlayerFragment = (YouTubePlayerFragment) getFragmentManager().findFragmentById(R.id.youtubeplayerfragment);
        img1 = (ImageView) findViewById(R.id.img1);
        img2 = (ImageView) findViewById(R.id.img2);
        img3 = (ImageView) findViewById(R.id.img3);
        img1rel = (RelativeLayout) findViewById(R.id.img1rel);
        img2rel = (RelativeLayout) findViewById(R.id.img2rel);
        img3rel = (RelativeLayout) findViewById(R.id.img3rel);
        img1txt = (TextView) findViewById(R.id.img1txt);
        img2txt = (TextView) findViewById(R.id.img2txt);
        img3txt = (TextView) findViewById(R.id.img3txt);
        scrollView = (ScrollView) findViewById(R.id.scrollview);
        prefs = getSharedPreferences("com.chaitanya.sanoriya.videoapp", MODE_PRIVATE);
        myDB = new DatabaseHelper(MainActivity.this);
        if (prefs.getBoolean("firstrun", true))
        {
            Intent intent = new Intent(MainActivity.this, FirstActivity.class);
            startActivityForResult(intent,1);
            prefs.edit().putBoolean("firstrun", false).commit();
        }
        youTubePlayerFragment.initialize(DEVELOPER_KEY, this);
        //mVideoView.load(DAILYMOTION_VIDEO_ID_2);
        boolean status = myDB.checkdata();
        if (status == false)
        {
            Intent intent = new Intent(MainActivity.this, FirstActivity.class);
            Toast.makeText(this, "Please choose your Preferences", Toast.LENGTH_SHORT).show();
            startActivityForResult(intent,1);
        }
        Cursor data = myDB.getData();
        ArrayList<String> arrayList = new ArrayList<>();
        while (data.moveToNext())
        {
            arrayList.add(data.getString(0));
        }
        arrayList_1 = (ArrayList<String>) arrayList.clone();
        arrayList_2 = (ArrayList<String>) arrayList.clone();
        preferences.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this, FirstActivity.class);
                startActivityForResult(intent,1);
            }
        });
        for (int i = 0; i < arrayList.size(); i++)
        {
            m = type(arrayList.get(i), i);
            if (i == 0)
            {
                img1.setImageResource(m.val);
                img1txt.setText(m.str);
            } else if (i == 1)
            {
                img2.setImageResource(m.val);
                img2txt.setText(m.str);
            } else
            {
                img3.setImageResource(m.val);
                img3txt.setText(m.str);
            }
        }
        t = new T();
    }

    @Override
    protected void onPostResume()
    {
        super.onPostResume();
        mVideoView.pause();
    }


    @Override
    protected void onResume()
    {
        super.onResume();
        img1rel.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                flag = 1;
                struct = t.rt(arrayList_1.get(0), arrayList_1.get(1), arrayList_1.get(2), flag);
                img1.setImageResource(struct.img1);
                img2.setImageResource(struct.img2);
                img3.setImageResource(struct.img3);
                play_video(flag,youTubePlayer);
                /*img1.setImageResource(R.mipmap.sports_on);
                img2.setImageResource(R.mipmap.music_off);
                img3.setImageResource(R.mipmap.panks_off);
                youTubePlayer.loadVideo(YOUTUBE_VIDEO_ID_1);
                mVideoView.load(DAILYMOTION_VIDEO_ID_1);*/
            }
        });
        img2rel.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                flag = 2;
                struct = t.rt(arrayList_1.get(0), arrayList_1.get(1), arrayList_1.get(2), flag);
                img1.setImageResource(struct.img1);
                img2.setImageResource(struct.img2);
                img3.setImageResource(struct.img3);
                play_video(flag,youTubePlayer);
                /*img1.setImageResource(R.mipmap.sports_off);
                img2.setImageResource(R.mipmap.music_on);
                img3.setImageResource(R.mipmap.panks_off);
                youTubePlayer.loadVideo(YOUTUBE_VIDEO_ID_2);
                mVideoView.load(DAILYMOTION_VIDEO_ID_2);*/
            }
        });
        img3rel.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                flag = 3;
                struct = t.rt(arrayList_1.get(0), arrayList_1.get(1), arrayList_1.get(2), flag);
                img1.setImageResource(struct.img1);
                img2.setImageResource(struct.img2);
                img3.setImageResource(struct.img3);
                play_video(flag,youTubePlayer);
                /*img1.setImageResource(R.mipmap.sports_off);
                img2.setImageResource(R.mipmap.music_off);
                img3.setImageResource(R.mipmap.pranks_on);
                youTubePlayer.loadVideo(YOUTUBE_VIDEO_ID_3);
                mVideoView.load(DAILYMOTION_VIDEO_ID_3);*/
            }
        });
    }

    private void play_video(int flag,YouTubePlayer youTubePlayer)
    {
        String str;
        str = arrayList_2.get(flag-1);
        if(str.equals("sports"))
        {
            youTubePlayer.loadVideo(YOUTUBE_VIDEO_ID_1);
            mVideoView.load(DAILYMOTION_VIDEO_ID_1);
        }
        else if(str.equals("music"))
        {
            youTubePlayer.loadVideo(YOUTUBE_VIDEO_ID_2);
            mVideoView.load(DAILYMOTION_VIDEO_ID_2);
        }
        else if(str.equals("pranks"))
        {
            youTubePlayer.loadVideo(YOUTUBE_VIDEO_ID_3);
            mVideoView.load(DAILYMOTION_VIDEO_ID_3);
        }
        else if(str.equals("science"))
        {
            youTubePlayer.loadVideo(YOUTUBE_VIDEO_ID_4);
            mVideoView.load(DAILYMOTION_VIDEO_ID_4);
        }
        else
        {
            youTubePlayer.loadVideo(YOUTUBE_VIDEO_ID_5);
            mVideoView.load(DAILYMOTION_VIDEO_ID_5);
        }
    }


    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b)
    {
        if (!b)
        {
            /*if (flag == 1)
            {
                youTubePlayer.cueVideo(YOUTUBE_VIDEO_ID_1);
                //youTubePlayer.loadVideo(YOUTUBE_VIDEO_ID_1);
            }
            if (flag == 2)
            {
                youTubePlayer.cueVideo(YOUTUBE_VIDEO_ID_2);
                //youTubePlayer.loadVideo(YOUTUBE_VIDEO_ID_2);
            } else
            {
                //youTubePlayer.loadVideo(YOUTUBE_VIDEO_ID_3);
                youTubePlayer.cueVideo(YOUTUBE_VIDEO_ID_3);
            }*/
            play_video(2,youTubePlayer);
            youTubePlayer.pause();
        }
        this.youTubePlayer = youTubePlayer;
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult)
    {
        if (youTubeInitializationResult.isUserRecoverableError())
        {
            youTubeInitializationResult.getErrorDialog(this, RECOVERY_DIALOG_REQUEST).show();
        } else
        {
            String errorMessage = String.format("There was an error initializing the YouTube Player ");
            Toast.makeText(this, errorMessage, Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        if (requestCode == RECOVERY_DIALOG_REQUEST)
        {
            getYouTubePlayerProvider().initialize(DEVELOPER_KEY, this);
        }
        if (requestCode==1 && resultCode==RESULT_OK)
        {
            finish();
            Intent intent = getIntent();
            startActivity(intent);
        }
    }

    protected YouTubePlayer.Provider getYouTubePlayerProvider()
    {
        return (YouTubePlayerView) findViewById(R.id.youtubeplayerfragment);
    }

    private Member type(String str, int flag)
    {
        Member m = new Member();
        if (str.equals("sports"))
        {
            if (flag != 1)
            {
                m.val = R.mipmap.sports_off;
            } else
            {
                m.val = R.mipmap.sports_on;
            }
            m.str = "Sports";
        } else if (str.equals("music"))
        {
            if (flag != 1)
            {
                m.val = R.mipmap.music_off;
            } else
            {
                m.val = R.mipmap.music_on;
            }
            m.str = "Music";
        } else if (str.equals("pranks"))
        {
            if (flag != 1)
            {
                m.val = R.mipmap.panks_off;
            } else
            {
                m.val = R.mipmap.pranks_on;
            }
            m.str = "Pranks";
        } else if (str.equals("science"))
        {
            if (flag != 1)
            {
                m.val = R.mipmap.science_off;
            } else
            {
                m.val = R.mipmap.science_on;
            }
            m.str = "Science";
        } else
        {
            if (flag != 1)
            {
                m.val = R.mipmap.food_off;
            } else
            {
                m.val = R.mipmap.food_on;
            }
            m.str = "Food";
        }
        return m;
    }
}
