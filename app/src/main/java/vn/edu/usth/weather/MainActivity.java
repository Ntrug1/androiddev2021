package vn.edu.usth.weather;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {
    //    MediaPlayer player;
    Toolbar toolbar;

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
//        player = MediaPlayer.create(this,R.raw.song);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.refresh:
                Toast.makeText(this, "Refreshing", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu:
                Intent intent = new Intent(this,PrefActivity.class);
                startActivity(intent);
                return true;
            default:
                super.onOptionsItemSelected(item);
        }
        return false;
    }

    @Override
    protected void onStart() {
        super.onStart();
//        player.start();
        Log.i("Death", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
//        player.start();
        Log.i("Death", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
//        player.pause();
        Log.i("Death", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
//        player.stop();
        Log.i("Death", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
//        player.stop();
        Log.i("Death", "onDestroy");
    }
}
