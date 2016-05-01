package com.chapman.operationsaferide;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void makeRequest()
    {
        String name = ((EditText) findViewById(R.id.name_text)).getText().toString();
        String id = ((EditText) findViewById(R.id.id_text)).getText().toString();
        String numGuests = ((EditText) findViewById(R.id.guests_text)).getText().toString();
        String location = ((EditText) findViewById(R.id.location_text)).getText().toString();

        int i_id, i_numGuests = 0;
        try
        {
            i_id = Integer.parseInt(id);
            i_numGuests = Integer.parseInt(numGuests);
        }
        catch (Exception e)
        {
            System.out.println("Error converting to int.");
            return;
        }
        // Make chapman user
        ChapmanUser student = new ChapmanUser(name, i_id, i_numGuests, "waiting", location);
        String message = student.toString() + " is requesting a ride.";

        // send request to psafe (email here should be to psafe)
        EmailNotification request = new EmailNotification("operationsaferidechap@gmail.com");
        request.addNotification(message);
        request.sendNotification("Operation Safe Ride Request");
    }

    public void cancelRequest()
    {
        String name = ((EditText) findViewById(R.id.name_text)).getText().toString();
        String id = ((EditText) findViewById(R.id.id_text)).getText().toString();
        String numGuests = ((EditText) findViewById(R.id.guests_text)).getText().toString();
        String location = ((EditText) findViewById(R.id.location_text)).getText().toString();

        int i_id, i_numGuests = 0;
        try
        {
            i_id = Integer.parseInt(id);
            i_numGuests = Integer.parseInt(numGuests);
        }
        catch (Exception e)
        {
            System.out.println("Error converting to int.");
            return;
        }
        // Make chapman user
        ChapmanUser student = new ChapmanUser(name, i_id, i_numGuests, "canceling", location);
        String message = student.toString() + " is CANCELING their ride.";

        // send cancel request to psafe (email here should be to psafe)
        EmailNotification request = new EmailNotification("operationsaferidechap@gmail.com");
        request.addNotification(message);
        request.sendNotification("Operation Safe Ride CANCELATION");
    }
}
