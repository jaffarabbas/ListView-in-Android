package com.listviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView mylist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //take id from list view
        mylist = (ListView) findViewById(R.id.Listview);
        //array list for view
        ArrayList<String> list = new ArrayList<String>();
        list.add("apple");
        list.add("Banna");
        list.add("sdfsdf");
        list.add("sdfsdf3");
        list.add("sdfsdf2");
        //adapter for set ArrayList in the ListView
        ArrayAdapter<String> adapt = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,list);
        //set adapter to ArrayList
        mylist.setAdapter(adapt);
        //onclick view item detail
        mylist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override//type cast text view to view Original string------------------------------->|
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {// \|/
                String details = "Position : "+position+"\nId : "+id+"\nView : "+((TextView)view).getText().toString();
                Toast.makeText(MainActivity.this,details,Toast.LENGTH_LONG).show();
            }
        });
    }
}