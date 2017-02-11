package com.example.zweng4.test_listview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class CustomListViewSearchOnButtonClick extends Activity
{
    EditText edittext;
    ListView listview;
    Button search;

    String[] text = { "One", "Two", "Three", "Four", "Five", "Six", "Seven",
            "Eight", "Nine", "Ten" };


    int textlength = 0;
    ArrayList<String> text_sort = new ArrayList<String>();


    public void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);


        listview = (ListView) findViewById(R.id.ListView01);
        listview.setAdapter(new MyCustomAdapter(text, image));




        listview.setAdapter(new MyCustomAdapter(text_sort));

    }

});

        }
