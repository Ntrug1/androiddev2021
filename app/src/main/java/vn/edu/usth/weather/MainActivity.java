package vn.edu.usth.weather;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    MediaPlayer player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Death", "onCreate");

        PagerAdapter adapter = new Adapter(getSupportFragmentManager());
        ViewPager pager = findViewById(R.id.pager);
        pager.setOffscreenPageLimit(3);
        pager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab);
        tabLayout.setupWithViewPager(pager);
        player = MediaPlayer.create(this,R.raw.song);
    }

    @Override
    protected void onStart() {
        super.onStart();
        player.start();
        Log.i("Death", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        player.start();
        Log.i("Death", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        player.pause();
        Log.i("Death", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        player.stop();
        Log.i("Death","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        player.stop();
        Log.i("Death", "onDestroy");
    }
}
