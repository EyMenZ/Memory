package com.example.zalila.memory;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.jar.Attributes;


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

    public void clickTwoPlayers(View view){
        Toast.makeText(MainActivity.this, "Button Clicked", Toast.LENGTH_SHORT).show();
    }
    public void clickOnePlayer(View view) {
        Intent monIntent = new Intent(this, NameActivity.class);
        //monIntent.setAction(Intent.ACTION_CALL_BUTTON);
        startActivity(monIntent);

    }
    public void clickHighScores(View view){
        Toast.makeText(MainActivity.this, "High Score", Toast.LENGTH_SHORT).show();
    }
    public void clickExit(View view) {

    }
}
