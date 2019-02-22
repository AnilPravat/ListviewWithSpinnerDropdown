package myapp.anilandroid.com.customspinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

import myapp.anilandroid.com.customspinner.adapter.Customadapter;
import myapp.anilandroid.com.customspinner.model.Countryitems;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Countryitems> countryitemsArrayList;
    private Customadapter customadapter;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );


        initList();
        spinner = (Spinner) findViewById( R.id.spinner_item );
        customadapter = new Customadapter( getApplicationContext(), countryitemsArrayList );
        spinner.setAdapter( customadapter );
        spinner.setOnItemSelectedListener( new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Countryitems clickeditem = (Countryitems) parent.getItemAtPosition( position );
                String clickedcountryname = clickeditem.getNames();
                Toast.makeText( MainActivity.this, clickedcountryname + "selected", Toast.LENGTH_LONG ).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        } );

    }

    private void initList() {

        countryitemsArrayList = new ArrayList<>();
        countryitemsArrayList.add( new Countryitems( R.drawable.india, "India", "Delhi" ) );
        countryitemsArrayList.add( new Countryitems( R.drawable.neatherland, "neatherland", "Amsterdam" ) );
        countryitemsArrayList.add( new Countryitems( R.drawable.newzeland, "Newzeland", "Wellington" ) );
        countryitemsArrayList.add( new Countryitems( R.drawable.srilanka, "Srilanka", "Colomba" ) );
        countryitemsArrayList.add( new Countryitems( R.drawable.australia, "Australia", "Canberra" ) );
        countryitemsArrayList.add( new Countryitems( R.drawable.uae, "UAE", "Abu Dhabi" ) );

    }


}
