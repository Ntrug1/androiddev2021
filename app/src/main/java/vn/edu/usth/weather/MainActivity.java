package vn.edu.usth.weather;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Death", "onCreate");

        PagerAdapter adapter = new Adapter(getSupportFragmentManager());
        ViewPager pager = findViewById(R.id.pager);
        pager.setOffscreenPageLimit(3);
        pager.setAdapter(adapter);


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Death", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Death", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Death", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Death","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Death", "onDestroy");
    }
}
