package vn.edu.usth.weather;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Death", "onCreate");

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

        ForecastFragment forecastFragment = new ForecastFragment();
        WeatherFragment weatherFragment = new WeatherFragment();

        ft.add(R.id.weather, weatherFragment,null);
        ft.add(R.id.forecast,forecastFragment,null);
        ft.commit();
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
