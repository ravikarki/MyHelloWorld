package com.example.ravi.myhelloworld;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class DisplayMessageActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_display_message);

        Intent intent=getIntent();

        String msg=intent.getStringExtra(MyActivity.EXTRA_MESSAGE);

        TextView tview=new TextView(this);

        tview.setTextSize(20);

//        tview.setTextColor(5);

        msg= getResources().getString(R.string.hello_world)+" \n I am alive... You must be "+msg;
        tview.setText(msg);

        setContentView(tview);
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
