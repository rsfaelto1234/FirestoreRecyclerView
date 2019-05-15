package com.example.firestorecrud;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.firestorecrud.Fragment.AddEventFragment;
import com.example.firestorecrud.Fragment.ViewEventsFragment;

public class EventActivity extends AppCompatActivity {

    private FragmentManager fm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);

        Toolbar tb = findViewById(R.id.toolbar);
        setSupportActionBar(tb);
        tb.setSubtitle("La nueva experiencia en eventos");

        fm = getSupportFragmentManager();
        addEventFrgmt();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater  = getMenuInflater();
       // inflater.inflate(R.menu.menu, menu);
        menuInflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.ic_event:
                addEventFrgmt();
                return true;
            case R.id.ic_format:
                viewEventsFrgmt();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void addEventFrgmt(){
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.events_content, new AddEventFragment());
        ft.commit();
    }
    public void viewEventsFrgmt(){
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.events_content, new ViewEventsFragment());
        ft.commit();
    }
}
