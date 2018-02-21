package com.hfad.beeradviser3;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ArrayAdapter;

import static android.R.attr.button;
import static android.R.id.text1;

public class BeerAdvMainActivity extends AppCompatActivity {
    TextView text1;
    Spinner spinner;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beer_adv_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //Можно задать массив строк спинеру на лету
        /*   ArrayAdapter<String> namesAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, getResources().getStringArray(R.array.arrBeerTypes));
            namesAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(namesAdapter);*/
        //--------------------

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        button2 = (Button) findViewById(R.id.button2);

        //Новый
        spinner = (Spinner) findViewById(R.id.spinner);
        text1 = (TextView) findViewById(R.id.text1);


        /*button2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                text1.setText(" onStart!!/");
                //ImageView iv = (ImageView) findViewById(R.id.imageview1);
                //iv.setVisibility(View.VISIBLE);

            }
        });*/


    }

    public void onClickButton(View v) {

        //text1.setText(spinner.getSelectedItemPosition() );//" onStart!!/"
       //20.02.1018
        text1.setText(" onStart!!/");//

        /*
        final int id = v.getId();
        switch (id) {
            case R.id.button2:

                // your code for button1 here
                break;
            case R.id.button2:
                // your code for button2 here
                break;
            // even more buttons here

        }*/
        /*switch (spinner.getSelectedItem()) {
            case R.string.:

                // your code for button1 here
                break;
            case R.id.button2:
                // your code for button2 here
                break;
            // even more buttons here
            */
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_beer_adv_main, menu);
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
