package com.example.trevorv.antsgomarching;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;


public class MainActivity extends Activity {

    private static final String TAG = "MainActivity";
    private static final String First_Section = "Ants go marching ";
    private static final String Second_Section = " by ";
    private static final String Third_Section = ". Hoorah! Hoorah!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] antCount = {"one","two","three","four","five","six","seven","eight","nine","ten"};

        for(String count : antCount){
            Log.d(TAG, First_Section +count +Second_Section +count +Third_Section);
        }

        for (int i = 0; i < 10; i++){
            Log.d(TAG, First_Section +antCount[i] +Second_Section +antCount[i] +Third_Section);
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
