package se.kth.csc.iprog.dinnerplanner.android;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.content.Intent;

import se.kth.csc.iprog.dinnerplanner.android.view.ExampleView;


public class MainActivity extends Activity implements OnClickListener{
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Default call to load previous state
        super.onCreate(savedInstanceState);

        // Set the view for the main activity screen
        // it must come before any call to findViewById method
        setContentView(R.layout.activity_main);

        // Creating the view class instance
        ExampleView mainView = new ExampleView(findViewById(R.id.this_is_example_view_id));

        button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        Intent i = new Intent(this, MainActivity2.class);
        startActivity(i);
        //button1.invalidate();
    }

}
