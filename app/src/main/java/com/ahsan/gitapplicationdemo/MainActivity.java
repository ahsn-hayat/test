package com.ahsan.gitapplicationdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private FragmentOne fragmentOne;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentOne = new FragmentOne();

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.fragment_container, fragmentOne)
                .commit();
    }

    @Override
    protected void onResume() {
        Log.d("RESUMED", "onResume: ");
        super.onResume();
    }
}
