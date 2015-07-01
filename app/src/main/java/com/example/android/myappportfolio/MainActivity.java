package com.example.android.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    /**
     * Button handler(s) for the button(s)
     *
     * @param view
     * Don't undertand the bounds fully - 108 is a magic number
     * to get it to look like Udacity's screenshot
     *
     */
    public void onClickMediaStreamer(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),
                getResources().getString(R.string.media_streamer_toast),
                Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.TOP | Gravity.CENTER, 0, view.getBottom()+108);
        toast.show();
    }

    public void onClickSuperDuo1(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),
                getResources().getString(R.string.super_duo1_toast),
                Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.TOP | Gravity.CENTER, 0, view.getBottom()+108);
        toast.show();
    }

    public void onClickSuperDuo2(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),
                getResources().getString(R.string.super_duo2_toast),
                Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.TOP | Gravity.CENTER, 0, view.getBottom()+108);
        toast.show();
    }

    public void onClickAntTerminator(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),
                getResources().getString(R.string.ant_terminator_toast),
                Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.TOP | Gravity.CENTER, 0, view.getBottom()+108);
        toast.show();
    }

    public void onClickMaterialize(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),
                getResources().getString(R.string.materialize_toast),
                Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.TOP | Gravity.CENTER, 0, view.getBottom()+108);
        toast.show();
    }

    public void onClickCapstone(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),
                getResources().getString(R.string.capstone_toast),
                Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.TOP | Gravity.CENTER, 0, view.getBottom()+108);
        toast.show();
    }
}
