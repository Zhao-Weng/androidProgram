package com.example.zweng4.booktracker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class checkListActivity extends AppCompatActivity {
    private ListView checkList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        checkList = (ListView) findViewById(R.id.list);
        Intent intent = getIntent();
        Map<String, String> map = (HashMap<String, String>)intent.getSerializableExtra("map");
        if (map != null ) {
                showCheckList(map);
        }
    }

    private void showCheckList(Map<String, String> map) {
        if (map != null && map.size() > 0) {
            List<String> entries = new ArrayList<>(map.values());
            String[] arr = new String[entries.size()];
            int i = 0;
            for (String name : entries) {
                arr[i++] = name;
            }
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.no_list_item, arr);
            checkList.setAdapter(adapter);
        }
        else {
            String[] notFound = new String[1];
            notFound[0] = new String("No Restaurant Found");

            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.no_list_item, notFound);
            checkList.setAdapter(adapter);
        }
    }
}
